package com.miniuber.javaapp.entity;

public class User {
	private int userId;
	private String name;
	private String emailAddress;
	private String password;

	public User() {
	}

	public User(String name, String emailAddress, String password) {
		this.name = name;
		this.emailAddress = emailAddress;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", emailAddress=" + emailAddress + ", password=" + password
				+ "]";
	}
}
