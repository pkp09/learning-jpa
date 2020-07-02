package com.prashant.learning.jpa.learningjpa.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.prashant.learning.jpa.learningjpa.entity.User;
import com.prashant.learning.jpa.learningjpa.repository.UserRepository;

@Component
public class UserRepositoryServiceCommandLineRunner implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserRepository userService;

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Aayansh", "SuperAdmin");
		userService.save(user);
		logger.error("New User is Created : "+ user);
	}

}
