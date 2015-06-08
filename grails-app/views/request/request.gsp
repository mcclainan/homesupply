<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 6/5/15
  Time: 9:03 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="org.macsuite.homesupply.Item" %>
<html>
<head>
    <title></title>
</head>

<body>
<section id="main" class="container">
    <header>
        <h2>${category}</h2>
    </header>
    <div class="row">
        <div class="12u">
            <g:render template="/templates/messageBlock"/>
            <!-- Table -->
            <section class="box">
                <div class="table-wrapper">
                    <table>
                        <tbody>
                            <g:each in="${Item.findAllByCategoryAndRequested(category,false)}" var="item">
                                <tr>
                                    <td>${item}</td>
                                    <td><g:link action="executeRequest" id="${item.id}" class="button special small fit">Request</g:link></td>
                                </tr>
                            </g:each>
                        </tbody>
                        <tfoot>
                        <tr>
                            <td colspan="2" style="text-align: center">
                                <ul class="actions">
                                    <li><g:link action="create" id="${category.id}" class="button">New Item</g:link></li>
                                    <li><g:link action="index" class="button">Back</g:link></li>
                                </ul>
                            </td>
                        </tr>
                        </tfoot>
                    </table>
                </div>
            </section>

        </div>
    </div>
</section>
</body>
</html>