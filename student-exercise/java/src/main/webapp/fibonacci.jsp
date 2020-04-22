<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="common/header.jsp">
	<c:param name="title" value="Fibonacci"></c:param>
</c:import>

<nav id="page-options">
	<ul>
		<c:set var="numberOfItems" value="20" />
		<c:url var="fibonacciRoute" value="fibonacci.jsp">
			<c:param value="${ numberOfItems }" name="max" />
		</c:url>
		<li>
			<a href="<c:out value="${ fibonacciRoute }" />"><c:out value="${ numberOfItems }" /></a>
		</li>

		<c:set var="numberOfItems" value="50" />
		<c:url var="fibonacciRoute" value="fibonacci.jsp">
			<c:param value="${ numberOfItems }" name="max" />
		</c:url>
		<li>
			<a href="<c:out value="${ fibonacciRoute }" />"><c:out value="${ numberOfItems }" /></a>
		</li>

		<c:set var="numberOfItems" value="100" />
		<c:url var="fibonacciRoute" value="fibonacci.jsp">
			<c:param value="${ numberOfItems }" name="max" />
		</c:url>
		<li>
			<a href="<c:out value="${ fibonacciRoute }" />"><c:out value="${ numberOfItems }" /></a>
		</li>
	</ul>
</nav>

<%--
	REPLACE THIS COMMENT WITH YOUR UNORDERED LIST...
 --%>


<ul id="fibonacci">

	<c:set var="firstNum" value="1" />
	<c:set var="secondNum" value="0" />
	<c:set var="sum" value="0" />

	<li>${secondNum}</li>
	<li>${firstNum}</li>


<c:forEach begin="0" end="${param.max}" >
	<c:set var = "sum" value = "${firstNum+secondNum}"/>
	<c:set var = "secondNum" value = "${firstNum}"/>
	<c:set var = "firstNum" value = "${sum}" />



	<c:if test="${(firstNum>=0)&&(firstNum<=param.max)}">
	<li>${sum}</li>
	</c:if>

	</c:forEach>
	</ul>

<c:import url="common/footer.jsp"></c:import>