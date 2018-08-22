package com.orion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orion.roles.Role;

/*
 * created by Digvijay Singh on 22/08/2018
 * 
 * this is a Role Repository for Role data for orion APP
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {
	Role findByRole(String role);
}
