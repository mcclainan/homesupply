import org.macsuite.homesupply.ItemClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_homesupply_adminCategoryshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/adminCategory/show.gsp" }
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
invokeTag('message','g',5,['code':("adminCategory.index.title")],-1)
})
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(category.name)
printHtmlPart(5)
expressionOut.print(category.itemClass)
printHtmlPart(6)
invokeTag('textArea','g',29,['name':("description"),'value':(category?.description),'placeholder':(message(code:"category.description.label")),'rows':("6"),'disabled':("disabled")],-1)
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('link','g',37,['action':("edit"),'id':(category.id),'class':("button special")],2)
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',38,['action':("index"),'class':("button")],2)
printHtmlPart(9)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',39,['action':("delete"),'id':(category.id),'class':("button alt"),'onclick':("return confirm('${message(code: 'button.delete.confirm', default: 'Are you sure?')}');")],2)
printHtmlPart(12)
expressionOut.print(category)
printHtmlPart(13)
for( item in (category.items) ) {
printHtmlPart(14)
expressionOut.print(item.name)
printHtmlPart(15)
createClosureForHtmlPart(16, 3)
invokeTag('link','g',62,['controller':("adminItem"),'action':("show"),'id':(item.id),'class':("button small special")],3)
printHtmlPart(17)
}
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',72,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1433465696000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
