package org.macsuite.homesupply

import grails.plugin.springsecurity.SpringSecurityService
import grails.plugin.springsecurity.annotation.Secured

@Secured(['IS_AUTHENTICATED_ANONYMOUSLY'])
class HomeController {
    SpringSecurityService springSecurityService
    def index() {

        def foodItems=Item.withCriteria {
            category{
                itemClass{
                    eq('name','Food')
                }
            }
            eq('requested',true)
        }
        def nonFoodItems=Item.withCriteria {
            category{
                itemClass{
                    ne('name','Food')
                }
            }
            eq('requested',true)
        }
        [foodItems:foodItems,nonFoodItems:nonFoodItems]
    }
}
