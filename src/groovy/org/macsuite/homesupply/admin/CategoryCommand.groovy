package org.macsuite.homesupply.admin

import grails.validation.Validateable
import org.macsuite.homesupply.Category
import org.macsuite.homesupply.ItemClass

/**
 * Created by tony on 6/3/15.
 */

@Validateable
class CategoryCommand {
    Long   id
	ItemClass itemClass
    String name
    String description

    static constraints = {
		itemClass nullable:false, blank:false
        name nullable: false, blank: false
        description nullable: true, blank: true
        id nullable: true
    }

    public CategoryCommand(){}

    public CategoryCommand(Category category){
        id = category.id
		itemClass = category.itemClass
        name = category.name
        description = category.description
    }

    Category bind(Category category){
        category.name = name
		category.itemClass = itemClass
        category.description = description
        return category
    }
}
