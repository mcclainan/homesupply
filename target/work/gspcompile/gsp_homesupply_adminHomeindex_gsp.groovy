import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_homesupply_adminHomeindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/adminHome/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',11,['code':("adminHome.index.title")],-1)
})
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',11,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',16,['code':("adminHome.index.heading")],-1)
printHtmlPart(5)
createTagBody(2, {->
invokeTag('message','g',21,['code':("button.item")],-1)
})
invokeTag('link','g',21,['controller':("adminItem"),'class':("button")],2)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',22,['code':("button.category")],-1)
})
invokeTag('link','g',22,['controller':("adminCategory"),'class':("button")],2)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',23,['code':("button.itemClass")],-1)
})
invokeTag('link','g',23,['controller':("adminItemClass"),'class':("button")],2)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',24,['code':("button.user")],-1)
})
invokeTag('link','g',24,['controller':("adminUser"),'class':("button")],2)
printHtmlPart(7)
})
invokeTag('captureBody','sitemesh',24,['class':("landing")],1)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1433513118000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
