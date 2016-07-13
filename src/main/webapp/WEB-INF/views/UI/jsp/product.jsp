   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
       <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
	<!-- grow -->
	<div class="grow">
		<div class="container">
			<h2>${product.getProductName()}</h2>
		</div>
	</div>
	<!-- grow -->
		<div class="product">
			<div class="container">
				
				<div class="product-price1">
				<div class="top-sing">
				<div class="col-md-7 single-top">	
						<div class="flexslider">
			  <ul class="slides">
			  <c:forEach items="${product.getImages()}" var="image">
			 
			    <li data-thumb="<spring:url value='/resource/images/${image.getImageURL()}' /> " >
			        <div class="thumb-image"> 
			        <img src="<spring:url value='/resource/images/${image.getImageURL()}' /> " data-imagezoom="true" class="img-responsive"> </div>
			    </li>
			    </c:forEach>
			    </ul>
		</div>

	<div class="clearfix"> </div>
<!-- slide -->


						<!-- FlexSlider -->
  <script  src="<spring:url value='/resource/js/jquery.flexslider.js' /> "></script>
<link rel="stylesheet" href="<spring:url value='/resource/css/flexslider.css' /> " type="text/css" media="screen" />

<script>
// Can also be used with $(document).ready()
$(window).load(function() {
  $('.flexslider').flexslider({
    animation: "slide",
    controlNav: "thumbnails"
  });
});
</script>

	
	
	
	
	
	
					</div>	
					<div class="col-md-5 single-top-in simpleCart_shelfItem">
						<div class="single-para ">
						<h4>${product.getProductName()}</h4>
							<div class="star-on">
								
								<div class="review">
									<a href="#"> 1 customer review </a>
									
								</div>
							<div class="clearfix"> </div>
							</div>
							
							<h5 class="item_price">$ ${product.getUnitPrice()}</h5>
							<p>${product.getDescription()}</p>
							<div class="available">
								<ul>
									<li>Color
										<select>
										<option>Silver</option>
										<option>Black</option>
										<option>Dark Black</option>
										<option>Red</option>
									</select></li>
								<li class="size-in">Size<select>
									<option>Large</option>
									<option>Medium</option>
									<option>small</option>
									<option>Large</option>
									<option>small</option>
								</select></li>
								<div class="clearfix"> </div>
							</ul>
						</div>
							
								<a href="#" class="add-cart item_add">ADD TO CART</a>
							
						</div>
					</div>
				<div class="clearfix"> </div>
				</div>
			<!---->

		<div class=" bottom-product">
					<c:forEach  begin="0" end="2" items="${subProducts}" var="pr">
					<div class="col-md-4 bottom-cd simpleCart_shelfItem">
						<div class="product-at ">
							<a href="<spring:url value='/product/${pr.getProductId()}' />"><img class="img-responsive" src="<spring:url value='/resource/images/${pr.getImages().get(0).getImageURL()}' /> " alt="">
							<div class="pro-grid">
										<span class="buy-in">Buy Now</span>
							</div>
						</a>	
						</div>
						<p class="tun"><span>${pr.getProductName()}</span></p>
						<div class="ca-rt">
							<a href="" class="item_add"><p class="number item_price"><i> </i>${pr.getUnitPrice()}</p></a>						
						</div>						
					</div>
					</c:forEach>
					
					
					<div class="clearfix"> </div>
				</div>
</div>

		<div class="clearfix"> </div>
		</div>
		</div>