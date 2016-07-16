
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="header-top">
	<div class="container">
		<div class="social">
			<ul>
				<li><a href="http://facbook.com"><i class="facebok"> </i></a></li>
				<li><a href="http://twiter.com"><i class="twiter"> </i></a></li>
				<li><a href="http://instragram.com"><i class="inst"> </i></a></li>
				<li><a href="http://google.com"><i class="goog"> </i></a></li>
				<div class="clearfix"></div>
			</ul>
		</div>
		<div class="header-left">

			<div class="search-box">
				<div id="sb-search" class="sb-search">
					<form action="<spring:url value='/product'/>" method="get">
						<input name="searchInput" class="sb-search-input"
							placeholder="Enter your search term..." type="search" id="search">
						<input class="sb-search-submit" type="submit" value=""> <span
							class="sb-icon-search"> </span>
					</form>
				</div>
			</div>

			<!-- search-scripts -->
			<script src='<spring:url value="/resource/js/classie.js"  />'
				type='text/javascript'></script>
			<script src='<spring:url value="/resource/js/uisearch.js"  />'
				type="text/javascript"></script>
			<script>
				new UISearch(document.getElementById('sb-search'));
			</script>
			<!-- //search-scripts -->

			<div class="ca-r">
				<div class="cart box_1">
					<a href='<c:url value="/order"></c:url>'>
						<h3>
							<div class="total">
								<span class="simpleCart_total" ng-bind-html="orderTotalPrice"></span>
							</div>
							<img
								src="<spring:url value='/resource/images/ConstantImages/cart.png' />"
								alt="" />
						</h3>
					</a>
					<p>
						<a href='<c:url value = "/order"></c:url>'
							class="simpleCart_empty"></a>
					</p>

				</div>
			</div>
			<div class="clearfix"></div>
		</div>

	</div>
</div>
<div class="container">
	<div class="head-top">
		<div class="logo">
			<h1>
				<a href="<spring:url value='/' />">E Shopping</a>
			</h1>
		</div>
		<div class=" h_menu4">
			<ul class="memenu skyblue">
				<li><a class="color1" href="<spring:url value='/Clothes' />">Clothes</a></li>
				<li><a class="color1" href="<spring:url value='/Shoes' />">Shoes</a></li>
				<li><a class="color1" href="<spring:url value='/Mattresses' />">Mattresses</a></li>
				<li><a class="color1" href="<spring:url value='/Electronics' />">Electronics</a></li>
				<c:choose>
					<c:when test="${empty user}">
						<li><a class="color4" href="<spring:url value='/login' />">Login</a></li>
					</c:when>
					<c:otherwise>
						<li><a class="color4" href="<spring:url value='/logout' />">Logout</a></li>
					</c:otherwise>
				</c:choose>

				<li><a class="color6"
					href="<spring:url value='/jsp/ContactUs'/>">Contact</a></li>
			</ul>
		</div>

		<div class="clearfix"></div>
	</div>
</div>
