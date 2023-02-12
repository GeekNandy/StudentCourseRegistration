package com.assignment.statestreet.repository;

import com.assignment.statestreet.model.Course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    @Query(value="From COURSE c where c.name = :name")
    Optional<Course> getCourseViaName(@Param("name") final String name);

}
