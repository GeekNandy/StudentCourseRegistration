package com.assignment.statestreet.repository;

import com.assignment.statestreet.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(value="From STUDENT s where s.email = :email")
    Optional<Student> getStudentByEmail(@Param("expId") final String email);

    @Query(value="From STUDENT s where s.id in (SELECT studentID from Registration r where r.courseID = (SELECT ID from COURSE c WHERE c.Name := name))) order by s.name")
    Optional<List<Student>> getStudentsViaCourse(final String name);

}
