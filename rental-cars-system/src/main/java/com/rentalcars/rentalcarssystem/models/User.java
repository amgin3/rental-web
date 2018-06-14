package com.rentalcars.rentalcarssystem.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

//	@NotNull
	// @Size(min = 3, max = 80)
	private String username;

//	@NotNull
	// @Size(min = 2, max = 80)
	private String password;

	public User() {
	}

	public User(long id) {
		this.id = id;
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public String getUser_name() {
		return username;
	}

	public void setUser_name(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
