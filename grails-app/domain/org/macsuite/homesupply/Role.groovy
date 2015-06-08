package org.macsuite.homesupply

class Role {

	String authority

	static mapping = {
		cache true
		table "role_data"
	}

	static constraints = {
		authority blank: false, unique: true
	}
}
