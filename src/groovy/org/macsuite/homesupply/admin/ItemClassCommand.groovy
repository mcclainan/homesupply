package org.macsuite.homesupply.admin

import grails.validation.Validateable
import org.macsuite.homesupply.ItemClass

/**
 * Created by tony on 6/3/15.
 */

@Validateable
class ItemClassCommand {
    Long   id
    String name
    String description

    static constraints = {
        name nullable: false, blank: false
        description nullable: true, blank: true
        id nullable: true
    }

    public ItemClassCommand(){}

    public ItemClassCommand(ItemClass itemClass){
        id = itemClass.id
        name = itemClass.name
        description = itemClass.description
    }

    ItemClass bind(ItemClass itemClass){
        itemClass.name = name
        itemClass.description = description
        return itemClass
    }
}
