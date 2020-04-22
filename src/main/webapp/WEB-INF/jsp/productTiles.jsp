<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product Tile View" />
</c:import>

<div id="masonry-page">
	<c:import url="/WEB-INF/jsp/common/filters.jsp">
		<%-- Modify the baseRoute to apply filters to the current route. --%>
		<c:param name="baseRoute" value="#" />
	</c:import>

	<!-- Container for all of the Products -->
	<!-- The list of products is available using the `products` variable -->
	<div id="grid" class="main-content">

		<c:forEach var="product" items="${products}">
			<c:set var="tileClass" value="" />
			<c:set var="isTopSeller" value="false" />
			<c:set var="isSoldOut" value="false" />

				<c:if test="${product.topSeller}">
					<c:set var="tileClass" value="top-seller" />
					<c:set var="isTopSeller" value="true" />
				</c:if>
				<c:if test="${product.remainingStock == 0}">
					<c:set var="tileClass" value="sold-out" />
					<c:set var="isSoldOut" value="true" />
				</c:if>


			<div class="tile ${tileClass}">
				<c:if test="${isSoldOut}">
					<span class="banner">Sold Out</span>
				</c:if>


				<!--the below block is creating a url var and then assigning it to an image and displace and assigning to name and displace then <a makes it clickable to go to details page-->
				<c:url var="productImageUrl" value="/images/product-images/${product.imageName}" />
				<c:url var="productDetailUrl" value="/products/detail">
					<c:param name="id" value="${product.id}" />
				</c:url>
				<a class="product-image" href="${productDetailUrl}">
					<img src="${productImageUrl}" />
				</a>
				<div class="details">
					<p class="name">
						<a href="${productDetailUrl}">${product.name}</a>
					</p>

					<!-- fill will make the star solid -->
					<div class="rating">
						<c:forEach begin="1" end="5" var="starCount"> <!-- for(int starCount = 1; starCount<=5 starCount++)-->
							<span class="${starCount <= product.averageRating ? 'filled' : ''}">&#9734</span>
						</c:forEach>
					</div>

					<c:if test="${isTopSeller}">
						<br />
						<p class="product-alert">Top Seller</p>
					</c:if>

					<p class="alert-remaining">
						<c:if test="${product.remainingStock >0 && product.remainingStock <=5}">
							<span class="product-alert">Only ${product.remainingStock} left!</span>
						</c:if>
					</p>

					<p class="price">
						<fmt:formatNumber value="${product.price}" type="CURRENCY" />
					</p>
				</div>
			</div>
		</c:forEach>

	</div>
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />