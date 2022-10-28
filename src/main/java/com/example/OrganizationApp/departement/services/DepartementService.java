package com.example.OrganizationApp.departement.services;

import com.areeba.common.services.CUDService;
import com.areeba.common.services.FindAllService;
import com.areeba.common.services.FindByIdService;
import com.example.OrganizationApp.departement.dtos.DepartementRequestDTO;
import com.example.OrganizationApp.departement.models.Departement;
import com.example.OrganizationApp.departement.repositories.DepartementRepository;

public interface DepartementService extends CUDService<Departement, DepartementRequestDTO, DepartementRepository>, FindByIdService<Departement, DepartementRepository>, FindAllService<Departement, DepartementRepository> {
}
