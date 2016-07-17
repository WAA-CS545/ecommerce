<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link href='<spring:url value="/resource/css/errorstyle.css" htmlEscape="true" />' rel='stylesheet' type='text/css' />

<!-- grow -->
<div class="grow">
	<div class="container">
		<h2>Register</h2>
	</div>
</div>
<!-- grow -->
<!--content-->
<div class=" container">
	<div class="register">

		<form:form modelAttribute="newUser" >
			<div class="col-md-6 register-top-grid">
				<h3>Personal information</h3>
				<div>
					<form:errors path="firstName" cssClass="error"></form:errors>
					<span>First Name</span>				
					<form:input type="text" path="firstName"  />					
				</div>
				<div>
					<form:errors path="lastName" cssClass="error"></form:errors>
					<span>Last Name</span> 
					<form:input type="text" path="lastName" id="lastName"/>
				</div>
				<div>
					<form:errors path="email" cssClass="error"></form:errors>
					<span>Email Address</span> 
					<form:input type="text" path="email" id="email"/>
				</div>

				<h3>Address information</h3>
				<div>
					<form:errors path="address.street" cssClass="error"></form:errors>
					<span>Street</span> 
					<form:input type="text" path="address.street" id="newUser.address.street" />
				</div>
				<div>
					<form:errors path="address.zipcode" cssClass="error"></form:errors>
					<span>Zipcode</span> 
					<form:input type="text" path="address.zipcode" id="newUser.address.zipcode" />
				</div>
				<div>
					<form:errors path="address.city" cssClass="error"></form:errors>
					<span>City</span> 
					<form:input type="text"  path="address.city" id="newUser.address.city"/>
				</div>
			</div>
			<div class="col-md-6 register-bottom-grid">
				<h3>Login information</h3>
				<div>
					<form:errors path="userCredentials.username" cssClass="error"></form:errors>
					<span>User Name</span> 
					<form:input type="text" path="userCredentials.username" id="newUser.userCredentials.username" />
				</div>
				<div>
					<form:errors path="userCredentials.password" cssClass="error"></form:errors>
					<span>Password</span> 
					<form:input type="password" path="userCredentials.password" id="newUser.userCredentials.password" />
				</div>
				<div>
					<form:errors path="userCredentials.verifyPassword" cssClass="error"></form:errors>
					<span>Confirm Password</span> 
					<form:input type="password"  path="userCredentials.verifyPassword" id="newUser.userCredentials.verifyPassword"/>
				</div>
				<input type="submit" value="submit">
			</div>
			<div class="clearfix"></div>
		</form:form>
	</div>
</div>
<!--//content-->