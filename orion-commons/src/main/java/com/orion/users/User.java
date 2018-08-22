package com.orion.users;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/*
 * created by Digvijay Singh on 22/08/2018
 * 
 * this is an entity to manage user data for orion APP
 */
@Entity
@Table(name = "user")
public class User {

	@Id
	@SequenceGenerator(name = "userSeqGen", sequenceName = "myDbUserSeq", initialValue = 1, allocationSize = 50)
	@GeneratedValue(generator = "userSeqGen")
	@Column(name = "user_id")
	private int id;

	@NotNull(message = "Not a Valid Email Entry")
	@Column(name = "email")
	private String email;

	@NotNull(message = "Not a Valid Password Entry")
	@Column(name = "password")
	private String password;

	@NotNull(message = "Not a Valid First Name Entry")
	@Column(name = "first_name")
	private String firstName;

	@NotNull(message = "Not a Valid Last Name Entry")
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "address_list")
	private List<String> addressList;

	@NotNull(message = "Not a Valid Primary Address Entry")
	@Column(name = "primary_address")
	private String primaryAddress;

	@NotNull(message = "Not a Valid UserName Entry")
	@Column(name = "user_name")
	private String userName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}

	public String getPrimaryAddress() {
		return primaryAddress;
	}

	public void setPrimaryAddress(String primaryAddress) {
		this.primaryAddress = primaryAddress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
