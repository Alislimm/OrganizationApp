package com.example.OrganizationApp.checkin.models;

import com.areeba.common.BaseEntity;
import com.example.OrganizationApp.employee.Models.Employee;
import com.example.OrganizationApp.organization.models.Organization;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.nimbusds.openid.connect.sdk.BackChannelLogoutRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "checkin")
public class Checkin extends BaseEntity {
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Employee.class)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(name = "arrival_time")
    private String arrivalTime;

    @Column(name = "day")
    private String day;

    @Column(name = "is_checked_out")
    private Boolean isCheckedoutOut = false;


}
