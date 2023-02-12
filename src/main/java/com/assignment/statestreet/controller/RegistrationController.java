package com.assignment.statestreet.controller;

import com.assignment.statestreet.exception.student.InvalidDetailsException;
import com.assignment.statestreet.model.RegistrationRequest;
import com.assignment.statestreet.model.Student;
import com.assignment.statestreet.services.RegistrationService;
import com.assignment.statestreet.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;
    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping("/add")
    ResponseEntity addRegistration(@RequestBody RegistrationRequest request) throws InvalidDetailsException {
        registrationService.addRegistration(request);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
