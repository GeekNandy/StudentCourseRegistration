package com.assignment.statestreet.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
    @GeneratedValue
    private Long id;

    @Column(name = "Student_ID")
    @NonNull
    private Long studentID;

    @Column(name = "Course_ID")
    @NonNull
    private Long courseID;

}
