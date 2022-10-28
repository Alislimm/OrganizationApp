package com.example.OrganizationApp.departement.services.impl;

import com.example.OrganizationApp.departement.models.Departement;
import com.example.OrganizationApp.departement.repositories.DepartementRepository;
import com.example.OrganizationApp.departement.services.DepartementService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class DepartementServiceImpl implements DepartementService {

    @Autowired
    private DepartementRepository departementRepository;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Class getModelClass() {
        return Departement.class;
    }

    @Override
    public DepartementRepository getRepository() {
        return departementRepository;
    }

    @Override
    public ModelMapper getModelMapper() {
        return modelMapper;
    }
}
