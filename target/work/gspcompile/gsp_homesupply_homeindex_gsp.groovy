import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_homesupply_homeindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/home/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("landing")],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',12,['code':("home.index.title")],-1)
})
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',12,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',17,['code':("home.index.heading")],-1)
printHtmlPart(5)
invokeTag('message','g',19,['code':("home.index.subheading")],-1)
printHtmlPart(6)
createClosureForHtmlPart(7, 2)
invokeTag('link','g',22,['controller':("request"),'class':("button")],2)
printHtmlPart(8)
invokeTag('message','g',31,['code':("home.index.requests.heading")],-1)
printHtmlPart(9)
invokeTag('message','g',39,['code':("home.index.foodItems.heading")],-1)
printHtmlPart(10)
for( foodItem in (foodItems) ) {
expressionOut.print(foodItem.name)
printHtmlPart(11)
}
printHtmlPart(12)
createTagBody(2, {->
invokeTag('message','g',44,['code':("home.index.button.request")],-1)
})
invokeTag('link','g',44,['controller':("request"),'class':("button alt")],2)
printHtmlPart(13)
invokeTag('message','g',51,['code':("home.index.nonFoodItems.heading")],-1)
printHtmlPart(14)
for( item in (nonFoodItems) ) {
expressionOut.print(item.name)
printHtmlPart(11)
}
printHtmlPart(15)
createTagBody(2, {->
invokeTag('message','g',56,['code':("home.index.button.request")],-1)
})
invokeTag('link','g',56,['controller':("request"),'class':("button alt")],2)
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',60,['class':("landing")],1)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1433551786000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
