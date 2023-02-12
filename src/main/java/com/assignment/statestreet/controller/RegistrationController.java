package com.assignment.statestreet.controller;

import com.assignment.statestreet.model.RegistrationRequest;
import com.assignment.statestreet.model.Student;
import com.assignment.statestreet.services.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    StudentService studentService;
    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping("/add")
    ResponseEntity addStudent(@RequestBody RegistrationRequest request) {
        try {
            studentService.addStudent(new Student(request.getStudentName(), request.getStudentEmail()));
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
