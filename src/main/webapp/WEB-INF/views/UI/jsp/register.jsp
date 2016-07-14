<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!-- grow -->
<div class="grow">
	<div class="container">
		<h2>Register</h2>
	</div>
</div>
<!-- grow -->
<!--content-->
<div class=" container">
	<div class=" register">

		<form:form modelAttribute="newUser" >
			<div class="col-md-6 register-top-grid">
				<h3>Personal information</h3>
				<div>
					<span>First Name</span> <form:input type="text" path="firstName" id="firstName" />
				</div>
				<div>
					<span>Last Name</span> <form:input type="text" path="lastName" id="lastName"/>
				</div>
				<div>
					<span>Email Address</span> <form:input type="text" path="email" id="email"/>
				</div>

				<h3>Address information</h3>
				<div>
					<span>Street</span> <form:input type="text" path="address.street" id="newUser.address.street" />
				</div>
				<div>
					<span>Zipcode</span> <form:input type="text" path="address.zipcode" id="newUser.address.zipcode" />
				</div>
				<div>
					<span>City</span> <form:input type="text"  path="address.city" id="newUser.address.city"/>
				</div>
			</div>
			<div class="col-md-6 register-bottom-grid">
				<h3>Login information</h3>
				<div>
					<span>User Name</span> <form:input type="text" path="userCredentials.username" id="newUser.userCredentials.username" />
				</div>
				<div>
					<span>Password</span> <form:input type="password" path="userCredentials.password" id="newUser.userCredentials.password" />
				</div>
				<div>
					<span>Confirm Password</span> <form:input type="password"  path="userCredentials.verifyPassword" id="newUser.userCredentials.verifyPassword"/>
				</div>
				<input type="submit" value="submit">

			</div>
			<div class="clearfix"></div>
		</form:form>
	</div>
</div>
<!--//content-->