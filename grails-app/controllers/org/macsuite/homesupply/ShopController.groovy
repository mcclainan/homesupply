package org.macsuite.homesupply

import grails.plugin.springsecurity.SpringSecurityService
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_SHOPPER'])
class ShopController {

    SpringSecurityService springSecurityService

    def index() {
        List requestList = ItemRequest.withCriteria {
            eq("status","pending")
            order("dateCreated","desc")
            order("item","asc")
        }
        [requestList:requestList]
    }

    def purchase(){
        ItemRequest itemRequest = ItemRequest.get(params.id)
        itemRequest.status = "purchased"
        itemRequest.save()
        flash.message = "${itemRequest.item} purchased"
        redirect action:"index"
    }

    def reject(){
        ItemRequest itemRequest = ItemRequest.get(params.id)
        itemRequest.status = "rejected"
        itemRequest.shopper = User.get(springSecurityService.principal.properties.id.toLong())
        itemRequest.save()
        flash.message = "${itemRequest.item} rejected"
        redirect action:"index"
    }

}
