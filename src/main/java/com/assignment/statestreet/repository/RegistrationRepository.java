package com.assignment.statestreet.repository;

import com.assignment.statestreet.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}
