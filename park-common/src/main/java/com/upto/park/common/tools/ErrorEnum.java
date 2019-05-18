package com.upto.park.common.tools;


/**
 * 错误枚举
 */
public enum ErrorEnum {
    SERVICE_ERROR("SERVICE_ERROR","服务异常，请稍后重试"),
    SYSTEM_ERROR("SYSTEM_ERROR","系统异常，请稍后重试");
    private String errorCode;
    private String errorMsg;

    ErrorEnum(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    protected void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    protected void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
