<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 5/28/15
  Time: 8:56 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<section id="main" class="container">
    <div class="box">
        <div class="row">
            <div class="12u">

                <!-- Form -->
                <section class="box">
                    <h2>Login</h2>
                    <g:if test='${flash.message}'>
                        <p style="color: #cd0a0a">${flash.message}</p>
                    </g:if>
                    <form action='${postUrl}' method='POST' id='loginForm' class='cssform' autocomplete='off'>
                        <div class="row uniform 50%">
                            <div class="6u 12u(mobilep)">
                                <input type='text' name='j_username' id='username' placeholder="username"/>
                            </div>
                        </div>
                        <div class="row uniform 50%">
                            <div class="6u 12u(mobilep)">
                                <input type='password' name='j_password' id='password' placeholder="password"/>
                            </div>
                        </div>
                        <div class="row uniform">
                            <div class="12u">
                                <ul class="actions">
                                    <li><input type='submit' id="submit" value='${message(code: "springSecurity.login.button")}'/></li>
                                    <li><g:link url="http://www.macsuite.org/usermanagement">Forgot Password</g:link> </li>
                                </ul>
                            </div>
                        </div>
                    </form>
                </section>
            </div>
        </div>
    </div>
</section>
</body>
</html>