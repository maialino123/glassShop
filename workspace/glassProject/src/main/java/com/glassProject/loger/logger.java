package com.glassProject.loger;

public class logger implements ILoger {
	
	private String userName;
	private String password;
	private boolean status;
	
	
	

	public logger(String userName, String password, boolean status) {
		super();
		this.userName = userName;
		this.password = password;
		this.status = status;
	}

	public String getUserName() {
		return this.userName;
	}

	public String getPassWord() {
		return this.password;
	}

	public Boolean getStatus() {
		return this.status;
	}


}
