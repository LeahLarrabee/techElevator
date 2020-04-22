<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Customers List"/>

<%@include file="common/header.jspf"%>

<c:url value="/customerList" var="/custListUrl"/> <!--has to match in controller @Requestmapping-->
<form method="POST" action="${custListUrl}">

    <label for="search"></label> <!--this lastName is looking for input with an id of lastName-->
    <input type="text" name="search" placeholder="Search" id="search"/> <!--if want to make required need to add next to id-->

    <div class="formInputSort">
        <label for="Sort">Sort:</label>
        <select name="Sort"	id="Sort"/>

        <option value="last_name">Last Name</option>
        <option value="email">Email</option>
        <option value="activebool">Active</option>


        </select>
    </div>

    <input type="submit" name="submit" value="search"/>

</form>


<table class="table">
    <tr>

        <th>Name</th>
        <th>Email</th>
        <th>Active</th>

    </tr>

    <c:forEach items="${customers}" var="customer">
        <tr>
            <td>${customer.firstName} ${customer.lastName}</td>
            <td>${customer.email}</td>
            <td>${customer.active}</td>

            <!-- What do we print here for each actor? -->
        </tr>
    </c:forEach>
</table>

<%@include file="common/footer.jspf"%>