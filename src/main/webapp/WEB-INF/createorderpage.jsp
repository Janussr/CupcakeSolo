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
            <h2>Our Cool Site</h2>

            <div style="margin-top: 3em;margin-bottom: 3em;">
                Main page for this 2. semester start project used at cphbusiness.dk
            </div>
            <p style="font-size: larger"> Velkommen til create order. </p>


        </div>

    </jsp:body>
</t:genericpage>