package com.upto.park.common.user;


public class TokenHolder extends ThreadLocal<String>{

	
	private static TokenHolder holder;
	
	
	private TokenHolder(){
		super();
	}	
	
	public static TokenHolder getHolder(){
		checkHolder();
		return holder;
	}
	
	public String getToken(){
		checkHolder();
		return holder.get();
	}
	
	public void setToken(String token){
		checkHolder();
		holder.set(token);
		
	}
	
	private static void checkHolder(){
		synchronized (TokenHolder.class) {
			if(null == holder){
				holder = new TokenHolder();
			}
		}
	}
	
}
