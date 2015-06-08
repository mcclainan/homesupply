<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 6/3/15
  Time: 8:52 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title><g:message code="adminCategory.index.title"/></title>
</head>

<body>
<div id="page-wrapper">
    <!-- Main -->
    <section id="main" class="container">
        <header>
            <h2><g:message code="adminCategory.index.heading"/></h2>
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
                            <th>Edit</th>
                            <th>Delete</th>
                        </tr>
                        </thead>
                            <tbody>
                                <g:each in="${categoryInstanceList}" var="category">
                                    <tr>
                                        <td>${category.name}</td>
                                        <td><g:link action="edit" id="${category.id}" class="button small special">Edit</g:link> </td>
                                        <td><g:link action="delete" id="${category.id}" class="button small alt" onclick="return confirm('${message(code: 'button.delete.confirm', default: 'Are you sure?')}');">Delete</g:link> </td>
                                    </tr>
                                </g:each>
                            </tbody>
                        <tfoot>
                        <tr>
                            <td colspan="3">
                                <div class="pagination">
                                    <g:paginate total="${categoryInstanceCount}" prev="${raw("<")}" next="${raw(">")}" maxsteps="5"/>
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
                <h3>Create New Category</h3>
                <g:render template="/templates/messageBlock"/>
                <g:form action="save">
                    <div class="row uniform 50%">
                        <div class="12u">
                            <g:textField name="name" value="${command?.name}" placeholder="${message(code:"category.name.label")}"/>
                        </div>
                    </div>
                    <div class="row uniform 50%">
                        <div class="12u">
                            <g:textArea name="description" value="${command?.description}" placeholder="${message(code:"category.description.label")}" rows="6"/>
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