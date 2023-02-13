package com.assignment.statestreet;

import com.assignment.statestreet.exception.student.InvalidDetailsException;
import com.assignment.statestreet.model.Course;
import com.assignment.statestreet.model.Registration;
import com.assignment.statestreet.model.RegistrationRequest;
import com.assignment.statestreet.model.Student;
import com.assignment.statestreet.repository.CourseRepository;
import com.assignment.statestreet.repository.RegistrationRepository;
import com.assignment.statestreet.repository.StudentRepository;
import com.assignment.statestreet.services.CourseService;
import com.assignment.statestreet.services.RegistrationService;
import com.assignment.statestreet.services.StudentService;
import com.assignment.statestreet.services.impl.CourseServiceImpl;
import com.assignment.statestreet.services.impl.RegistrationServiceImpl;
import com.assignment.statestreet.services.impl.StudentServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
class StateStreetApplicationTests {

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentService studentService = new StudentServiceImpl();

    @Mock
    private RegistrationRepository registrationRepository;

    Student s1, s2;
    Course c;

    Registration r;

    @BeforeEach
    void setUp()
    {
        initMocks(this);
        Long sId1 = 1l;
        Long sId2 = 2l;
        Long cId1 = 1l;
        Long rId1 = 1l;
        s1 = Student.builder()
                .id(sId1)
                .name("Alex")
                .email("alex@gmail.com")
                .build();
        s2 = Student.builder()
                .id(sId2)
                .name("Matt")
                .email("matt@gmail.com")
                .build();
        c = Course.builder()
                .id(cId1)
                .name("Engineering")
                .build();
        r = Registration.builder()
                .id(rId1)
                .courseID(cId1)
                .studentID(sId1)
                .build();
    }

    @Test
    void testStudentsOfGivenCourse() {
        List<Student> sl = new ArrayList<>();
        sl.add(s1);
        sl.add(s2);
        when(studentRepository.getStudentsViaCourse("Engineering")).thenReturn(Optional.of(sl));
        assertEquals(2, studentService.getStudentsViaCourse("Engineering").get().size());
    }

    @Test
    void testDeletionOfStudent() {
        Integer i = 1;
        when(registrationRepository.deregisterStudent(1l)).thenReturn(1);
        assertEquals(i, studentService.removeStudent(1l));
    }

    @Test
    void contextLoads() {
    }

}
