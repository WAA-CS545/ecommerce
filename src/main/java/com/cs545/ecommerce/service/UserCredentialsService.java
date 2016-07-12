package com.cs545.ecommerce.service;

import java.util.List;

import com.cs545.ecommerce.domain.UserCredentials;
 
public interface UserCredentialsService {
	
	public void save(UserCredentials userCredentials);

	public UserCredentials update(UserCredentials userCredentials);

	public List<UserCredentials> findAll();

	public UserCredentials findOne(Long id);

	public void delete(Long id);

	public UserCredentials findByUserName(String userName);
 }
