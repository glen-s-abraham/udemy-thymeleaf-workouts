package com.glen.thymeleaf.command;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginCommand {
	@NotNull
	private String userName;
	
	@NotNull
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
