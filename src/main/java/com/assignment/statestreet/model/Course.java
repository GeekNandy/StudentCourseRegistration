package com.assignment.statestreet.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.mapping.Table;

@Data
@Entity(name = "course")
public class Course {
    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private int credits;

}
