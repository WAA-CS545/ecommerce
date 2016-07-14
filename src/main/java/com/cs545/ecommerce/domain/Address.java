package com.cs545.ecommerce.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import java.io.Serializable;

public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8499189190508273701L;


	private Long id = null;

	@NotEmpty
	private String street;

	@NotEmpty
	private String zipcode;
	
	@NotEmpty
	private String city;

	private User user;

	/**
	 * No-arg constructor for JavaBean tools
	 */
	public Address() {
	}

	/**
	 * Full constructor
	 */
	public Address(String street, String zipcode, String city) {
		this.street = street;
		this.zipcode = zipcode;
		this.city = city;
	}

	// ********************** Accessor Methods ********************** //

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	// ********************** Common Methods ********************** //

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Address))
			return false;

		final Address address = (Address) o;

		if (!city.equals(address.city))
			return false;
		if (!street.equals(address.street))
			return false;
		if (!zipcode.equals(address.zipcode))
			return false;

		return true;
	}

	public int hashCode() {
		int result;
		result = street.hashCode();
		result = 29 * result + zipcode.hashCode();
		result = 29 * result + city.hashCode();
		return result;
	}

	public String toString() {
		return "Street: '" + getStreet() + "', " + "Zipcode: '" + getZipcode() + "', " + "City: '" + getCity() + "'";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	// ********************** Business Methods ********************** //

}
