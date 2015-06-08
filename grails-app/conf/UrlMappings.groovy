import grails.util.Holders
import org.apache.commons.lang.StringUtils

class UrlMappings {

    static mappings = {
        def app
        def adminControllers = []

        '/'(controller: 'home')

        '/'(controller: 'home')

        // default admin page
        '/admin'(controller: 'adminHome')
        '/exampleIndex'   (view: 'exampleIndex')
        '/exampleElements'(view: 'exampleElements')
        '/exampleGeneric' (view: 'exampleGeneric')
        '/exampleContact' (view: 'exampleContact')
        '/exampleShopping'(view: 'exampleShopping')

        // Populate the admin controllers
        Holders.grailsApplication.controllerClasses.findAll{ c -> c.logicalPropertyName.startsWith('admin') }.each { c ->
            String uriName = StringUtils.uncapitalize(c.logicalPropertyName.toString().replaceFirst('^admin', ''))
            "/admin/${uriName}/$action?/$id?"(controller: c.logicalPropertyName)
        }

        "/$controller/$action?/$id?" {
            constraints {
                controller(validator: {
                    ! it.startsWith('admin')
                });
            }
        }
    }
}
