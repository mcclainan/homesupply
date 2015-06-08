<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
<head>
    <title><g:layoutTitle default="Mac Home Supply"/></title>
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <!--[if lte IE 8]><script src="${resource(dir: "assets/js/ie", file: "html5shiv.js")}"><![endif]-->
    <link rel="stylesheet" href="${resource(dir: "assets/css", file: "main.css")}" />
    <link rel="stylesheet" href="${resource(dir: "css", file: "pagination.css")}" />
    <!--[if lte IE 8]><link rel="stylesheet" href="${resource(dir:"assets/css",file: "ie8.css")}" /><![endif]-->
    <g:layoutHead/>
    <r:layoutResources/>
</head>

<body>
<div id="page-wrapper">

    <!-- Header -->
    <header id="header">
        <h1><g:link uri="/">Home Supply</g:link></h1>
        <nav id="nav">
            <ul>
                <li><g:link uri="/">Home</g:link></li>
                <li>
                    <a href="#" class="icon fa-angle-down">Menu</a>
                    <ul>
                        <sec:ifAnyGranted roles="ROLE_ADMIN">
                            <li>
                                <g:link controller="adminHome">Admin Home</g:link>
                                <ul>
                                    <li><g:link controller="adminItem">Items</g:link></li>
                                    <li><g:link controller="adminCategory">Categories</g:link></li>
                                    <li><g:link controller="adminItemClass">Item Classes</g:link></li>
                                    <li><g:link controller="adminUser">Users</g:link></li>
                                </ul>
                            </li>
                        </sec:ifAnyGranted>
                    </ul>
                </li>
                <sec:ifLoggedIn>
                    <li><g:link controller="logout" class="button">Logout</g:link></li>
                </sec:ifLoggedIn>
            </ul>
        </nav>
    </header>
    <g:layoutBody/>
    <r:layoutResources/>
    <!-- Footer -->
    <footer id="footer">
        <ul class="copyright">
            <li>&copy; Untitled. All rights reserved.</li><li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
        </ul>
    </footer>

</div>
<!-- Scripts -->
<script src="${resource(dir:"assets/js", file: "jquery.min.js")}"></script>
<script src="${resource(dir:"assets/js", file: "jquery.dropotron.min.js")}"></script>
<script src="${resource(dir:"assets/js", file: "jquery.scrollgress.min.js")}"></script>
<script src="${resource(dir:"assets/js", file: "skel.min.js")}"></script>
<script src="${resource(dir:"assets/js", file: "util.js")}"></script>
<!--[if lte IE 8]><script src="${resource(dir:"assets/js/ie", file: "respond.min.js")}"></script><![endif]-->
<script src="${resource(dir:"assets/js", file: "main.js")}"></script>

</body>
</html>
