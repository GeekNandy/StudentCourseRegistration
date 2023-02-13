package com.assignment.statestreet.services.impl;

import com.assignment.statestreet.exception.student.InvalidDetailsException;
import com.assignment.statestreet.model.Course;
import com.assignment.statestreet.model.Registration;
import com.assignment.statestreet.model.RegistrationRequest;
import com.assignment.statestreet.model.Student;
import com.assignment.statestreet.repository.RegistrationRepository;
import com.assignment.statestreet.services.CourseService;
import com.assignment.statestreet.services.RegistrationService;
import com.assignment.statestreet.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    StudentService studentService;

    @Autowired
    CourseService courseService;

    @Autowired
    RegistrationRepository registrationRepository;
    @Override
    public void addRegistration(RegistrationRequest request) throws InvalidDetailsException {
        Course course = courseService.getCourseViaName(request.getCourseName()).get();
        String studentEmail = request.getStudentEmail();
        Optional<Student> searchStudent = studentService.getStudentViaEmail(studentEmail);
        Student student;
        if(searchStudent.isPresent()) {
            student = searchStudent.get();
        }
        else {
            student = Student.builder()
                    .name(request.getStudentName())
                    .email(request.getStudentEmail())
                    .build();
            studentService.addStudent(student);
        }
        Registration registration = Registration.builder()
                                        .courseID(course.getId())
                                        .studentID(student.getId())
                                        .build();
        registrationRepository.save(registration);
    }
}
