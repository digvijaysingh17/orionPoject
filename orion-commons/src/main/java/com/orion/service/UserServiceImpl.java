package com.orion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orion.repository.UserRepository;
import com.orion.users.User;

/*
 * created by Digvijay Singh on 22/08/2018
 * 
 * this is a User ServiceImpl for user data for orion APP
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;

	@Override
	public User findByEmail(String email) {
		return userRepo.findByEmail(email);
	}

}
