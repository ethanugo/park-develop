package com.upto.park.common.user;


import com.upto.park.common.redis.RedisClientTemplate;

public class CaptchaHelper {


	private static final String LOGIN_KEY = "LOGIN_COUNT";
	
	
	private CaptchaHelper(){}
	
	
	public static boolean incrLoginCount(String userName) {

		RedisClientTemplate template = RedisClientTemplate.getTemplate();
		
		template.incr(LOGIN_KEY+":"+userName.toUpperCase());
		
		template.expire( LOGIN_KEY+":"+userName.toUpperCase(), 24 * 3600);

		return false;

	}

}
