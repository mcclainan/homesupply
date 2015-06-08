<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 6/3/15
  Time: 8:52 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<div id="page-wrapper">
    <!-- Main -->
    <section id="main" class="container">
        <header>
            <h2>Item Class</h2>
        </header>
    <div class="row">
        <div class="6u 12u(narrower)">

            <section class="box special">
                <h3>List</h3>
                <div class="table-wrapper">
                    <table class="alt">
                        <thead>
                        <tr>
                            <th>Name</th>
                            <th></th>
                        </tr>
                        </thead>
                            <tbody>
                                <g:each in="${itemClassInstanceList}" var="itemClass">
                                    <tr>
                                        <td>${itemClass.name}</td>
                                        <td><g:link action="show" id="${itemClass.id}" class="button small special">Show</g:link> </td>
                                    </tr>
                                </g:each>
                            </tbody>
                        <tfoot>
                        <tr>
                            <td colspan="3">
                                <div class="pagination">
                                    <g:paginate total="${itemClassInstanceCount}" prev="${raw("<")}" next="${raw(">")}" maxsteps="5"/>
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
                <h3>Create New Item Class</h3>
                <g:render template="/templates/messageBlock"/>
                <g:form action="save">
                    <div class="row uniform 50%">
                        <div class="12u">
                            <g:textField name="name" value="${command?.name}" placeholder="${message(code:"itemClass.name.label")}"/>
                        </div>
                    </div>
                    <div class="row uniform 50%">
                        <div class="12u">
                            <g:textArea name="description" value="${command?.description}" placeholder="${message(code:"itemClass.description.label")}" rows="6"/>
                        </div>
                    </div>
                    <div class="row uniform">
                        <div class="12u">
                            <ul class="actions">
                                <li><g:submitButton name="Create"/></li>
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