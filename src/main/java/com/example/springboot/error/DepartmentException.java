package com.example.springboot.error;

public class DepartmentException extends  Exception{
    public DepartmentException(String message) {
        super(message);
    }

    public DepartmentException(String message, Throwable se) {
        super(message, se);
    }
}
