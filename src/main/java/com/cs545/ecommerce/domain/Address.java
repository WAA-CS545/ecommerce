package com.cs545.ecommerce.domain;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8499189190508273701L;


	private Long id = null;

	@NotEmpty(message="{NotEmpty.Address.street.validation}")
	private String street;

	@NotEmpty(message="{NotEmpty.Address.zipcode.validation}")
	private String zipcode;
	
	@NotEmpty(message="{NotEmpty.Address.city.validation}")
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

	@Override
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

	@Override
	public int hashCode() {
		int result;
		result = street.hashCode();
		result = 29 * result + zipcode.hashCode();
		result = 29 * result + city.hashCode();
		return result;
	}

	@Override
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
