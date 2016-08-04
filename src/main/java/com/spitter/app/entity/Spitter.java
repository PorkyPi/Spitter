package com.spitter.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Spitter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int spitterId;
	private String username;
	private String password;
	private String fullName;
	private String email;
	private boolean updateByEmail;
	
	public int getSpitterId() {
		return spitterId;
	}
	public void setSpitterId(int spitterId) {
		this.spitterId = spitterId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isUpdateByEmail() {
		return updateByEmail;
	}
	public void setUpdateByEmail(boolean updateByEmail) {
		this.updateByEmail = updateByEmail;
	}
	
}
