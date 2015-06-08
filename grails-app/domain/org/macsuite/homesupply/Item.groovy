package org.macsuite.homesupply

class Item {
    String name
    String description
    Boolean requested = false
    Boolean temporary = false

    static belongsTo = [category:Category]
    static hasMany = [itemRequests:ItemRequest]
    static constraints = {
        name unique: true
        requested nullable: true
        temporary nullable: true
        description nullable: true
    }

    static mapping = {
        sort "name"
    }

    static namedQueries = {
        inCategory{Category cat->
            eq 'category',cat
        }
        inItemClass{categories->
            'in'('category',categories)
        }
    }

	public String toString(){
		name
	}
}
