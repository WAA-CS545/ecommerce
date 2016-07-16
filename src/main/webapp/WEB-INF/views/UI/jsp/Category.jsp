
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!-- grow -->
<div class="grow">
	<div class="container">
		<h2>${categoryName}</h2>
	</div>
</div>
<!-- grow -->
<div class="product">
	<div class="container">
		<div class="product-price1">
			<div class=" bottom-product">
				<c:forEach items="${products}" var="pr">
					<div class="col-md-4 bottom-cd simpleCart_shelfItem">
						<div class="product-at ">
							<a href="<spring:url value='/product/${pr.getProductId()}' />"><img
								class="img-responsive"
								src="<spring:url value='/resource/images/${pr.getImages().get(0).getImageURL()}' /> "
								alt="">
								<div class="pro-grid">
									<span class="buy-in">Buy Now</span>
								</div> </a>
						</div>
						<p class="tun">
							<span>${pr.getProductName()}</span>
						</p>
						<div class="ca-rt">
							<a href="" class="item_add"><p class="number item_price">
									<i> </i>${pr.getUnitPrice()}</p></a>
						</div>
					</div>
				</c:forEach>
				<div class="clearfix"></div>
			</div>
		</div>
		<div class="clearfix"></div>
	</div>
</div>