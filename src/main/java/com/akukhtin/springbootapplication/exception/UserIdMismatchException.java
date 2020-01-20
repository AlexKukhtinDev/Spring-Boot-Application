package com.akukhtin.springbootapplication.exception;

public class UserIdMismatchException extends RuntimeException {
    public UserIdMismatchException(String message) {
        super(message);
    }
}
