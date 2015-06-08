package org.macsuite.homesupply

class User {

	transient springSecurityService

	String username
	String password
	String  email
	String  firstName
	String  lastName
	String  nicName
	boolean enabled = true
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired

	static transients = ['springSecurityService']


	static constraints = {
		username blank: false, unique: true
		password blank: false
		email nullable: true
		firstName nullable:true
		lastName nullable:true
		nicName nullable:true
	}

	static mapping = {
		table 'user_data'
		password column: '`password`'
	}

	Set<Role> getAuthorities() {
		UserRole.findAllByUser(this).collect { it.role }
	}

	def beforeInsert() {
		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
			encodePassword()
		}
	}

	protected void encodePassword() {
		password = springSecurityService?.passwordEncoder ? springSecurityService.encodePassword(password) : password
	}

	public String toString(){
		nicName?:firstName?:username
	}
}
