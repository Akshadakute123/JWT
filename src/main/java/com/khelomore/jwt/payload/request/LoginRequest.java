package com.khelomore.jwt.payload.request;


public class LoginRequest {
	
	private String username;
   private String mobilenumber;
	
	private String password;

	public String getUsername() {
		return username;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
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
}
