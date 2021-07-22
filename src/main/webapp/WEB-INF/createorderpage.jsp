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

        <div class="container">
            <div class="row">
                <div class="col-sm">

                    <p style="font-size: larger"> Velkommen til create order. </p>
                </div>

                <div class="col-sm">
                    <select class="form-select" name="bottom" id="bottom">
                        <option disabled selected value> Vælg Top:</option>
                        <c:forEach var="topping" items="${applicationScope.toppingList}">
                            <option value="${topping.id}">
                                    ${topping.name} DKK
                                    ${topping.price},-
                            </option>
                        </c:forEach>
                    </select>
                </div>


                <div class="col-sm">
                    <select class="form-select" name="bottom" id="bottom">
                        <option disabled selected value> Vælg Bund:</option>
                        <c:forEach var="bottom" items="${applicationScope.bottomList}">
                            <option value="${bottom.id}">${bottom.name} DKK ${bottom.price},-</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="col-sm">
                <button> tilføj cupcake</button>
                </div>
            </div>
        </div>


    </jsp:body>
</t:genericpage>