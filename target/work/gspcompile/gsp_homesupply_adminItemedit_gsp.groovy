import org.macsuite.homesupply.ItemClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_homesupply_adminItemedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/adminItem/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
createTagBody(2, {->
invokeTag('captureTitle','sitemesh',10,[:],-1)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',11,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',18,['code':("adminCategory.edit.form.heading")],-1)
printHtmlPart(5)
invokeTag('render','g',19,['template':("/templates/messageBlock")],-1)
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
invokeTag('select','g',25,['name':("itemClass"),'id':("itemClass"),'value':(command.itemClass.id),'from':(ItemClass.listOrderByName()),'noSelection':(['null':'Item Class']),'optionKey':("id"),'optionValue':("name")],-1)
printHtmlPart(8)
invokeTag('message','g',30,['code':("category.name.label")],-1)
printHtmlPart(9)
invokeTag('textField','g',32,['name':("name"),'value':(command?.name),'placeholder':(message(code:"category.name.label"))],-1)
printHtmlPart(10)
invokeTag('message','g',37,['code':("category.description.label")],-1)
printHtmlPart(9)
invokeTag('textArea','g',38,['name':("description"),'value':(command?.description),'placeholder':(message(code:"category.description.label")),'rows':("6")],-1)
printHtmlPart(11)
invokeTag('hiddenField','g',43,['name':("id"),'value':(command.id)],-1)
printHtmlPart(12)
invokeTag('submitButton','g',44,['name':("Update"),'class':("special")],-1)
printHtmlPart(13)
createClosureForHtmlPart(14, 3)
invokeTag('link','g',46,['action':("show"),'id':(command.id),'class':("button")],3)
printHtmlPart(13)
createClosureForHtmlPart(15, 3)
invokeTag('link','g',46,['action':("index"),'class':("button")],3)
printHtmlPart(16)
})
invokeTag('form','g',47,['action':("update")],2)
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',49,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1433465593000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
