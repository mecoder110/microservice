package com.rizvi.userservices.model;


public class User {

	private String userName;
	private String profile;

	public User() {
		super();
	}

	public User(String userName, String profile) {
		super();
		this.userName = userName;
		this.profile = profile;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getProfil() {
		return profile;
	}

	public void setProfil(String profile) {
		this.profile = profile;
	}

}
