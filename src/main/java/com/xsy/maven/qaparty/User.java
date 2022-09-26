package com.xsy.maven.qaparty;

public class User {
	private String userId;
	private String userName;
	private String password;
	private String phone;
	private String identity;
	
	public User() {  //无参构造
		super();
		// TODO Auto-generated constructor stub
	}

	
	public User(String userId, String userName, String pwd, String phone, String identity) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = pwd;
		this.phone = phone;
		this.identity = identity;
	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", pwd=" + password + ", phone=" + phone + ", identity="
				+ identity + "]";
	}
	
	
	
}
