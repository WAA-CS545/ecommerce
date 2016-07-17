package com.cs545.ecommerce.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3855561356507854561L;


	private Long id = null;


	@NotEmpty(message="{NotEmpty.User.firstName.validation}")
	private String firstName;

	@NotEmpty(message="{NotEmpty.User.lastName.validation}")
	private String lastName;

	@NotEmpty(message="{NotEmpty.User.email.validation}")
	@Pattern(regexp="^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$", message="{Pattern.User.email.validation}")
	private String email;

	@Valid
	private UserCredentials userCredentials;

	@Valid
	private Address address = new Address();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastname) {
		this.lastName = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
		this.userCredentials.setUser(this);
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	//	public Set<Item> getBoughtItems() {
	//	return boughtItems;
	//}
	//
	//public void setBoughtItems(Set<Item> boughtItems) {
	//	this.boughtItems = boughtItems;
	//}
	//
	//public void addBoughtItem(Item boughtItem) {
	//	this.boughtItems.add(boughtItem);
	//}
}