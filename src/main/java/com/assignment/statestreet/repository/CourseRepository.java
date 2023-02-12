package com.assignment.statestreet.repository;

import com.assignment.statestreet.model.Course;
import com.assignment.statestreet.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Long> {
    @Query(value="From STUDENT s where s.email = :name")
    Optional<Course> getCourseViaName(@Param("name") final String name);
}
