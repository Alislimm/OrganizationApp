package com.example.OrganizationApp.attendance.dtos;

import com.example.OrganizationApp.employee.Dtos.EmployeeResponseDTO;
import com.example.OrganizationApp.organization.dtos.OrganizationResponseDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttendanceResponseDTO {
    private UUID id;
    private String name;
//    private EmployeeResponseDTO employee;
}
