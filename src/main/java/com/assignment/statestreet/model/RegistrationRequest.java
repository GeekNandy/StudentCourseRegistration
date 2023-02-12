package com.assignment.statestreet.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegistrationRequest {
    String studentName;
    String courseName;
    String studentEmail;
}
