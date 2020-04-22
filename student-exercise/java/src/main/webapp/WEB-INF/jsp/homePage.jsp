
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<c:set var="pageTitle" value="Welcome to Our DVD Store"/>
<%@include file="common/header.jspf"%>

<p>
    <a href="actorList">Search Actors</a>
    <br>
    <a href="filmList">Search Films</a>
    <br>
    <a href="customerList">Search Customer</a>
</p>


<%@include file="common/footer.jspf"%>