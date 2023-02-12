package com.assignment.statestreet.services;

import com.assignment.statestreet.exception.student.InvalidDetailsException;
import com.assignment.statestreet.model.RegistrationRequest;
import com.assignment.statestreet.model.Student;

public interface RegistrationService {
    void addRegistration(final RegistrationRequest request) throws InvalidDetailsException;
}
