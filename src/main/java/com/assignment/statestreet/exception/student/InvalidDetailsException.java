package com.assignment.statestreet.exception.student;

public class InvalidDetailsException extends Exception {
    public InvalidDetailsException(Error error) {
        super(error.errorMessage());
    }
}
