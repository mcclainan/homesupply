import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_homesupply_layoutsglobal_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/global.gsp" }
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
invokeTag('link','g',29,['controller':("adminHome")],3)
printHtmlPart(16)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',31,['controller':("adminItem")],3)
printHtmlPart(18)
createClosureForHtmlPart(19, 3)
invokeTag('link','g',32,['controller':("adminCategory")],3)
printHtmlPart(18)
createClosureForHtmlPart(20, 3)
invokeTag('link','g',33,['controller':("adminItemClass")],3)
printHtmlPart(18)
createClosureForHtmlPart(21, 3)
invokeTag('link','g',34,['controller':("adminUser"),'target':("_blank")],3)
printHtmlPart(22)
})
invokeTag('ifAnyGranted','sec',37,['roles':("ROLE_ADMIN")],2)
printHtmlPart(23)
createTagBody(2, {->
printHtmlPart(24)
createClosureForHtmlPart(25, 3)
invokeTag('link','g',39,['controller':("logout"),'class':("button")],3)
printHtmlPart(13)
})
invokeTag('ifLoggedIn','sec',40,[:],2)
printHtmlPart(23)
createTagBody(2, {->
printHtmlPart(24)
createClosureForHtmlPart(26, 3)
invokeTag('link','g',42,['controller':("login"),'class':("button")],3)
printHtmlPart(13)
})
invokeTag('ifNotLoggedIn','sec',43,[:],2)
printHtmlPart(27)
invokeTag('layoutBody','g',48,[:],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',49,[:],-1)
printHtmlPart(28)
expressionOut.print(resource(dir:"assets/js", file: "jquery.min.js"))
printHtmlPart(29)
expressionOut.print(resource(dir:"assets/js", file: "jquery.dropotron.min.js"))
printHtmlPart(29)
expressionOut.print(resource(dir:"assets/js", file: "jquery.scrollgress.min.js"))
printHtmlPart(29)
expressionOut.print(resource(dir:"assets/js", file: "skel.min.js"))
printHtmlPart(29)
expressionOut.print(resource(dir:"assets/js", file: "util.js"))
printHtmlPart(30)
expressionOut.print(resource(dir:"assets/js/ie", file: "respond.min.js"))
printHtmlPart(31)
expressionOut.print(resource(dir:"assets/js", file: "main.js"))
printHtmlPart(32)
})
invokeTag('captureBody','sitemesh',67,[:],1)
printHtmlPart(33)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1433546711000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
