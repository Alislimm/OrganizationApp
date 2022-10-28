package com.example.OrganizationApp.employee.Services.Impl;

import com.example.OrganizationApp.employee.Models.Employee;
import com.example.OrganizationApp.employee.Repositories.EmployeeRepository;
import com.example.OrganizationApp.employee.Services.EmployeeService;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Class getModelClass() {
        return Employee.class;
    }

    @Override
    public EmployeeRepository getRepository() {
        return employeeRepository;
    }

    @Override
    public ModelMapper getModelMapper() {
        return modelMapper;
    }
}
