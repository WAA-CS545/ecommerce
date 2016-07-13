 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<div class="header-top">
		<div class="container">
			<div class="social">
				<ul>
					<li><a href="http://facbook.com"><i class="facebok"> </i></a></li>
					<li><a href="http://twiter.com"><i class="twiter"> </i></a></li>
					<li><a href="http://inst.com"><i class="inst"> </i></a></li>
					<li><a href="http://google.com"><i class="goog"> </i></a></li>
						<div class="clearfix"></div>	
				</ul>
			</div>
			<div class="header-left">
			
				<div class="search-box">
					<div id="sb-search" class="sb-search">
						<form>
							<input class="sb-search-input" placeholder="Enter your search term..." type="search"  id="search">
							<input class="sb-search-submit" type="submit" value="">
							<span class="sb-icon-search"> </span>
						</form>
					</div>
				</div>
			
<!-- search-scripts -->
					<script src="<spring:url value="/resource/js/classie.js" />'"></script>
					<script src="<spring:url value="/resource/js/uisearch.js" />'"></script>
										<script>
							new UISearch( document.getElementById( 'sb-search' ) );
						</script>
					<!-- //search-scripts -->

				<div class="ca-r">
					<div class="cart box_1">
						<a href="checkout.html">
						<h3> 
						<div class="total">
							<span class="simpleCart_total"></span> </div>
							<img src="<spring:url value='/resource/images/ConstantImages/cart.png' />" alt=""/></h3>
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>

					</div>
				</div>
					<div class="clearfix"> </div>
			</div>
				
		</div>
		</div>
		<div class="container">
			<div class="head-top">
				<div class="logo">
					<h1><a href="<spring:url value='/' />">E shopping</a></h1>
				</div>
		  <div class=" h_menu4">
				<ul class="memenu skyblue">
					  <li><a class="color8" href="<spring:url value='/Clothes' />">Clothes</a></li>	
				      <li><a class="color1" href="<spring:url value='/Mattrices' />">Mattrices</a>
				      	<div class="mepanel">
						<div class="row">
							<div class="col1">
								<div class="h_nav">
									<ul>
									<c:forEach items="${categories}" var="category">
										<li><a href="<spring:url value="/city/${category.getCategoryName()}"/>">${category.getCategoryName()}</a></li>
										</c:forEach>
									</ul>	
								</div>							
							</div>
							
						
						  </div>
						</div>
					</li>
				    <li class="grid"><a class="color2" href="<spring:url value='/Electronics' />">Electronics</a>
					  	<div class="mepanel">
						<div class="row">
							<div class="col1">
								<div class="h_nav">
									<ul>
									<c:forEach items="${categories}" var="category">
										<li><a href="<spring:url value='/category/${category.getCategoryName()}' />" > ${category.getCategoryName()}  </a></li>
									</c:forEach>
										
										
									</ul>	
								</div>								
							</div>
							
						
						  </div>
						</div>
			    </li>
			    <c:choose>
					    <c:when test="${empty user}">
      						<li><a class="color4" href="<spring:url value='/login' />" >Login</a></li>
      					</c:when>
					    <c:otherwise>
		 					<li><a class="color4" href="<spring:url value='/logout' />" >Logout</a></li>
 					    </c:otherwise>
					</c:choose>	
								
				<li><a class="color6" href="<spring:url value='/contact'/>" >Contact</a></li>
			  </ul> 
			</div>
				
				<div class="clearfix"> </div>
		</div>
		</div>
