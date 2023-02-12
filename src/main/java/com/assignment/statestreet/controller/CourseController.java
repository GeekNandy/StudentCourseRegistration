package com.assignment.statestreet.controller;

import com.assignment.statestreet.exception.student.InvalidDetailsException;
import com.assignment.statestreet.model.Course;
import com.assignment.statestreet.services.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    CourseService courseService;

    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping("/add")
    ResponseEntity addStudent(@RequestBody Course course) throws InvalidDetailsException {
        courseService.addCourse(course);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/all")
    ResponseEntity<List<Course>> getAllStudents() {
        Optional<List<Course>> courses = courseService.getAllCourses();
        return new ResponseEntity<>(courses.get(), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/search/email")
    ResponseEntity<Course> getStudentViaId(final Long id) {
        Optional<Course> course = courseService.getCourseViaId(id);
        return new ResponseEntity<>(course.get(), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @DeleteMapping("/remove/{id}")
    ResponseEntity<Course> removeStudentViaId(@PathVariable final Long id) {
        courseService.removeCourse(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
