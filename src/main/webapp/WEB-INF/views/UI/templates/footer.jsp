 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
				<div class="container">
			<div class="footer-top-at">
			
				<div class="col-md-3 amet-sed">
				<h4>MORE INFO</h4>
				<ul class="nav-bottom">
						<li><a href="<spring:url value='/howToOrder' />">How to order</a></li>
						<li><a href="<spring:url value='/faq' />">FAQ</a></li>
						<li><a href="<spring:url value='/ContactUs' /> ">Location</a></li>
						<li><a href="<spring:url value='/shipping' /> ">Shipping</a></li>
						<li><a href="<spring:url value='/membership' />">Membership</a></li>	
					</ul>	
				</div>
				<div class="col-md-3 amet-sed">
					<h4>CATEGORIES</h4>
					<ul class="nav-bottom">
					<c:forEach items="${categories}" var="category" begin="0" end="4">
						<li><a href="<c:url value='/Category/${category.getCategoryName()}' />"> ${category.getCategoryName()} </a></li>
						</c:forEach>
					 </ul>
					
				</div>
				<div class="col-md-3 amet-sed">
					<h4>NEWSLETTER</h4>
					<div class="stay">
						<div class="stay-left">
							<form>
								<input type="text" placeholder="Enter your email " required="">
							</form>
						</div>
						<div class="btn-1">
							<form>
								<input type="submit" value="Subscribe">
							</form>
						</div>
							<div class="clearfix"> </div>
			</div>
					
				</div>
				<div class="col-md-3 amet-sed ">
				<h4>CONTACT US</h4>
					<p>Contrary to popular belief</p>
					<p>The standard chunk</p>
					<p>office :  +12 34 995 0792</p>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<div class="footer-class">
		<p>© 2015 Mattress . All Rights Reserved | Design by  <a href="" target="_blank">Group 3 WAA peoject</a> </p>
		</div>
		