package com.prashant.learning.jpa.learningjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prashant.learning.jpa.learningjpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
