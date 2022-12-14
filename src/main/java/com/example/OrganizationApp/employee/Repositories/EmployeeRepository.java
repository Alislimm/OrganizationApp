package com.example.OrganizationApp.employee.Repositories;

import com.example.OrganizationApp.employee.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface EmployeeRepository  extends JpaRepository<Employee, UUID>, JpaSpecificationExecutor<Employee> {
}
