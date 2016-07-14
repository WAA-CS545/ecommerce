package com.cs545.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs545.ecommerce.repository.UserCredentialsDao;
import com.cs545.ecommerce.domain.Authority;
import com.cs545.ecommerce.domain.UserCredentials;
import com.cs545.ecommerce.service.UserCredentialsUserNameAlreadyExistsException;

@Service
@Transactional
public class UserCredentialsServiceImpl implements com.cs545.ecommerce.service.UserCredentialsService {

	@Autowired
	private UserCredentialsDao userCredentialsDao;

	public void save(UserCredentials userCredentials) {
		Authority auth = new Authority();
		auth.setAuthority("ROLE_USER");
		auth.setUsername(userCredentials.getUsername());
		userCredentials.addAuthority(auth);
		try{
			userCredentialsDao.save(userCredentials);
		}
		catch(DataIntegrityViolationException ex){
			throw new UserCredentialsUserNameAlreadyExistsException(ex);
		}
		
	}

	public UserCredentials update(UserCredentials userCredentials) {
		return userCredentialsDao.update(userCredentials);
	}

	public List<UserCredentials> findAll() {
		return (List<UserCredentials>) userCredentialsDao.findAll();
	}

	public UserCredentials findOne(Long id) {
		return userCredentialsDao.findOne(id);
	}

	public UserCredentials findByUserName(String userName) {
		return userCredentialsDao.findByUserName(userName);
	}

	@Override
	public void delete(Long id) {
		userCredentialsDao.delete(id);

	}
}
