import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_homesupply_layoutslanding_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/landing.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',8,['default':("Mac Home Supply")],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("viewport"),'content':("width=device-width, initial-scale=1")],-1)
printHtmlPart(2)
expressionOut.print(resource(dir: "assets/js/ie", file: "html5shiv.js"))
printHtmlPart(3)
expressionOut.print(resource(dir: "assets/css", file: "main.css"))
printHtmlPart(4)
expressionOut.print(resource(dir: "css", file: "pagination.css"))
printHtmlPart(5)
expressionOut.print(resource(dir:"assets/css",file: "ie8.css"))
printHtmlPart(6)
invokeTag('layoutHead','g',14,[:],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',15,[:],-1)
printHtmlPart(7)
})
invokeTag('captureHead','sitemesh',16,[:],1)
printHtmlPart(8)
createTagBody(1, {->
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',23,['uri':("/")],2)
printHtmlPart(11)
createClosureForHtmlPart(12, 2)
invokeTag('link','g',26,['uri':("/")],2)
printHtmlPart(13)
createTagBody(2, {->
printHtmlPart(14)
createClosureForHtmlPart(15, 3)
invokeTag('link','g',28,['controller':("request")],3)
printHtmlPart(13)
})
invokeTag('ifAnyGranted','sec',29,['roles':("ROLE_HOME_SUPPLY_USER")],2)
printHtmlPart(16)
createTagBody(2, {->
printHtmlPart(14)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',31,['controller':("shop")],3)
printHtmlPart(13)
})
invokeTag('ifAnyGranted','sec',32,['roles':("ROLE_SHOPPER")],2)
printHtmlPart(18)
createTagBody(2, {->
printHtmlPart(19)
createClosureForHtmlPart(20, 3)
invokeTag('link','g',35,['controller':("adminHome"),'class':("icon fa-angle-down")],3)
printHtmlPart(21)
createClosureForHtmlPart(22, 3)
invokeTag('link','g',37,['controller':("adminItem")],3)
printHtmlPart(23)
createClosureForHtmlPart(24, 3)
invokeTag('link','g',38,['controller':("adminCategory")],3)
printHtmlPart(23)
createClosureForHtmlPart(25, 3)
invokeTag('link','g',39,['controller':("adminItemClass")],3)
printHtmlPart(23)
createClosureForHtmlPart(26, 3)
invokeTag('link','g',40,['controller':("adminUser"),'target':("_blank")],3)
printHtmlPart(27)
createClosureForHtmlPart(28, 3)
invokeTag('link','g',46,['uri':("/exampleContact")],3)
printHtmlPart(23)
createClosureForHtmlPart(29, 3)
invokeTag('link','g',47,['uri':("/exampleElements")],3)
printHtmlPart(23)
createClosureForHtmlPart(30, 3)
invokeTag('link','g',48,['uri':("/exampleGeneric")],3)
printHtmlPart(23)
createClosureForHtmlPart(31, 3)
invokeTag('link','g',49,['uri':("/exampleIndex")],3)
printHtmlPart(32)
})
invokeTag('ifAnyGranted','sec',52,['roles':("ROLE_ADMIN")],2)
printHtmlPart(18)
createTagBody(2, {->
printHtmlPart(14)
createClosureForHtmlPart(33, 3)
invokeTag('link','g',54,['controller':("logout"),'class':("button")],3)
printHtmlPart(13)
})
invokeTag('ifLoggedIn','sec',55,[:],2)
printHtmlPart(18)
createTagBody(2, {->
printHtmlPart(14)
createClosureForHtmlPart(34, 3)
invokeTag('link','g',57,['controller':("login"),'class':("button")],3)
printHtmlPart(13)
})
invokeTag('ifNotLoggedIn','sec',58,[:],2)
printHtmlPart(35)
invokeTag('layoutBody','g',63,[:],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',64,[:],-1)
printHtmlPart(36)
expressionOut.print(resource(dir:"assets/js", file: "jquery.min.js"))
printHtmlPart(37)
expressionOut.print(resource(dir:"assets/js", file: "jquery.dropotron.min.js"))
printHtmlPart(37)
expressionOut.print(resource(dir:"assets/js", file: "jquery.scrollgress.min.js"))
printHtmlPart(37)
expressionOut.print(resource(dir:"assets/js", file: "skel.min.js"))
printHtmlPart(37)
expressionOut.print(resource(dir:"assets/js", file: "util.js"))
printHtmlPart(38)
expressionOut.print(resource(dir:"assets/js/ie", file: "respond.min.js"))
printHtmlPart(39)
expressionOut.print(resource(dir:"assets/js", file: "main.js"))
printHtmlPart(40)
})
invokeTag('captureBody','sitemesh',82,['class':("landing")],1)
printHtmlPart(41)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1433599138000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
