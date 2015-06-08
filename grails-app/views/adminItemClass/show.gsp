<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Admin -Item Class Show</title>
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
                <h3>${itemClassInstance.name}</h3>
                <g:render template="/templates/messageBlock"/>
                    <div class="row uniform 50%">
                        <div class="12u">
                            <g:textArea name="description" value="${itemClassInstance?.description}" placeholder="${message(code:"itemClass.description.label")}" rows="6" disabled="disabled"/>
                        </div>
                    </div>
                    <div class="row uniform">
                        <div class="12u">
                            <ul class="actions">
                                <li><g:link action="edit" id="${itemClassInstance.id}" class="button special">Edit</g:link></li>
                                <li><g:link action="index" class="button">List</g:link></li>
                                <li><g:link action="delete" id="${itemClassInstance.id}" class="button alt" onclick="return confirm('${message(code: 'button.delete.confirm', default: 'Are you sure?')}');">Delete</g:link> </li>
                            </ul>
                        </div>
                    </div>
            </section>
        </div>
        <div class="6u 12u(narrower)">
            <section class="box special">
                <h3>${itemClassInstance.name} Categories</h3>
                <div class="table-wrapper">
                    <table class="alt">
                        <thead>
                        <tr>
                            <th>Name</th>
                            <th></th>
                        </tr>
                        </thead>
                            <tbody>
                                <g:each in="${itemClassInstance.categories}" var="category">
                                    <tr>
                                        <td>${category.name}</td>
                                        <td><g:link controller="adminCategory" action="show" id="${category.id}" class="button small special">show</g:link> </td>
                                    </tr>
                                </g:each>
                            </tbody>
<%--                        <tfoot>--%>
<%--                        <tr>--%>
<%--                            <td colspan="3">--%>
<%--                                <div class="pagination">--%>
<%--                                    <g:paginate total="${categoryListCount}" prev="${raw("<")}" next="${raw(">")}" maxsteps="5"/>--%>
<%--                                </div>--%>
<%--                            </td>--%>
<%--                        </tr>--%>
<%--                        </tfoot>--%>
                    </table>
                </div>
            </section>
        </div>
    </div>
    </section>
</div>
</body>
</html>