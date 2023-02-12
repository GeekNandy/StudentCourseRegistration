package com.assignment.statestreet.controller;

import com.assignment.statestreet.exception.student.InvalidDetailsException;
import com.assignment.statestreet.model.RegistrationRequest;
import com.assignment.statestreet.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;

    @PostMapping("/add")
    ResponseEntity addRegistration(@RequestBody RegistrationRequest request) throws InvalidDetailsException {
        registrationService.addRegistration(request);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
