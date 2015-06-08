<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 6/2/15
  Time: 2:36 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
    <h1>Home</h1>
    <ul>
        <g:each in="${authorities}" var="authority">
            <li>${authority.authority}</li>
        </g:each>
    </ul>
</body>
</html>