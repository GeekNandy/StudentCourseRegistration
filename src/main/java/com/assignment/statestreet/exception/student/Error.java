package com.assignment.statestreet.exception.student;

public enum Error {

    INVALID_NAME("The Name is Invalid");
    private final String e;
    Error(String e) {
        this.e = e;
    }
    String errorMessage() {
        return e;
    }
}
