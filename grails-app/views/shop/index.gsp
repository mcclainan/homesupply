<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 6/6/15
  Time: 8:27 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title><g:message code="shop.index.title"/></title>
</head>

<body>
<section id="main" class="container">
    <header>
        <h2><g:message code="shop.index.heading"/></h2>
    </header>
    <div class="row">
        <div class="12u">

            <!-- Table -->
            <section class="box">
                <div class="table-wrapper">
                    <table>
                        <thead>
                        <tr>
                            <th>Item</th>
                            <th>Requester</th>
                            <th></th>
                            <th></th>
                        </tr>
                        </thead>
                        <tbody>
                            <g:each in="${requestList}" var="req">
                                <tr>
                                    <td>${req.item}</td>
                                    <td>${req.user}</td>
                                    <td><g:link action="purchase" class="button special small fit" id="${req.id}">Purchase</g:link></td>
                                    <td><g:link action="reject" class="button small fit" id="${req.id}">Reject</g:link></td>
                                </tr>
                            </g:each>
                        </tbody>
                    </table>
                </div>
            </section>

        </div>
    </div>

</section>
</body>
</html>