package com.example.OrganizationApp.departement.dtos;

import com.example.OrganizationApp.organization.dtos.OrganizationResponseDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class DepartementResponseDTO {
    private UUID id;
    private String name;
    private OrganizationResponseDTO organization;
}
