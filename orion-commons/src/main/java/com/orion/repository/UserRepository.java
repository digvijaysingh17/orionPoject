package com.orion.repository;

import com.orion.users.User;

import org.springframework.data.jpa.repository.JpaRepository;

/*
 * created by Digvijay Singh on 22/08/2018
 * 
 * this is a User Repository for User data for orion APP
 */
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByEmail(String email);
}
