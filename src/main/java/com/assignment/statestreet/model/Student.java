package com.assignment.statestreet.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Entity(name = "STUDENT")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "Name")
    @NonNull
    private String name;

    @Column(name = "email")
    @NonNull
    private String email;

}
