<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 6/3/15
  Time: 1:38 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<section id="main" class="container">
    <header>
    </header>
    <section class="box">
        <h3>Edit Item Class</h3>
        <g:render template="/templates/messageBlock"/>
        <g:form action="update">
            <div class="row uniform 50%">
                <div class="12u">
                    <label for="name"><g:message code="itemClass.name.label"/></label>
                    <g:textField name="name" value="${command?.name}" placeholder="${message(code:"itemClass.name.label")}"/>
                </div>
            </div>
            <div class="row uniform 50%">
                <div class="12u">
                    <label for="description"><g:message code="itemClass.description.label"/></label>
                    <g:textArea name="description" value="${command?.description}" placeholder="${message(code:"itemClass.description.label")}" rows="6"/>
                </div>
            </div>
            <div class="row uniform">
                <div class="12u">
                    <ul class="actions">
                        <g:hiddenField name="id" value="${command.id}"/>
                        <li><g:submitButton class="special" name="Update"/></li>
                        <li><g:link action="show" id="${command.id}" class="button">Show item</g:link></li>
                        <li><g:link action="index" class="button">List</g:link></li>
                    </ul>
                </div>
            </div>
        </g:form>
    </section>
</section>
</body>
</html>