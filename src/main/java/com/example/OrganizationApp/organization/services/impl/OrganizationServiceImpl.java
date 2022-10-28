package com.example.OrganizationApp.organization.services.impl;

import com.example.OrganizationApp.organization.models.Organization;
import com.example.OrganizationApp.organization.repositories.OrganizationRepository;
import com.example.OrganizationApp.organization.services.OrganizationService;
import lombok.extern.slf4j.Slf4j;
import org.kie.dmn.model.v1_1.TOrganizationUnit;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private OrganizationRepository organizationRepository;


    @Override
    public Class getModelClass() {
        return Organization.class;
    }

    @Override
    public OrganizationRepository getRepository() {
        return organizationRepository;
    }

    @Override
    public ModelMapper getModelMapper() {
        return modelMapper;
    }

}
