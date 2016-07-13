package com.cs545.ecommerce.repository.impl;

 

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cs545.ecommerce.repository.UserCredentialsDao;
import com.cs545.ecommerce.domain.User;
import com.cs545.ecommerce.domain.UserCredentials;

 
@Repository
public class UserCredentialsDaoImpl implements UserCredentialsDao {

	public UserCredentialsDaoImpl() {
		}

	public UserCredentials findByUserName(String userName) {
		User user = new User();
		user.setFirstName(userName);
		UserCredentials uc = new UserCredentials();
		uc.setUser(user);
		uc.setUsername(userName);
		return uc;
	}

	@Override
	public void save(UserCredentials t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserCredentials findOne(Long id) {
		
		return null;
	}

	@Override
	public UserCredentials update(UserCredentials t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserCredentials> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserCredentials> findAll(String s, Object hint) {
		// TODO Auto-generated method stub
		return null;
	}
}