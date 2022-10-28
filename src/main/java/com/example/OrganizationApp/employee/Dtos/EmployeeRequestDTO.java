package com.example.OrganizationApp.employee.Dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.Column;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeRequestDTO {
    private String name;
    private String age;
    private String email;
    private String phoneNumber;
    private UUID departementId;
}
