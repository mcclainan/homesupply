package org.macsuite.homesupply

class Category {
    String name
    String description
    static belongsTo = [itemClass:ItemClass]
    static hasMany = [items:Item]
    static constraints = {
        name unique: true
        description nullable: true
    }
	static mapping = {
		sort "name"
		itemClass sort:"name"
	}
	public String toString(){
		name
	}
	
}
