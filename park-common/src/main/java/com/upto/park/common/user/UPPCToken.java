package com.upto.park.common.user;

import java.io.Serializable;


public class UPPCToken implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3633418400573265671L;

	private String username;
	private String password;
	private String captcha;
	private String sessionId;

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
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
	
}
