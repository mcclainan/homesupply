package org.macsuite.homesupply.admin

import grails.plugin.springsecurity.annotation.Secured
import org.macsuite.homesupply.ItemClass

@Secured(['ROLE_ADMIN'])
class AdminItemClassController {

    def index() {
        params.max = 10
        [itemClassInstanceList:ItemClass.listOrderByName(params),itemClassInstanceCount:ItemClass.count()]
    }

    def save(ItemClassCommand command){
        if(command.hasErrors()){
            render view: "index", model: [itemClassInstanceList:ItemClass.listOrderByName(max: 10),itemClassInstanceCount:ItemClass.count(),command:command]
            return
        }
        ItemClass itemClass = command.bind(new ItemClass())
        if(!itemClass.save(flush: true)){
            render view: "index", model: [itemClassInstanceList:ItemClass.listOrderByName(max: 10),itemClassInstanceCount:ItemClass.count(),command:itemClass]
            return
        }
        redirect action: "index"
    }
	
	def show(){
		ItemClass itemClass = ItemClass.get(params.id)
		if(!itemClass){
			flash.error = "No Item Class found with that id."
			redirect action:'index'
			return
		}
		params.max = 10
		[itemClassInstance:itemClass]
	}

    def edit(){
        ItemClass itemClass = ItemClass.get(params.id)
        if(!itemClass){
            flash.error = "Item Class not found"
            redirect action: 'index'
            return
        }
        ItemClassCommand command = new ItemClassCommand(itemClass)
        [command:command]
    }

    def update(ItemClassCommand command){
        if(command.hasErrors()){
            render view: 'edit', model: [command:command]
            return
        }
        ItemClass itemClass = command.bind(ItemClass.get(command.id))
        itemClass.save(flush: true)
        flash.message = "${itemClass.name} has been updated."
        redirect action: 'index'
    }

    def delete(){
        ItemClass itemClass = ItemClass.get(params.id)
        String name = itemClass.name
        if(!itemClass){
            flash.error = "Item Class not found"
        }
        else{
			try{
				itemClass.delete(flush: true)
				flash.message = "${name} has been deleted"
			}
			catch(Exception e){
				flash message = "${name} could not be deleted."
			}
        }
        redirect action: 'index'
    }
}
