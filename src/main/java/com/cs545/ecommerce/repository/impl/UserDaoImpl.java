package com.cs545.ecommerce.repository.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cs545.ecommerce.repository.UserDao;
import com.cs545.ecommerce.domain.User;


@Repository
public class UserDaoImpl  implements UserDao {

	public UserDaoImpl() {
		
		}

	public User findByEmail(String email) {
	     return null;
	}

	@Override
	public void save(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll(String s, Object hint) {
		// TODO Auto-generated method stub
		return null;
	}
 }