package com.cs545.ecommerce.repository.impl;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cs545.ecommerce.repository.UserDao;
import com.cs545.ecommerce.domain.User;


@Repository
public class UserDaoImpl extends GenericDaoImpl<User> implements UserDao {

	public UserDaoImpl() {
		super.setDaoType(User.class );
		}

	public User findByEmail(String email) {
	     
		Query query = entityManager.createQuery("select u from User u  where u.email =:email");
		return (User) query.setParameter("email", email).getSingleResult();
	}
 }