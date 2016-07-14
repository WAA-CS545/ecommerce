	 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
	<div class="banner">
		<div class="container">
			  <script src="<spring:url value='/resource/js/responsiveslides.min.js' /> "></script>
  <script>
    $(function () {
      $("#slider").responsiveSlides({
      	auto: true,
      	nav: true,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      });
    });
  </script>
			<div  id="top" class="callbacks_container">
			<ul class="rslides" id="slider">
			    <li>
					
						<div class="banner-text">
							<h3>customizable   </h3>
						<p>Our website is fully customizable store design.</p>
						
						</div>
				
				</li>
				<li>
					
						<div class="banner-text">
							<h3>Full functunality </h3>
						<p>To see the full functunality you have to pay to group 3 400 $</p>
												

						</div>
					
				</li>
				<li>
						<div class="banner-text">
							<h3>Sell online</h3>
						<p>Everything you need to sell online. Trusted by over 275,000 businesses worldwide..</p>
								

						</div>
					
				</li>
			</ul>
		</div>

	</div>
	</div>

<!--content-->
<div class="container">
	<div class="cont">
		<div class="content">
			<div class="content-top-bottom">
				<h2>Featured PRODUCTS</h2>
				<div class="col-md-6 men">
				
					<a href="<spring:url value='/product/${homeProducts.get(0).getProductId()}' /> " class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="<spring:url value='/resource/images/${homeProducts.get(0).getImages().get(0).getImageURL()}' /> " alt="">
						<div class="b-wrapper">
											<h3 class="b-animate b-from-top top-in   b-delay03 ">
												<span>${homeProducts.get(0).getProductName()}</span>	
											</h3>
										</div>
					</a>
					
					
				</div>
				<div class="col-md-6">
					<div class="col-md1 ">
						<a href="<spring:url value='/product/${homeProducts.get(1).getProductId()}' /> " class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="<spring:url value='/resource/images/${homeProducts.get(1).getImages().get(0).getImageURL()}' /> " alt="">
							<div class="b-wrapper">
											<h3 class="b-animate b-from-top top-in1   b-delay03 ">
												<span>${homeProducts.get(1).getProductName()}</span>	
											</h3>
										</div>
						</a>
						
					</div>
					<div class="col-md2">
					
						<div class="col-md-6 men1">
							<a href="<spring:url value='/product/${homeProducts.get(2).getProductId()}' /> " class="b-link-stripe b-animate-go  thickbox">
							<img class="img-responsive" src="<spring:url value='/resource/images/${homeProducts.get(2).getImages().get(0).getImageURL()}' />" alt="${homeProducts.get(2).getProductName()}" />
									<div class="b-wrapper">
											<h3 class="b-animate b-from-top top-in2   b-delay03 ">
												<span>${homeProducts.get(2).getProductName()}</span>	
											</h3>
										</div>
							</a>
							
						</div>
						<div class="col-md-6 men2">
							<a href="<spring:url value='/product/${homeProducts.get(3).getProductId()}' /> " class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="<spring:url value='/resource/images/${homeProducts.get(3).getImages().get(0).getImageURL()}' />" alt="${homeProducts.get(3).getProductName()}">
									<div class="b-wrapper">
											<h3 class="b-animate b-from-top top-in2   b-delay03 ">
												<span>${homeProducts.get(3).getProductName()}</span>	
											</h3>
										</div>
							</a>
							
						</div>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="content-top">
				<h1>NEW PRODUCTS</h1>
				<div class="grid-in">
					<div class="col-md-3 grid-top simpleCart_shelfItem">
						<a href="<spring:url value='/product/${homeProducts.get(4).getProductId()}' />" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="<spring:url value='/resource/images/${homeProducts.get(4).getImages().get(0).getImageURL()}' />" alt="">
							<div class="b-wrapper">
								<h3 class="b-animate b-from-left    b-delay03 ">
									<span>${homeProducts.get(4).getProductName()}</span>
									
								</h3>
							</div>
						</a>
				

					<p><a href="<spring:url value='/product/${homeProducts.get(4).getProductId()}' />">${homeProducts.get(4).getProductName()}</a></p>
					<a href="#" class="item_add"><p class="number item_price"><i> </i>$500.00</p></a>
					</div>
					<div class="col-md-3 grid-top simpleCart_shelfItem">
						<a href="<spring:url value='/product/${homeProducts.get(5).getProductId()}' />" class="b-link-stripe b-animate-go  thickbox">
						<img class="img-responsive" src="<spring:url value='/resource/images/${homeProducts.get(5).getImages().get(0).getImageURL()}' />" alt="">
							<div class="b-wrapper">
											<h3 class="b-animate b-from-left    b-delay03 ">
												<span>${homeProducts.get(5).getProductName()}</span>	
											</h3>
										</div>
						</a>
					<p><a href="<spring:url value='/product/${homeProducts.get(5).getProductId()}' />">${homeProducts.get(5).getProductName()}</a></p>
					<a href="#" class="item_add"><p class="number item_price"><i> </i>$500.00</p></a>
					</div>
					<div class="col-md-3 grid-top simpleCart_shelfItem">
						<a href="<spring:url value='/product/${homeProducts.get(6).getProductId()}' />" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="<spring:url value='/resource/images/${homeProducts.get(6).getImages().get(0).getImageURL()}' />" alt="">
							<div class="b-wrapper">
											<h3 class="b-animate b-from-left    b-delay03 ">
												<span>${homeProducts.get(6).getProductName()}</span>	
											</h3>
										</div>
						</a>
					<p><a href="<spring:url value='/product/${homeProducts.get(6).getProductId()}' />">${homeProducts.get(6).getProductName()}</a></p>
					<a href="#" class="item_add"><p class="number item_price"><i> </i>$500.00</p></a>
					</div>
					<div class="col-md-3 grid-top">
						<a href="<spring:url value='/product/${homeProducts.get(7).getProductId()}' />" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="<spring:url value='/resource/images/${homeProducts.get(7).getImages().get(0).getImageURL()}' />" alt="">
							<div class="b-wrapper">
											<h3 class="b-animate b-from-left    b-delay03 ">
												<span>${homeProducts.get(7).getProductName()}</span>	
											</h3>
										</div>
						</a>
					<p><a href="<spring:url value='/product/${homeProducts.get(7).getProductId()}' />">${homeProducts.get(7).getProductName()}</a></p>
					<a href="#" class="item_add"><p class="number item_price"><i> </i>$500.00</p></a>
					</div>
							<div class="clearfix"> </div>
				</div>
			</div>
		</div>
	<!----->
	</div>
	<!---->
</div>