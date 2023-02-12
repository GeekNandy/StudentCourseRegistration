package com.assignment.statestreet.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class RegistrationRequest {
    String studentName;
    String courseName;
    String studentEmail;
}
