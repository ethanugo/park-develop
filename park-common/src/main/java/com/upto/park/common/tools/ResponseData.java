package com.upto.park.common.tools;


import java.io.Serializable;

/**
 * 
*
* @ClassName: ResponseData 
* @Description: 所有restful API 公共返回对象,此对象根据MessageConverter转换成对应的输出
* 
* @param <T>
 */
public class ResponseData<T> implements Serializable {

	private static final long serialVersionUID = -1295538976583295496L;
	private String errorCode;
	private String errorMsg;
	private T data;
	
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
