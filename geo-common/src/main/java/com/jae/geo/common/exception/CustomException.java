package com.jae.geo.common.exception;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException{

    private ErrorCode errorCode;

    public CustomException(ErrorCode errorCode){
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public CustomException(ErrorCode errorCode , String detail){
        super(errorCode.getMessage() + ": " + detail);
        this.errorCode = errorCode;
    }

}
