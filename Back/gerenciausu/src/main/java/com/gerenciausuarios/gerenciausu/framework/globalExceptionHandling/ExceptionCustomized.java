package com.gerenciausuarios.gerenciausu.framework.globalExceptionHandling;

public class ExceptionCustomized extends RuntimeException{
    private String code;
    private String message;

    public ExceptionCustomized(String code, String message) {
        super();
        this.code = code;
        this.message = message;
    }
    
    // Getters and Setters

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
