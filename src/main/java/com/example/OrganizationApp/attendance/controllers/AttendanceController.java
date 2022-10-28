package com.example.OrganizationApp.attendance.controllers;


import com.areeba.common.controller.CUDController;
import com.areeba.common.controller.FindAllController;
import com.areeba.common.controller.FindByIdController;
import com.example.OrganizationApp.attendance.dtos.AttendanceRequestDTO;
import com.example.OrganizationApp.attendance.dtos.AttendanceResponseDTO;
import com.example.OrganizationApp.attendance.services.AttendanceService;
import com.example.OrganizationApp.organization.dtos.OrganizationRequestDTO;
import com.example.OrganizationApp.organization.dtos.OrganizationResponseDTO;
import com.example.OrganizationApp.organization.services.OrganizationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("attendance")
public class AttendanceController implements CUDController<AttendanceRequestDTO, AttendanceResponseDTO, AttendanceService>, FindByIdController<AttendanceResponseDTO, AttendanceService>, FindAllController<AttendanceResponseDTO, AttendanceService> {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    AttendanceService attendanceService;


    @Override
    public AttendanceService getService() {
        return attendanceService;
    }

    @Override
    public Class getResponseClass() {
        return AttendanceResponseDTO.class;
    }

    @Override
    public String findAllPermission() {
        return null;
    }

    @Override
    public String findByCriteriaPermission() {
        return null;
    }

    @Override
    public ModelMapper getModelMapper() {
        return modelMapper;
    }

    @Override
    public String findByIdPermission() {
        return null;
    }

    @Override
    public String saveNewPermission() {
        return null;
    }

    @Override
    public String updatePermission() {
        return null;
    }

    @Override
    public String deletePermission() {
        return null;
    }
}
