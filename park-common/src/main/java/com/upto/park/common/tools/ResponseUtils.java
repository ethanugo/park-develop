package com.upto.park.common.tools;



import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

/**
 * 返回对象工具类
 */
public class ResponseUtils {
	
	private static final String SUCCESS_CODE = "0";

	private ResponseUtils(){}
	
	public static  <T> ResponseData<T> buildSuccessData(T data){
		ResponseData<T> result = new ResponseData<>();
		result.setData(data);
		result.setErrorCode(SUCCESS_CODE);
		result.setErrorMsg("");
		return  result;
	}
	
	public static <T> ResponseData<T> buildErrorData(String errorCode, String errorMsg, T data){
		ResponseData<T> result = new ResponseData<>();
		result.setErrorCode(errorCode);
		result.setErrorMsg(errorMsg);
		result.setData(data);
		return  result;
	}

	public static <T> ResponseData<T> buildErrorData(String errorCode, String errorMsg ){
		return  buildErrorData(errorCode,errorMsg, null);
	}

	public static ResponseData<?> buildErrorData(String errorCode,
			BindingResult result) {

		StringBuilder errorMsg = new StringBuilder("");
		for(FieldError error : result.getFieldErrors()){
			errorMsg = errorMsg.append(error.getDefaultMessage() + "\n");
		}
		return buildErrorData(errorCode,errorMsg.toString());
	}
}
