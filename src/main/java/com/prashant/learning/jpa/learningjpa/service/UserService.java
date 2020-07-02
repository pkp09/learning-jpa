package com.prashant.learning.jpa.learningjpa.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.prashant.learning.jpa.learningjpa.entity.User;

@Repository
@Transactional
public class UserService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}
	
	
	
}
