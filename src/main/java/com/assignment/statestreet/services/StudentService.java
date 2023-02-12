package com.assignment.statestreet.services;

import com.assignment.statestreet.exception.student.InvalidDetailsException;
import com.assignment.statestreet.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public void addStudent(final Student student) throws InvalidDetailsException;
    public List<Student> getAllStudents();
    public Student getStudentViaEmail(final String email);

    Optional<Student> getStudentViaId(final Long id);

    void removeStudent(final Long id);
}
