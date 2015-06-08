<%@ page import="org.macsuite.homesupply.ItemClass" %>
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
            <h2>Category</h2>
        </header>
    <div class="row">
    	<div class="6u 12u(narrower)">

            <section class="box special">
                <h3>${category.name}</h3>
                <div class="table-wrapper">
                    <table class="alt">
                        <tbody>
                        <tr>
                            <td>Item Class</td>
                            <td>${category.itemClass}</td>
                        </tr>
                        <tr>
                            <td>Description</td>
                            <td><g:textArea name="description" value="${category?.description}" placeholder="${message(code:"category.description.label")}" rows="6" disabled="disabled"/></td>
                        </tr>

                    </table>
                </div>
                <div class="row uniform">
                    <div class="12u">
                        <ul class="actions">
                            <li><g:link action="edit" id="${category.id}" class="button special">Edit</g:link></li>
                            <li><g:link action="index" class="button">List</g:link></li>
                            <li><g:link action="delete" id="${category.id}" class="button alt" onclick="return confirm('${message(code: 'button.delete.confirm', default: 'Are you sure?')}');">Delete</g:link> </li>
                        </ul>
                    </div>
                </div>
            </section>

        </div>
        <div class="6u 12u(narrower)">

            <section class="box special">
                <h3>Items in ${category} Category</h3>
                <div class="table-wrapper">
                    <table class="alt">
                        <thead>
                        <tr>
                            <th>Name</th>
                            <th></th>
                        </tr>
                        </thead>
                            <tbody>
                                <g:each in="${category.items}" var="item">
                                    <tr>
                                        <td>${item.name}</td>
                                        <td><g:link controller="adminItem" action="show" id="${item.id}" class="button small special">Show</g:link> </td>
                                    </tr>
                                </g:each>
                            </tbody>
                        %{--<tfoot>--}%
                        %{--<tr>--}%
                            %{--<td colspan="3">--}%
                                %{--<div class="pagination">--}%
                                    %{--<g:paginate total="${categoryInstanceCount}" prev="${raw("<")}" next="${raw(">")}" maxsteps="5"/>--}%
                                %{--</div>--}%
                            %{--</td>--}%
                        %{--</tr>--}%
                        %{--</tfoot>--}%
                    </table>
                </div>
            </section>

        </div>
        
    </div>
    </section>
</div>
</body>
</html>