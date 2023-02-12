package com.assignment.statestreet.repository;

import com.assignment.statestreet.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(value="From STUDENT s where s.email = :email")
    Student getStudentByEmail(@Param("expId") final String email);

}
