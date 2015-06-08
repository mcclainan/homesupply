<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 6/2/15
  Time: 2:36 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="landing">
    <title><g:message code="home.index.title"/></title>
</head>

<body class="landing">
<div id="page-wrapper">
    <!-- Banner -->
    <section id="banner">
        <h2><g:message code="home.index.heading"/></h2>
        <p><g:message code="home.index.subheading"/></p>
        <ul class="actions">
            <li><a href="#main" class="button special">View Requests</a></li>
            <li><g:link controller="request" class="button">Make Request</g:link></li>
        </ul>
    </section>

    <!-- Main -->
    <section id="main" class="container">

        <section class="box special">
            <header class="major">
                <h2><g:message code="home.index.requests.heading"/></h2>
            </header>
        </section>

        <div class="row">
            <div class="6u 12u(narrower)">

                <section class="box special">
                    <h3><g:message code="home.index.foodItems.heading"/></h3>
                <pre><g:each in="${foodItems}" var="foodItem">${foodItem.name}<br/></g:each>
                </pre>
                    <ul class="actions">
                        <li><g:link controller="request" class="button alt"><g:message code="home.index.button.request"/></g:link></li>
                    </ul>
                </section>

            </div>
            <div class="6u 12u(narrower)">

                <section class="box special">
                    <h3><g:message code="home.index.nonFoodItems.heading"/></h3>
                    <pre><g:each in="${nonFoodItems}" var="item">${item.name}<br/></g:each>
                    </pre>
                    <ul class="actions">
                        <li><g:link controller="request" class="button alt"><g:message code="home.index.button.request"/></g:link></li>
                    </ul>
                </section>

            </div>
        </div>

    </section>

    </section>
</div>
</body>