package com.cs545.ecommerce.domain;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserCredentials {

	@Size(min = 4, max = 8, message="{Size.UserCredentials.userName.validation}")
	String username;

	String realPassword;
	
	@Size(min = 8, max = 14, message="{Size.UserCredentials.realPassword.validation}")
	String password;
	
	@NotEmpty(message="{NoteEmpty.UserCredentials.verifyPassword}")
	String verifyPassword;
	
	Boolean enabled;

	private User user;

	List<Authority> authority = new ArrayList<Authority>();

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		checkPassword();
	}

	public String getVerifyPassword() {
		return verifyPassword;
	}

	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
		checkPassword();
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public List<Authority> getAuthority() {
		return authority;
	}

	public void setAuthority(List<Authority> authority) {
		this.authority = authority;
	}

	public void addAuthority(Authority authority) {
		this.authority.add(authority);
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private void checkPassword() {
	    if(this.password == null || this.verifyPassword == null){
	        return;
	    }else if(!this.password.equals(verifyPassword)){
	        this.verifyPassword = null;
	    }
	    else{
	    	PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();   		
	   	 	this.realPassword = passwordEncoder.encode(password);
	    }
	}

	public String getRealPassword() {
		return realPassword;
	}

	public void setRealPassword(String realPassword) {
		this.realPassword = realPassword;
	}
}
