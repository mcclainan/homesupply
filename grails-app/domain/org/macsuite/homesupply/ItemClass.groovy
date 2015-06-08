package org.macsuite.homesupply

class ItemClass {
    String name
    String description
    static hasMany = [categories:Category]
    static constraints = {
        name unique: true
        description nullable: true
    }
	static mapping = {
		sort "name"
        categories sort:'name'
	}
	public String toString(){
		name
	}
}
