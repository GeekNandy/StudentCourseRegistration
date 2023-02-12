package com.assignment.statestreet.services;

import com.assignment.statestreet.exception.student.InvalidDetailsException;
import com.assignment.statestreet.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    void addStudent(final Student student) throws InvalidDetailsException;
    List<Student> getAllStudents();
    Optional<Student> getStudentViaEmail(final String email);

    Optional<Student> getStudentViaId(final Long id);

    Optional<List<Student>> getStudentsViaCourse(final String name);

    void removeStudent(final Long id);
}
