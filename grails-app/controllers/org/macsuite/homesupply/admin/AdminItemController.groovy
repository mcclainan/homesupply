package org.macsuite.homesupply.admin

import grails.plugin.springsecurity.annotation.Secured
import org.macsuite.homesupply.Category
import org.macsuite.homesupply.Item
import org.macsuite.homesupply.ItemClass

@Secured(['ROLE_ADMIN'])
class AdminItemController {

    def index() {
        params.max = 10
        [itemList:Item.listOrderByCategory(params),itemListCount:Item.count()]
    }

    def listByCategory(){
        Category category = Category.get(params.id)
        if(!category){
            flash.error = "Category not found"
            redirect action: "index"
            return
        }
        params.max = 10
        render view: "index", model:[itemList: Item.inCategory(category).list(params), itemListCount: Item.inCategory.count(),id:prarams.id]
    }
    def listByItemClass(){
        ItemClass itemClass = ItemClass.get(params.id)
        List itemList = []
        if(!itemClass){
            flash.error = "Item Class not found"
            redirect action: "index"
            return
        }
        itemClass.categories{Category category->
            category.items.each{Item item->
                itemList<<item
            }
        }
        params.max = 10
        render view: "index", model:[itemList: itemList, itemListCount: Item.inItemClass.count(),id:prarams.id]
    }

	def chooseCategory(){
		ItemClass itemClass = ItemClass.get(params.id)
        if(!itemClass){
            flash.error = "Item Class not found"
            redirect action: 'index'
            return
        }
		[itemClass:itemClass]
	}

    def create(){
        Category category = Category.get(params.id)
        if(!category){
            flash.error = "Category not found"
            redirect action: 'index'
            return
        }
        ItemCommand command = new ItemCommand(category:category)
        [command:command]
    }

    def save(ItemCommand command){
        if(command.hasErrors()){
            render view: "create", model: [command:command]
            return
        }
        Item item = command.bind(new Item())
        if(!item.save(flush: true)){
            render view: "create", model: [command:item]
            return
        }
        flash.message = "New item ${item} has been created."
        redirect action: "index"
    }

    def show(){
        Item item = Item.get(params.id)
        if(!item){
            flash.error = "Item not found"
            redirect action: 'index'
            return
        }
        [item:item]
    }

    def edit(){
        Item item = Item.get(params.id)
        if(!item){
            flash.error = "Item not found"
            redirect action: 'index'
            return
        }
        ItemCommand command = new ItemCommand(item)
        [command:command]
    }

    def update(ItemCommand command){
        if(command.hasErrors()){
            render view: 'edit', model: [command:command]
            return
        }
        Item item = command.bind(Item.get(command.id))
        item.save(flush: true)
        flash.message = "${item.name} has been updated."
        redirect action: 'index'
    }

    def delete(){
        Item item = Item.get(params.id)
        String name = item.name
        if(!item){
            flash.error = "Item not found"
        }
        else{
            item.delete(flush: true)
            flash.message = "${name} has been deleted"
        }
        redirect action: 'index'
    }
}
