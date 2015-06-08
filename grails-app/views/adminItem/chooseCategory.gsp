<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 6/5/15
  Time: 4:37 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Admin -Choose Item Category</title>
</head>

<body>
<section id="main" class="container">
    <header>
        <h2>Choose Category</h2>
    </header>
    <div class="box">
        <g:render template="/templates/messageBlock"/>
        <g:form action="create">
            <div class="row uniform 50%">
                <div class="12u">
                    <g:select name="id" id="id"
                              from="${itemClass.categories}" noSelection="['null':'Choose Category']"
                              optionKey="id" optionValue="name"/>
                </div>
            </div>
            <div class="row uniform 50%">
                <div class="12u">
                    <ul class="actions">
                        <li><g:submitButton name="Create"/></li>
                    </ul>
                </div>
            </div>

        </g:form>
    </div>
</section>
</body>
</html>