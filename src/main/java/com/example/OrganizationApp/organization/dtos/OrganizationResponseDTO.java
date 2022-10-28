package com.example.OrganizationApp.organization.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrganizationResponseDTO {
    private UUID id;
    private String name;
    private String status;
}
