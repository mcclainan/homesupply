package org.macsuite.homesupply.admin

import grails.plugin.springsecurity.annotation.Secured
import org.macsuite.homesupply.Category

@Secured(['ROLE_ADMIN'])
class AdminCategoryController {

    def index() {
        params.max = 10
        [categoryInstanceList:Category.listOrderByItemClass(params),categoryInstanceCount:Category.count()]
    }

    def save(CategoryCommand command){
        session.itemClass=command.itemClass.id
        if(command.hasErrors()){
            render view: "index", model: [categoryInstanceList:Category.list(max: 10),categoryInstanceCount:Category.count(),command:command]
            return
        }
        Category category = command.bind(new Category())
        if(!category.save(flush: true)){
            render view: "index", model: [categoryInstanceList:Category.list(max: 10),categoryInstanceCount:Category.count(),command:category]
            return
        }
        redirect action: "index"
    }

    def show(){
        Category category = Category.get(params.id)
        if(!category){
            flash.error = "Category not found"
            redirect action: 'index'
            return
        }
        [category:category]
    }

    def edit(){
        Category category = Category.get(params.id)
        if(!category){
            flash.error = "Category not found"
            redirect action: 'index'
            return
        }
        CategoryCommand command = new CategoryCommand(category)
        [command:command]
    }

    def update(CategoryCommand command){
        if(command.hasErrors()){
            render view: 'edit', model: [command:command]
            return
        }
        Category category = command.bind(Category.get(command.id))
        category.save(flush: true)
        flash.message = "${category.name} has been updated."
        redirect action: 'index'
    }

    def delete(){
        Category category = Category.get(params.id)
        String name = category.name
        if(!category){
            flash.error = "Category not found"
        }
        else{
            category.delete(flush: true)
            flash.message = "${name} has been deleted"
        }
        redirect action: 'index'
    }
}
