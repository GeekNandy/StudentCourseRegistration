package com.assignment.statestreet.controller;

import com.assignment.statestreet.exception.student.InvalidDetailsException;
import com.assignment.statestreet.model.Student;
import com.assignment.statestreet.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    ResponseEntity addStudent(@RequestBody Student student) throws InvalidDetailsException {
        studentService.addStudent(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/all")
    ResponseEntity<List<Student>> getAllStudents() {
        List<Student> al = studentService.getAllStudents();
        return new ResponseEntity<>(al, HttpStatus.OK);
    }

    @GetMapping("/search/email")
    ResponseEntity<Student> getStudentViaEmail(final String email) {
        Optional<Student> student = studentService.getStudentViaEmail(email);
        return new ResponseEntity<>(student.get(), HttpStatus.OK);
    }

    /*@CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/search/{id}")
    ResponseEntity<Student> getStudentViaId(@PathVariable final Long id) {
        Optional<Student> student = studentService.getStudentViaId(id);
        return new ResponseEntity<>(student.get(), HttpStatus.OK);
    }*/

    @GetMapping("/search/{course}")
    ResponseEntity<List<Student>> getStudentsViaCourse(@PathVariable final String course) {
        Optional<List<Student>> student = studentService.getStudentsViaCourse(course);
        return new ResponseEntity<>(student.get(), HttpStatus.OK);
    }

    @DeleteMapping("/remove/{id}")
    ResponseEntity<Student> removeStudentViaId(@PathVariable final Long id) {
        studentService.removeStudent(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
