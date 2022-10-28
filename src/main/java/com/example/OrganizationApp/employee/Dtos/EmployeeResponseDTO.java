package com.example.OrganizationApp.employee.Dtos;

import com.example.OrganizationApp.departement.dtos.DepartementResponseDTO;
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
public class EmployeeResponseDTO {
    private UUID id;
    private String name;
    private DepartementResponseDTO departement;
}
