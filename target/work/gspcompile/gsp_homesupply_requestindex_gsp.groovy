import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_homesupply_requestindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/request/index.gsp" }
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
invokeTag('message','g',11,['code':("request.index.title")],-1)
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
invokeTag('message','g',16,['code':("request.index.heading")],-1)
printHtmlPart(5)
invokeTag('message','g',17,['code':("request.index.subheading")],-1)
printHtmlPart(6)
invokeTag('render','g',20,['template':("/templates/messageBlock")],-1)
printHtmlPart(7)
for( itemClass in (itemClassList) ) {
printHtmlPart(8)
expressionOut.print(itemClass)
printHtmlPart(9)
for( category in (itemClass.categories) ) {
printHtmlPart(10)
createTagBody(4, {->
expressionOut.print(category)
})
invokeTag('link','g',26,['action':("request"),'id':(category.id),'class':("button")],4)
printHtmlPart(11)
}
printHtmlPart(12)
}
printHtmlPart(13)
})
invokeTag('captureBody','sitemesh',29,[:],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1433595018000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
