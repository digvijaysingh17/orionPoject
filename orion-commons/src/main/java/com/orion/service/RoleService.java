package com.orion.service;

import com.orion.roles.Role;

/*
 * created by Digvijay Singh on 22/08/2018
 * 
 * this is a Role Service for Role data for orion APP
 */
public interface RoleService {
	Role findByRole(String role);
}
