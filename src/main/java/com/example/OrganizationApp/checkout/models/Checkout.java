package com.example.OrganizationApp.checkout.models;

import com.areeba.common.BaseEntity;
import com.example.OrganizationApp.employee.Models.Employee;
import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "checkout")
public class Checkout extends BaseEntity {
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Employee.class)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(name = "departure_time")
    private String departureTime;

    @Column(name = "day")
    private String day;
}
