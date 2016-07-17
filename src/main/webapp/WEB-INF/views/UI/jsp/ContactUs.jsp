<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!-- grow -->
<div class="grow">
	<div class="container">
		<h2>Contact</h2>
	</div>
</div>
<!-- grow -->
<!--content-->
<div class="contact">

	<div class="container">
		<div class="contact-form">

			<div class="col-md-8 contact-grid">



				<form:form modelAttribute="contactUs">
					<table>
						<tr>
							<td>Name</td>
							<td><form:input path="name" /></td>
							<td><form:errors path="name" cssClass="error"></form:errors></td>
							
							
						</tr>
						<tr>
							<td>Email</td>
							<td><form:input path="email" /></td>
							<td><form:errors path="email" cssClass="error"></form:errors></td>
						</tr>
						<tr>
							<td><label >Subject</label></td>
							<td><form:input path="subject" /></td>
							<td><form:errors path="subject" cssClass="error"></form:errors></td>
							
						</tr>
						<tr>
							<td><label >Message</label></td>
							<td><form:textarea id="message" path="message" rows="2" /></td>
							<td><form:errors path="message" cssClass="error"></form:errors></td>
							
							
						</tr>
						<tr>
							<td colspan="2"><input type="submit" value="Submit" /></td>
						</tr>
					</table>
				</form:form>
			</div>
			<div class="col-md-4 contact-in">

				<div class="address-more">
					<h4>Address</h4>
					<p>The company name,</p>
					<p>Lorem ipsum dolor,</p>
					<p>Glasglow Dr 40 Fe 72.</p>
				</div>
				<div class="address-more">
					<h4>Address1</h4>
					<p>Tel:1115550001</p>
					<p>Fax:190-4509-494</p>
					<p>
						Email:<a href="mailto:contact@example.com">
							contact@example.com</a>
					</p>
				</div>

			</div>
			<div class="clearfix"></div>
		</div>
		<div class="map">
			<iframe
				src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d37494223.23909492!2d103!3d55!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x453c569a896724fb%3A0x1409fdf86611f613!2sRussia!5e0!3m2!1sen!2sin!4v1415776049771"></iframe>
		</div>
	</div>

</div>
<!--//content-->
