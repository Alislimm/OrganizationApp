package com.example.OrganizationApp.employee.Controllers;

import com.areeba.common.controller.CUDController;
import com.areeba.common.controller.FindAllController;
import com.areeba.common.controller.FindByIdController;
import com.example.OrganizationApp.constants.PermissionConstant;
import com.example.OrganizationApp.employee.Dtos.EmployeeRequestDTO;
import com.example.OrganizationApp.employee.Dtos.EmployeeResponseDTO;
import com.example.OrganizationApp.employee.Services.EmployeeService;
import org.dmg.pmml.Model;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController implements CUDController<EmployeeRequestDTO, EmployeeResponseDTO, EmployeeService>, FindByIdController<EmployeeResponseDTO, EmployeeService>, FindAllController<EmployeeResponseDTO, EmployeeService> {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public EmployeeService getService() {
        return employeeService;
    }

    @Override
    public Class getResponseClass() {
        return EmployeeResponseDTO.class;
    }

    @Override
    public ModelMapper getModelMapper() {
        return modelMapper;
    }

    @Override
    public String saveNewPermission() {
        return PermissionConstant.CREATE_BUSINESS;
    }

    @Override
    public String updatePermission() {
        return PermissionConstant.UPDATE_BUSINESS;
    }

    @Override
    public String deletePermission() {
        return PermissionConstant.DELETE_BUSINESS;
    }

    @Override
    public String findByIdPermission() {
        return PermissionConstant.FIND_BUSINESS_BY_ID;
    }

    @Override
    public String findAllPermission() {
        return PermissionConstant.FIND_ALL_BUSINESS;
    }

    @Override
    public String findByCriteriaPermission() {
        return PermissionConstant.FIND_BUSINESS_BY_CRITERIA;
    }
}
