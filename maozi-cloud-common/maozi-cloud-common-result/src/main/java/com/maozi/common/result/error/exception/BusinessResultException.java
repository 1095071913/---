package com.maozi.common.result.error.exception;

import static com.maozi.common.BaseCommon.error;

import com.maozi.base.CodeData;
import com.maozi.common.result.error.ErrorResult;
import lombok.Data;

@Data
public class BusinessResultException extends RuntimeException {

    private static final long serialVersionUID = 3034121940056795549L;
    
    private ErrorResult errorResult;
    
    public BusinessResultException(String message) {
        super(message);
        this.errorResult = error(new CodeData(message));
    }
    
    public BusinessResultException(String message,Integer httpCode) {
        super(message);
        this.errorResult = error(new CodeData(message),httpCode);
    }
    
    public BusinessResultException(Integer code,String message) {
        super(message);
        this.errorResult = error(new CodeData(code,message),code);
    }
    
    public BusinessResultException(Integer code,String message,Integer httpCode) {
        super(message);
        this.errorResult = error(new CodeData(code,message),httpCode);
    }

    public BusinessResultException(CodeData codeData) {
        super(codeData.getMessage());
        this.errorResult = error(codeData);
    }

    public BusinessResultException(String serviceName,CodeData codeData) {
        super(serviceName + codeData.getMessage());
        this.errorResult = error(serviceName,codeData);
    }

    public BusinessResultException(String serviceName,CodeData codeData,Integer httpCode) {
        super(serviceName + codeData.getMessage());
        this.errorResult = error(serviceName,codeData);
    }
    
    public BusinessResultException(CodeData codeData,Integer httpCode) {
        super(codeData.getMessage());
        this.errorResult = error(codeData,httpCode);
    }

    public <D> BusinessResultException(CodeData codeData,D errorData) {
        super(codeData.getMessage());
        this.errorResult = error(codeData,errorData);
    }

    public <D> BusinessResultException(CodeData codeData,D errorData,Integer httpCode) {
        super(codeData.getMessage());
        this.errorResult = error(codeData,errorData,httpCode);
    }
    
    public BusinessResultException(ErrorResult errorResult) {
        super(errorResult.getMessage());
        this.errorResult = errorResult;
    }
    
    public BusinessResultException(ErrorResult errorResult,Integer httpCode) {
        super(errorResult.getMessage());
        this.errorResult = errorResult;
    }
    
}