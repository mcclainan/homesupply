<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 6/3/15
  Time: 7:38 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title><g:message code="adminHome.index.title"/></title>
</head>

<body class="landing">
<div id="page-wrapper">
    <!-- Banner -->
    <section id="banner">
        <h2><g:message code="adminHome.index.heading"/></h2>
        <p>Manage Mac Home Supply</p>
        <ul class="actions">
            <li><g:link controller="adminItem" class="button"><g:message code="button.user"/></g:link></li>
            <li><g:link controller="adminCategory" class="button"><g:message code="button.category"/></g:link></li>
            <li><g:link controller="adminItemClass" class="button"><g:message code="button.itemClass"/></g:link></li>
            <li><g:link controller="adminUser" class="button"><g:message code="button.user"/></g:link></li>
        </ul>
    </section>
</div>
</body>