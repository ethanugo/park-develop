package com.upto.park.common.user;

import com.alibaba.fastjson.JSONObject;
import com.upto.park.common.redis.RedisClientTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CurrentUserUtil {

	private static final Logger logger = LoggerFactory.getLogger(CurrentUserUtil.class);
	
	private static final String USER_TOKEN_PREFIX = "USER:";
	
	
	private static final int YEAR = 60 * 60 * 24;

	private CurrentUserUtil(){}
	
	public static <T> T getUser(Class<T> clazz){
		T user = null;
		
 		String token = TokenHolder.getHolder().getToken();
		if( null != token){
			
			RedisClientTemplate template  = RedisClientTemplate.getTemplate();
			
			try {
				
				String userJson = template.get(USER_TOKEN_PREFIX + token);
				
				user = JSONObject.parseObject(userJson, clazz);
				
			} catch (Exception e) {
				logger.error("find user error", e);
			}
		}
		return user;
	}
	
	
	
	public static boolean isLogin(String token){
		
		boolean isLogin = false;
		try {

			RedisClientTemplate template  = RedisClientTemplate.getTemplate();
			isLogin = template.exists(USER_TOKEN_PREFIX + token);
			
			if(!isLogin && logger.isErrorEnabled()){
				logger.error("token : " + token + "token authenticated error");
			}
		} catch (Exception e) {

			logger.error("token authenticated error ", e);
		}

		return isLogin;
	}
	
	public static <T> void setUser(String token , T user){
			
		try {
			RedisClientTemplate template  = RedisClientTemplate.getTemplate();
			String userJson = JSONObject.toJSONString(user);
			
			template.set(USER_TOKEN_PREFIX + token, userJson);
			template.expire(USER_TOKEN_PREFIX + token, YEAR);
		} catch (Exception e) {
			logger.error("set user error", e);
		}
		
	}
	
}
