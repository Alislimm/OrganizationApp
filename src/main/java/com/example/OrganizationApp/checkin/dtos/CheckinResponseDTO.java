package com.example.OrganizationApp.checkin.dtos;

import com.example.OrganizationApp.employee.Dtos.EmployeeResponseDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class CheckinResponseDTO {
    private UUID id;
    private String name;
    private EmployeeResponseDTO employee;
}
