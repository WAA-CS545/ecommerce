package com.cs545.ecommerce.repository;

import com.cs545.ecommerce.domain.User;

public interface UserDao extends GenericDao<User> {
      
	public User findByEmail(String email);
}
