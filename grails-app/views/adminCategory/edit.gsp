<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 6/3/15
  Time: 1:38 PM
--%>
<%@ page import="org.macsuite.homesupply.ItemClass" %>
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
        <h3><g:message code="adminCategory.edit.form.heading"/></h3>
        <g:render template="/templates/messageBlock"/>
        <g:form action="update">
            <div class="row uniform 50%">
                <div class="12u">
                    <g:select name="itemClass" id="itemClass" value="${command.itemClass.id}"
                              from="${ItemClass.listOrderByName()}" noSelection="['null':'Item Class']"
                              optionKey="id" optionValue="name"/>
                </div>
            </div>
            <div class="row uniform 50%">
                <div class="12u">
                    <label for="name"><g:message code="category.name.label"/></label>
                    <g:textField name="name" value="${command?.name}" placeholder="${message(code:"category.name.label")}"/>
                </div>
            </div>
            <div class="row uniform 50%">
                <div class="12u">
                    <label for="description"><g:message code="category.description.label"/></label>
                    <g:textArea name="description" value="${command?.description}" placeholder="${message(code:"category.description.label")}" rows="6"/>
                </div>
            </div>
            <div class="row uniform">
                <div class="12u">
                    <ul class="actions">
                        <g:hiddenField name="id" value="${command.id}"/>
                        <li><g:submitButton name="Update" class="special"/></li>
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