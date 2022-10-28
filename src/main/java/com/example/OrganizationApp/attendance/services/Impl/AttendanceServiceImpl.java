package com.example.OrganizationApp.attendance.services.Impl;

import com.example.OrganizationApp.attendance.models.Attendance;
import com.example.OrganizationApp.attendance.repositories.AttendanceRepository;
import com.example.OrganizationApp.attendance.services.AttendanceService;
import com.example.OrganizationApp.organization.repositories.OrganizationRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.jar.Attributes;

@Service
@Slf4j
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    AttendanceRepository attendanceRepository;

    @Override
    public Class getModelClass() {
        return Attendance.class;
    }

    @Override
    public AttendanceRepository getRepository() {
        return attendanceRepository;
    }

    @Override
    public ModelMapper getModelMapper() {
        return modelMapper;
    }
}
