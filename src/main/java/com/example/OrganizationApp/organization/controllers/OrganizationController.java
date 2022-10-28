package com.example.OrganizationApp.organization.controllers;

import com.areeba.common.controller.CUDController;
import com.areeba.common.controller.FindAllController;
import com.areeba.common.controller.FindByIdController;
import com.areeba.common.dto.RestCommonResponseDTO;
import com.example.OrganizationApp.constants.PermissionConstant;
import com.example.OrganizationApp.organization.dtos.OrganizationRequestDTO;
import com.example.OrganizationApp.organization.dtos.OrganizationResponseDTO;
import com.example.OrganizationApp.organization.models.Organization;
import com.example.OrganizationApp.organization.services.OrganizationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;


@RestController
@RequestMapping("/organization")
public class OrganizationController implements CUDController<OrganizationRequestDTO, OrganizationResponseDTO, OrganizationService>, FindByIdController<OrganizationResponseDTO, OrganizationService>, FindAllController<OrganizationResponseDTO, OrganizationService> {

    @Autowired
    private OrganizationService organizationService;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public OrganizationService getService() {
        return organizationService;
    }

    @Override
    public Class getResponseClass() {
        return OrganizationResponseDTO.class;
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
