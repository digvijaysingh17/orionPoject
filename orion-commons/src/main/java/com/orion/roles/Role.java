package com.orion.roles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

/*
 * created by Digvijay Singh on 22/08/2018
 * 
 * this is an entity to manage role data for orion APP
 */

@Entity(name = "role")
public class Role {

	@Id
	@SequenceGenerator(name = "userSeqGen", sequenceName = "myDbUserSeq", initialValue = 1, allocationSize = 50)
	@GeneratedValue(generator = "userSeqGen")
	@Column(name = "role_id")
	private int id;

	@NotNull(message = "Not a Valid Role Entry")
	@Column(name = "role")
	private String role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
