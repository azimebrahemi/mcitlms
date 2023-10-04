package com.lms.lms.exception;

public class IncomingLetterNotFoudException extends RuntimeException {
    public IncomingLetterNotFoudException(Long id) {
        super("Could not found the Letter with id " + id);
    }
}
