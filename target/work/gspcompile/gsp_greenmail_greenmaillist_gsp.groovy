import com.icegreen.greenmail.util.GreenMailUtil
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='greenmail', version='1.3.4')
class gsp_greenmail_greenmaillist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/greenmail-1.3.4/grails-app/views/greenmail/list.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',18,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',18,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',28,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
loop:{
int i = 0
for( email in (list) ) {
printHtmlPart(7)
expressionOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(8)
expressionOut.print(i)
printHtmlPart(9)
expressionOut.print(email.sentDate)
printHtmlPart(9)
expressionOut.print(email.subject.encodeAsHTML())
printHtmlPart(9)
expressionOut.print(GreenMailUtil.getAddressList(email.getRecipients(javax.mail.Message.RecipientType.TO)))
printHtmlPart(10)
createClosureForHtmlPart(11, 3)
invokeTag('link','g',53,['action':("show"),'id':(i)],3)
printHtmlPart(12)
i++
}
}
printHtmlPart(13)
})
invokeTag('captureBody','sitemesh',63,[:],1)
printHtmlPart(1)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1330978438000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
