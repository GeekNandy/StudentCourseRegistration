package com.assignment.statestreet.repository;

import com.assignment.statestreet.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
