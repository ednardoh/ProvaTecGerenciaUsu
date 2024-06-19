package com.gerenciausuarios.gerenciausu.framework.globalExceptionHandling;

public class BusinessException extends ExceptionCustomized{
    public BusinessException(String code, String message) {
        super(code, message);
    }
}

