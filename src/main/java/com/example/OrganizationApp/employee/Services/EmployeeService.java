package com.example.OrganizationApp.employee.Services;

import com.areeba.common.services.CUDService;
import com.areeba.common.services.FindAllService;
import com.areeba.common.services.FindByIdService;
import com.example.OrganizationApp.employee.Dtos.EmployeeRequestDTO;
import com.example.OrganizationApp.employee.Models.Employee;
import com.example.OrganizationApp.employee.Repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;

public interface EmployeeService extends CUDService<Employee, EmployeeRequestDTO, EmployeeRepository>, FindByIdService<Employee, EmployeeRepository>, FindAllService<Employee, EmployeeRepository> {
}

