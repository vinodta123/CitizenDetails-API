package com.digitalworksolutions.util;


public class CustomErrorType {

    private String errorMessage;
    private String errorCode;
    

    public CustomErrorType(String errorCode, String errorMessage){
        this.errorMessage = errorMessage;
        this.errorCode=errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
    
    public String getErrorCode() {
        return errorCode;
    }

}
