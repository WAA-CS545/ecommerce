   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
	<!-- grow -->
	<div class="grow">
		<div class="container">
			<h2>Login</h2>
		</div>
	</div>
	<!-- grow -->
<!--content-->
<div class="container">
		<div class="account">
		<div class="account-pass">
		<div class="col-md-8 account-top">
			<c:if test="${not empty error}">
					<div class="alert alert-danger">
						<spring:message code="AbstractUserDetailsAuthenticationProvider.badCredentials"/><br />
					</div>
				</c:if>
					<c:url var="loginUrl" value="/login" />
			    	<form action="${loginUrl}" method="POST">
  					<sec:csrfInput />
                    <fieldset>
			    	  	<div class="form-group">
			    		    <input class="form:input-large" placeholder="User Name" name='username' type="text">
			    		</div>
			    		<div class="form-group">
			    			<input class=" form:input-large" placeholder="Password" name='password'  type="password" value="">
			    		</div>
			    		<input class="btn btn-lg btn-success btn-mini" type="submit" value="Login">
			    		<input type="hidden" name="${_csrf.parameterName}"   value="${_csrf.token}" />
                        
			    	</fieldset>
			    	
			      	</form>
			      	<div class="col-md-4 left-account ">
			      		<a href="<spring:url value='/register' />" class="create">Create an account</a>
			      	</div>
		</div>
		<div class="col-md-4 left-account ">
			<a href="<spring:url value='/Mattrices' />"><img class="img-responsive " src="<spring:url value='/resource/images/s1.jpg' /> " alt=""></a>
			<div class="five">
			<h2>25% </h2><span>discount</span>
			</div>			
<div class="clearfix"> </div>
		</div>
	<div class="clearfix"> </div>
	</div>
	</div>

</div>
