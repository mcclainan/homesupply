<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 6/3/15
  Time: 8:52 AM
--%>
<%@ page import="org.macsuite.homesupply.ItemClass" %>
<%@ page import="org.macsuite.homesupply.Category" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title><g:message code="adminItem.index.title"/></title>
</head>

<body>
<div id="page-wrapper">
    <!-- Main -->
    <section id="main" class="container">
        <header>
            <h2><g:message code="adminItem.index.heading"/></h2>
        </header>
    <div class="row">
        <div class="6u 12u(narrower)">

            <section class="box special">
                <h3>List${listType}</h3>
                <div class="table-wrapper">
                    <table class="alt">
                        <thead>
                        <tr>
                            <th>Category</th>
                            <th>Name</th>
                            <th>Show</th>
                        </tr>
                        </thead>
                            <tbody>
                                <g:each in="${itemList}" var="item">
                                    <tr>
                                    	<td>${item.category.name}</td>
                                        <td>${item.name}</td>
                                        <td><g:link action="show" id="${item.id}" class="button small special">Show</g:link> </td>
                                    </tr>
                                </g:each>
                            </tbody>
                        <tfoot>
                        <tr>
                            <td colspan="3">
                                <div class="pagination">
                                    <g:paginate action="${params.action}" id="${params.id}" total="${itemListCount}" prev="${raw("<")}" next="${raw(">")}" maxsteps="5"/>
                                </div>
                            </td>
                        </tr>
                        </tfoot>
                    </table>
                </div>
            </section>

        </div>
        <div class="6u 12u(narrower)">

            <section class="box special">
                <h3><g:message code="adminItem.index.category.options.heading"/></h3>
                <g:render template="/templates/messageBlock"/>
                <g:form action="listByCategory">
                	<div class="row uniform 50%">
                        <div class="12u">
                        	<g:select name="id" id="id" 
                        	          from="${Category.listOrderByName()}" noSelection="['null':'Choose Category']"
                        	          optionKey="id" optionValue="name"/> 
                        </div>
                    </div>
                    <div class="row uniform 50%">
                        <div class="12u">
                            <ul class="actions">
                                <li><g:submitButton name="${message(code:'adminItem.index.list')}"/></li>
                                <li><g:actionSubmit action="create" value="${message(code:'adminItem.index.create')}"/></li>
                            </ul>
                        </div>
                    </div>
                    
                </g:form>    
                <h3><g:message code="adminItem.index.itemClass.options.heading"/></h3>
                <g:form action="listByItemClass">
                	<div class="row uniform 50%">
                        <div class="12u">
                        	<g:select name="id" id="id"
                        	          from="${ItemClass.listOrderByName()}" noSelection="['null':'Choose Item Class']"
                        	          optionKey="id" optionValue="name"/>
                        </div>
                    </div>
                    <div class="row uniform 50%">
                        <div class="12u">
                            <ul class="actions">
                                %{--<li><g:submitButton name="${message(code:'adminItem.index.list')}"/></li>--}%
                                <li><g:actionSubmit action="chooseCategory" value="${message(code:'adminItem.index.create')}"/></li>
                            </ul>
                        </div>
                    </div>

                </g:form>
            </section>

        </div>
    </div>
    
    </section>
</div>
</body>
</html>