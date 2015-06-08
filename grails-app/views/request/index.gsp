<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 6/5/15
  Time: 7:11 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title><g:message code="request.index.title"/></title>
</head>

<body>
    <section class="container" id="main">
        <header class="major">
            <h2><g:message code="request.index.heading"/></h2>
            <p><g:message code="request.index.subheading"/></p>
        </header>
        <div class="box">
            <g:render template="/templates/messageBlock"/>
            <g:each in="${itemClassList}" var="itemClass">
                <h3>${itemClass}</h3>
                <ul class="actions">
                    <g:each in="${itemClass.categories}" var="category">
                        <li><g:link action="request" id="${category.id}" class="button">${category}</g:link></li>
                    </g:each>
                </ul>
                <br/><br/>
            </g:each>
        </div>
    </section>
</body>
</html>