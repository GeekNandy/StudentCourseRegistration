package com.assignment.statestreet.repository;

import com.assignment.statestreet.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(value="From STUDENT s where s.email = :email")
    Optional<Student> getStudentByEmail(@Param("email") final String email);

    @Query(value="From STUDENT s where s.id in (SELECT r.studentID from REGISTRATION r where r.courseID = (SELECT c.id from COURSE c WHERE c.name = :name)) order by s.name")
    Optional<List<Student>> getStudentsViaCourse(@Param("name") final String name);

}
