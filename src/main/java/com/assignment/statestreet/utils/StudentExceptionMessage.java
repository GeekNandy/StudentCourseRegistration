package com.assignment.statestreet.utils;

public enum StudentExceptionMessage {
    INVALID_STUDENT("Given Student details are incorrect");
    private final String message;
    StudentExceptionMessage(String message) {
        this.message = message;
    }
}
