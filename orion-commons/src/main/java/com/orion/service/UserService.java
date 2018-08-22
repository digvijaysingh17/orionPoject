package com.orion.service;

import com.orion.users.User;

/*
 * created by Digvijay Singh on 22/08/2018
 * 
 * this is a User Service for User data for orion APP
 */
public interface UserService {

	User findByEmail(String role);
}
