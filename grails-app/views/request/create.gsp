<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 6/5/15
  Time: 4:41 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Create Request Item</title>
</head>

<body>
<section id="main" class="container">
    <header>
        <h2>Create Request Item</h2>
    </header>
    <div class="box">
        <g:render template="/templates/messageBlock"/>
        <g:form action="save">
            <div class="row uniform 50%">
                <div class="12u">
                    <label for="name">Name</label>
                    <g:textField name="name" value="${command.name}"/>
                </div>
            </div>
            <div class="row uniform 50%">
                <div class="12u">
                    <label for="description">Description</label>
                    <g:textArea name="description" value="${command.description}" rows="6"/>
                </div>
            </div>
            <div class="row uniform 50%">
                <div class="12u">
                    <ul class="actions">
                        <g:hiddenField name="category" value="${command?.category.id}"/>
                        <li><g:submitButton name="Save"/></li>
                    </ul>
                </div>
            </div>
        </g:form>
    </div>
</section>
</body>
</html>