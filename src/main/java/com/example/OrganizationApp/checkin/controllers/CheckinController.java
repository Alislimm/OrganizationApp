package com.example.OrganizationApp.checkin.controllers;

import com.areeba.common.controller.CUDController;
import com.areeba.common.controller.FindAllController;
import com.areeba.common.controller.FindByIdController;
import com.areeba.common.dto.RestCommonResponseDTO;
import com.areeba.common.exceptions.CustomServiceException;
import com.areeba.common.utils.CommonUtils;
import com.example.OrganizationApp.checkin.dtos.CheckinRequestDTO;

import com.example.OrganizationApp.checkin.dtos.CheckinResponseDTO;
import com.example.OrganizationApp.checkin.services.CheckinService;
import com.example.OrganizationApp.departement.dtos.DepartementRequestDTO;
import com.example.OrganizationApp.departement.dtos.DepartementResponseDTO;
import com.example.OrganizationApp.departement.services.DepartementService;
import com.example.OrganizationApp.employee.Dtos.EmployeeRequestDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("checkin")
public class CheckinController  implements CUDController<CheckinRequestDTO, CheckinResponseDTO, CheckinService>, FindByIdController<CheckinRequestDTO, CheckinService>, FindAllController<CheckinResponseDTO, CheckinService> {

    @Autowired
    CheckinService checkinService;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public CheckinService getService() {
        return checkinService;
    }

    @Override
    public Class getResponseClass() {
        return CheckinResponseDTO.class;
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

    @PostMapping("/Checkin")
    void checkIn(@RequestBody CheckinRequestDTO checkinRequestDTO) throws CustomServiceException {
        checkinService.test(checkinRequestDTO);
    }
}