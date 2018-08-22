package com.orion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orion.repository.RoleRepository;
import com.orion.roles.Role;

/*
 * created by Digvijay Singh on 22/08/2018
 * 
 * this is a Role Service Impl for Role data for orion APP
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository roleRepo;

	@Override
	public Role findByRole(String role) {
		return roleRepo.findByRole(role);
	}

}
