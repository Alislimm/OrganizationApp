package com.example.OrganizationApp.departement.models;

import com.areeba.common.BaseEntity;
import com.example.OrganizationApp.employee.Models.Employee;
import com.example.OrganizationApp.organization.models.Organization;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "departement")
public class Departement extends BaseEntity {
    @Column(name = "name")
    private String name;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Organization.class)
    @JoinColumn(name = "organization_id")
    private Organization organization;

}
