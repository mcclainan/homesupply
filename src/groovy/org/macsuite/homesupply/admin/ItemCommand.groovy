package org.macsuite.homesupply.admin

import grails.validation.Validateable
import org.macsuite.homesupply.Category
import org.macsuite.homesupply.Item

/**
 * Created by tony on 6/4/15.
 */
@Validateable
class ItemCommand {
    String name
    String description
    Category category

    static constraints ={
        name blank: false
        category blank:false
    }

    ItemCommand(){}

    ItemCommand(Item item){
        name = item.name
        description = item.description
        category = item.category
    }

    Item bind(Item item){
        item.name = name
        item.description = description
        item.category = category
        return item
    }
}
