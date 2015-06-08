import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_homesupplyexampleContact_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/exampleContact.gsp" }
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
createTagBody(2, {->
printHtmlPart(5)
invokeTag('textField','g',27,['name':("name"),'id':("name"),'value':(""),'placeholder':("Name")],-1)
printHtmlPart(6)
invokeTag('textField','g',30,['type':("email"),'name':("email"),'id':("email"),'value':(""),'placeholder':("Email")],-1)
printHtmlPart(7)
invokeTag('select','g',35,['name':("subject"),'id':("subject"),'value':(""),'from':(['option1','option2','option3','option4'])],-1)
printHtmlPart(7)
invokeTag('textArea','g',40,['name':("message"),'id':("message"),'placeholder':("Enter your message"),'rows':("6")],-1)
printHtmlPart(8)
invokeTag('submitButton','g',45,['name':("Send Message")],-1)
printHtmlPart(9)
})
invokeTag('form','g',47,['controller':("home"),'action':("index")],2)
printHtmlPart(10)
})
invokeTag('captureBody','sitemesh',49,[:],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1433280985000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
