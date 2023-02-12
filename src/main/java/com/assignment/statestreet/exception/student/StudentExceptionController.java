package com.assignment.statestreet.exception.student;

import com.assignment.statestreet.utils.StudentExceptionMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentExceptionController {
    @ExceptionHandler(value = InvalidDetailsException.class)
    public ResponseEntity<Object> invalidDetailsException(InvalidDetailsException exception) {
        return new ResponseEntity<>(StudentExceptionMessage.INVALID_STUDENT, HttpStatus.BAD_REQUEST);
    }
}
