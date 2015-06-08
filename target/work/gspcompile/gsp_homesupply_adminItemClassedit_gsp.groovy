import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_homesupply_adminItemClassedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/adminItemClass/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
createTagBody(2, {->
invokeTag('captureTitle','sitemesh',10,[:],-1)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',11,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('render','g',19,['template':("/templates/messageBlock")],-1)
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('message','g',23,['code':("itemClass.name.label")],-1)
printHtmlPart(7)
invokeTag('textField','g',25,['name':("name"),'value':(command?.name),'placeholder':(message(code:"itemClass.name.label"))],-1)
printHtmlPart(8)
invokeTag('message','g',30,['code':("itemClass.description.label")],-1)
printHtmlPart(7)
invokeTag('textArea','g',31,['name':("description"),'value':(command?.description),'placeholder':(message(code:"itemClass.description.label")),'rows':("6")],-1)
printHtmlPart(9)
invokeTag('hiddenField','g',36,['name':("id"),'value':(command.id)],-1)
printHtmlPart(10)
invokeTag('submitButton','g',37,['class':("special"),'name':("Update")],-1)
printHtmlPart(11)
createClosureForHtmlPart(12, 3)
invokeTag('link','g',39,['action':("show"),'id':(command.id),'class':("button")],3)
printHtmlPart(11)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',39,['action':("index"),'class':("button")],3)
printHtmlPart(14)
})
invokeTag('form','g',40,['action':("update")],2)
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',42,[:],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1433463002000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
