package com.omnichannel.Omnichannel.exception;

public class InvalidCredentialsException extends Exception {

    public InvalidCredentialsException() {
        super("Invalid username or password");
    }
}
