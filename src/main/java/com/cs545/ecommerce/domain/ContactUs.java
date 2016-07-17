/**
 * 
 */
package com.cs545.ecommerce.domain;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Solomon Kassahun
 *
 */
public class ContactUs {
	public  ContactUs() {}
	
	@NotEmpty(message="{NotEmpty.ContactUs.name.validation}")
	private String name;
	
	
	@NotEmpty(message="{NotEmpty.ContactUs.email.validation}")
	@Pattern(regexp="^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$", message="{Pattern.ContactUs.email.validation}")
	private String email;
	
	@NotEmpty(message="{NotEmpty.ContactUs.subject.validaton}")
	private String subject;
	
	@NotEmpty(message="{NotEmpty.Contact.message.validation}")
	private String message;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	

}
