package com.assignment.statestreet.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "REGISTRATION")
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Student_ID")
    @NonNull
    private Long studentID;

    @Column(name = "Course_ID")
    @NonNull
    private Long courseID;

}
