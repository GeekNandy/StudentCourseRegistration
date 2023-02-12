package com.assignment.statestreet.utils;

public enum GlobalExceptionMessage {
    NO_SUCH_ELEMENT("There are no results for the given query/inputs");
    private final String message;
    GlobalExceptionMessage(String message) {
        this.message = message;
    }
}
