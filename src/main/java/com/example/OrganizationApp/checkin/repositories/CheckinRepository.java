package com.example.OrganizationApp.checkin.repositories;

import com.example.OrganizationApp.checkin.models.Checkin;
import com.example.OrganizationApp.checkout.models.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface CheckinRepository extends JpaRepository<Checkin, UUID>, JpaSpecificationExecutor<Checkin> {
}
