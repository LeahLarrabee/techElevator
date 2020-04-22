<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Actors List"/>

<%@include file="common/header.jspf"%>

<!-- Form goes here -->
<c:url value="/actorList" var="/actorListUrl"/> <!--has to match in controller @Requestmapping-->
<form method="POST" action="${actorListUrl}">
    <p>
        <label for="lastName">Enter search name</label> <!--this lastName is looking for input with an id of lastName-->
        <input type="text" name="lastName" id="lastName"/>
        <input type="submit" name="submit" value="search"/>
    </p>
</form>





<table class="table">
<tr>
<th>Name</th>
</tr>
<c:forEach items="${actors}" var="actor">
<tr>
    <td>${actor.firstName} ${actor.lastName}</td>

    <!-- What do we print here for each actor? -->
</tr>
</c:forEach>
</table>
<%@include file="common/footer.jspf"%>
