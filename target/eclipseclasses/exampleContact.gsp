<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 6/2/15
  Time: 3:33 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<div id="page-wrapper">

    <!-- Main -->
    <section id="main" class="container 75%">
        <header>
            <h2>Contact Us</h2>
            <p>Tell us what you think about our little operation.</p>
        </header>
        <div class="box">
            <g:form controller="home" action="index">
                <div class="row uniform 50%">
                    <div class="6u 12u(mobilep)">
                        <g:textField  name="name" id="name" value="" placeholder="Name" />
                    </div>
                    <div class="6u 12u(mobilep)">
                        <g:textField type="email" name="email" id="email" value="" placeholder="Email" />
                    </div>
                </div>
                <div class="row uniform 50%">
                    <div class="12u">
                        <g:select name="subject" id="subject" value="" from="${['option1','option2','option3','option4']}" />
                    </div>
                </div>
                <div class="row uniform 50%">
                    <div class="12u">
                        <g:textArea name="message" id="message" placeholder="Enter your message" rows="6"/>
                    </div>
                </div>
                <div class="row uniform">
                    <div class="12u">
                        <ul class="actions align-center">
                            <li><g:submitButton name="Send Message"/></li>
                        </ul>
                    </div>
                </div>
            </g:form>
        </div>
    </section>
</div>
</body>
</html>