package com.example.OrganizationApp.attendance.repositories;

import com.example.OrganizationApp.attendance.models.Attendance;
import com.example.OrganizationApp.organization.models.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface AttendanceRepository extends JpaRepository<Attendance, UUID>, JpaSpecificationExecutor<Attendance> {

}
