<g:if test="${flash.message}">
    <span style="color:#006dba">${flash.message}</span>
    <br/><br/>
</g:if>
<g:if test="${flash.error}">
    <span style="color:#aa1111">${flash.error}</span>
    <br/><br/>
</g:if>
<g:if test="${msg}">
    <span style="color:#006dba">${msg}</span>
    <br/><br/>
</g:if>
<g:if test="${err}">
    <span style="color:#aa1111">${err}</span>
    <br/><br/>
</g:if>
<g:hasErrors bean="${command}">
    <ul>
        <g:renderErrors bean="${command}"/>
    </ul>
</g:hasErrors>
<g:hasErrors bean="${bean}">
    <ul>
        <g:renderErrors bean="${bean}"/>
    </ul>
</g:hasErrors>
