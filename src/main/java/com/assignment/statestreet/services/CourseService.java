package com.assignment.statestreet.services;

import com.assignment.statestreet.exception.student.InvalidDetailsException;
import com.assignment.statestreet.model.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {

    void addCourse(final Course course) throws InvalidDetailsException;
    Optional<List<Course>> getAllCourses();

    Optional<Course> getCourseViaId(final Long id);

    Optional<Course> getCourseViaName(final String id);

    void removeCourse(final Long id);

}
