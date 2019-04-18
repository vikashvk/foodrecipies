package com.restrobilling.restroSys.bean;

import javax.validation.constraints.Min;

public class Credentials {
	
	@Min(value=2,message="Must be length of two")
	private String userName;
	@Min(value=2,message="Must be length of two")
	private String password;
	
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
	
	
	
	

}
