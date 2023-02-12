package com.assignment.statestreet.repository;

import com.assignment.statestreet.model.Registration;
import com.assignment.statestreet.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {
    @Modifying
    @Query(value="DELETE From REGISTRATION s where s.studentID = :studentID")
    void deregisterStudent(@Param("studentID") final Long studentID);
}
