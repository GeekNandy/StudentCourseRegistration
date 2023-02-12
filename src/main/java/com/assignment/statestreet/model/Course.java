package com.assignment.statestreet.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.UniqueConstraint;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "course")
public class Course {

    @Id
    private Long id;

    @Column(name = "Name", unique = true)
    @NonNull
    private String name;

    @Column(name = "Credits")
    @NonNull
    private int credits;

    @Column(name = "Duration")
    @NonNull
    private int duration;

}
