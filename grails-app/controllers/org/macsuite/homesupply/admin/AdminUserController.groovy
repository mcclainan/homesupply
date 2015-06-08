package org.macsuite.homesupply.admin

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN'])
class AdminUserController {

    def index() {
        redirect(url:'http://www.macsuite.org/usermanagement')
    }
}
