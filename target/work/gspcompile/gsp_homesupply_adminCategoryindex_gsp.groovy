import org.macsuite.homesupply.ItemClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_homesupply_adminCategoryindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/adminCategory/index.gsp" }
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
createTagBody(3, {->
invokeTag('message','g',11,['code':("adminCategory.index.title")],-1)
})
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',11,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',17,['code':("adminCategory.index.heading")],-1)
printHtmlPart(5)
for( category in (categoryInstanceList) ) {
printHtmlPart(6)
expressionOut.print(category.itemClass.name)
printHtmlPart(7)
expressionOut.print(category.name)
printHtmlPart(7)
createClosureForHtmlPart(8, 3)
invokeTag('link','g',40,['action':("show"),'id':(category.id),'class':("button small special")],3)
printHtmlPart(9)
}
printHtmlPart(10)
invokeTag('paginate','g',48,['total':(categoryInstanceCount),'prev':(raw("<")),'next':(raw(">")),'maxsteps':("5")],-1)
printHtmlPart(11)
invokeTag('render','g',61,['template':("/templates/messageBlock")],-1)
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(13)
invokeTag('select','g',67,['name':("itemClass"),'id':("itemClass"),'value':(session.itemClass),'from':(ItemClass.listOrderByName()),'noSelection':(['null':'Choose an Item Class']),'optionKey':("id"),'optionValue':("name")],-1)
printHtmlPart(14)
invokeTag('textField','g',73,['name':("name"),'value':(command?.name),'placeholder':(message(code:"category.name.label"))],-1)
printHtmlPart(15)
invokeTag('textArea','g',78,['name':("description"),'value':(command?.description),'placeholder':(message(code:"category.description.label")),'rows':("6")],-1)
printHtmlPart(16)
invokeTag('submitButton','g',83,['name':("Create")],-1)
printHtmlPart(17)
})
invokeTag('form','g',85,['action':("save")],2)
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',89,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1433698760000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
