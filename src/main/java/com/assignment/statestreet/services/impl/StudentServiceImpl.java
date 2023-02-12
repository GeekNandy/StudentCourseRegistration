package com.assignment.statestreet.services.impl;

import com.assignment.statestreet.exception.student.InvalidDetailsException;
import com.assignment.statestreet.model.Student;
import com.assignment.statestreet.repository.StudentRepository;
import com.assignment.statestreet.services.StudentService;
import com.assignment.statestreet.exception.student.Error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void addStudent(final Student student) throws InvalidDetailsException {
        if(student.getName().contains("[A-Za-z]")) studentRepository.save(student);
        else throw new InvalidDetailsException(Error.INVALID_NAME);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentViaEmail(final String email) {
        return studentRepository.getStudentByEmail(email);
    }

    @Override
    public Optional<Student> getStudentViaId(final Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void removeStudent(final Long id) {
        studentRepository.deleteById(id);
    }

}
