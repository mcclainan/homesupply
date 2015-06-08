package org.macsuite.homesupply

import grails.plugin.springsecurity.SpringSecurityService
import grails.plugin.springsecurity.annotation.Secured
import org.macsuite.homesupply.admin.ItemCommand

@Secured(['ROLE_HOME_SUPPLY_USER'])
class RequestController {
    SpringSecurityService springSecurityService
    String msg
    def index() {
        [itemClassList:ItemClass.list()]
    }

    def request(){
        Category category = Category.get(params.id)
        [category:category]
    }

    def executeRequest(){
        Item item = Item.get(params.id)
        User user = User.get(springSecurityService.principal.properties.id.toLong())
        new ItemRequest(item: item, user:user, status: 'pending').save(flush: true)
        flash.message = "${item} has been requested."
        redirect(action: "request", id: item.category.id)
    }

    def create(){
        Category category = Category.get(params.id)
        if(!category){
            flash.message = "The category with id:${params.id} could not be found"
            redirect "index"
            return
        }
        [command:new ItemCommand(category:category)]
    }

    def save(ItemCommand command){
        if(command.hasErrors()){
            render view: "create", model: [command:command]
            return
        }
        Item item = command.bind(new Item())
        item.temporary=true
        if(!item.save(flush: true)){
            render view: "create", model: [command:item]
            return
        }
        ItemRequest itemRequest = new ItemRequest(user:User.get(springSecurityService.principal.properties.id.toLong()), item: item, status: 'pending')
        if(!itemRequest.save(flush: true)){
            render view: "create", model: [command:item,bean:itemRequest]
            return
        }
        flash.message = "New item ${item} has been created."
        redirect action: "request", id: command.category.id
    }
}
