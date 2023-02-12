package com.assignment.statestreet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "Registration")
public class Registration {
    @Id
    @GeneratedValue
    private Long id;

}
