package com.dgstack.dev.model;

public class User {

	public User() {
	}

	
	
	public User(String name, String userId) {
		super();
		this.name = name;
		this.userId = userId;
	}



	private String name;
	private String userId;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
