package com.gerenciausuarios.gerenciausu.framework.globalExceptionHandling;

public class NotFoundException extends ExceptionCustomized{
    public NotFoundException(String code, String message) {
        super(code, message);
    }
}

