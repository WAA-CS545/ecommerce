package com.cs545.ecommerce.repository.impl;

 

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cs545.ecommerce.repository.UserCredentialsDao;
import com.cs545.ecommerce.domain.UserCredentials;

 
@Repository
public class UserCredentialsDaoImpl extends GenericDaoImpl<UserCredentials> implements UserCredentialsDao {

	public UserCredentialsDaoImpl() {
		super.setDaoType(UserCredentials.class );
		}

	public UserCredentials findByUserName(String userName) {

		Query query = entityManager.createQuery("select m from CREDENTIALS m  where m.username =:userName");
		return (UserCredentials) query.setParameter("userName", userName).getSingleResult();

	}

 
 }