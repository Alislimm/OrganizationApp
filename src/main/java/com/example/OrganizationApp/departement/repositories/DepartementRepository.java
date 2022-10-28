package com.example.OrganizationApp.departement.repositories;

import com.example.OrganizationApp.departement.models.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface DepartementRepository extends JpaRepository<Departement, UUID>, JpaSpecificationExecutor<Departement> {
}
