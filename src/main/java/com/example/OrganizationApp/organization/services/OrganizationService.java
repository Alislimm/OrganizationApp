package com.example.OrganizationApp.organization.services;

import com.areeba.common.services.CUDService;
import com.areeba.common.services.FindAllService;
import com.areeba.common.services.FindByIdService;
import com.example.OrganizationApp.organization.dtos.OrganizationRequestDTO;
import com.example.OrganizationApp.organization.models.Organization;
import com.example.OrganizationApp.organization.repositories.OrganizationRepository;

import java.util.List;

public interface OrganizationService extends CUDService<Organization, OrganizationRequestDTO, OrganizationRepository>, FindByIdService<Organization, OrganizationRepository>, FindAllService<Organization, OrganizationRepository> {

}
