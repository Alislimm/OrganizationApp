package com.example.OrganizationApp.employee.Models;

import com.areeba.common.BaseEntity;
import com.example.OrganizationApp.departement.models.Departement;
import com.example.OrganizationApp.organization.models.Organization;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class Employee extends BaseEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private String age;

    @Column(name = "email")
    private String email;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Departement.class)
    @JoinColumn(name = "departement_id")
    private Departement departement;

}
