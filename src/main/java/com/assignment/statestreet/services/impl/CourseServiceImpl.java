package com.assignment.statestreet.services.impl;

import com.assignment.statestreet.exception.student.Error;
import com.assignment.statestreet.exception.student.InvalidDetailsException;
import com.assignment.statestreet.model.Course;
import com.assignment.statestreet.repository.CourseRepository;
import com.assignment.statestreet.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;
    @Override
    public void addCourse(final Course course) throws InvalidDetailsException {
        if(course.getName().contains("[A-Za-z]")) courseRepository.save(course);
        else throw new InvalidDetailsException(Error.INVALID_NAME);
    }

    @Override
    public Optional<List<Course>> getAllCourses() {
        return Optional.of(courseRepository.findAll());
    }

    @Override
    public Optional<Course> getCourseViaId(final Long id) {
        return Optional.of(courseRepository.getReferenceById(id));
    }

    @Override
    public Optional<Course> getCourseViaName(String name) {
        return courseRepository.getCourseViaName(name);
    }

    @Override
    public void removeCourse(final Long id) {
        courseRepository.deleteById(id);
    }
}
