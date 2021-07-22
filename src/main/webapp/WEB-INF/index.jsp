<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:genericpage>

    <jsp:attribute name="header">
         Home
    </jsp:attribute>

    <jsp:attribute name="footer">
        <c:set var="addHomeLink" value="${false}" scope="request"/>
    </jsp:attribute>

    <jsp:body>

        <div>
            <h2>INDEX SIDEN</h2>

            <div style="margin-right: 3em;margin-bottom: 3em;">
                <a href="fc/createorderpage">createorderd</a>

            </div>



        </div>

    </jsp:body>
</t:genericpage>