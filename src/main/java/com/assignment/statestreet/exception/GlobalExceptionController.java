package com.assignment.statestreet.exception;

import com.assignment.statestreet.exception.student.InvalidDetailsException;
import com.assignment.statestreet.utils.GlobalExceptionMessage;
import com.assignment.statestreet.utils.StudentExceptionMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class GlobalExceptionController {
    @ExceptionHandler(value = NoSuchElementException.class)
    public ResponseEntity<Object> noSuchElementException(final NoSuchElementException exception) {
        exception.printStackTrace();
        return new ResponseEntity<>(GlobalExceptionMessage.NO_SUCH_ELEMENT, HttpStatus.BAD_REQUEST);
    }
}
