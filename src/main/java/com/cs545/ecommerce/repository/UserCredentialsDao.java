package com.cs545.ecommerce.repository;

import com.cs545.ecommerce.domain.UserCredentials;

public interface UserCredentialsDao extends GenericDao<UserCredentials> {
  
	public UserCredentials findByUserName(String userName);
}
