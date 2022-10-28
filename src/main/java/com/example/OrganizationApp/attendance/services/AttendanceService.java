package com.example.OrganizationApp.attendance.services;

import com.areeba.common.services.CUDService;
import com.areeba.common.services.FindAllService;
import com.areeba.common.services.FindByIdService;
import com.example.OrganizationApp.attendance.dtos.AttendanceRequestDTO;
import com.example.OrganizationApp.attendance.models.Attendance;
import com.example.OrganizationApp.attendance.repositories.AttendanceRepository;
import com.example.OrganizationApp.organization.dtos.OrganizationRequestDTO;
import com.example.OrganizationApp.organization.models.Organization;
import com.example.OrganizationApp.organization.repositories.OrganizationRepository;

public interface AttendanceService extends CUDService<Attendance, AttendanceRequestDTO, AttendanceRepository>, FindByIdService<Attendance, AttendanceRepository>, FindAllService<Attendance, AttendanceRepository> {

}
