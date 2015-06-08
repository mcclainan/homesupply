import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_homesupply_adminItemClassshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/adminItemClass/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',5,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
expressionOut.print(itemClassInstance.name)
printHtmlPart(6)
invokeTag('render','g',20,['template':("/templates/messageBlock")],-1)
printHtmlPart(7)
invokeTag('textArea','g',23,['name':("description"),'value':(itemClassInstance?.description),'placeholder':(message(code:"itemClass.description.label")),'rows':("6"),'disabled':("disabled")],-1)
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',29,['action':("edit"),'id':(itemClassInstance.id),'class':("button special")],2)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',30,['action':("index"),'class':("button")],2)
printHtmlPart(10)
createClosureForHtmlPart(12, 2)
invokeTag('link','g',31,['action':("delete"),'id':(itemClassInstance.id),'class':("button alt"),'onclick':("return confirm('${message(code: 'button.delete.confirm', default: 'Are you sure?')}');")],2)
printHtmlPart(13)
expressionOut.print(itemClassInstance.name)
printHtmlPart(14)
for( category in (itemClassInstance.categories) ) {
printHtmlPart(15)
expressionOut.print(category.name)
printHtmlPart(16)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',52,['controller':("adminCategory"),'action':("show"),'id':(category.id),'class':("button small special")],3)
printHtmlPart(18)
}
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',59,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1433464249000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
