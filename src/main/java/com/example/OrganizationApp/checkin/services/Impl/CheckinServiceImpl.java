package com.example.OrganizationApp.checkin.services.Impl;

import com.areeba.common.enums.CommonEnums;
import com.areeba.common.exceptions.CustomServiceException;
import com.example.OrganizationApp.checkin.dtos.CheckinRequestDTO;
import com.example.OrganizationApp.checkin.models.Checkin;
import com.example.OrganizationApp.checkin.repositories.CheckinRepository;
import com.example.OrganizationApp.checkin.services.CheckinService;
import com.example.OrganizationApp.employee.Models.Employee;
import com.example.OrganizationApp.employee.Repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class CheckinServiceImpl implements CheckinService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    CheckinRepository checkinRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Class getModelClass() {
        return Checkin.class;
    }

    @Override
    public CheckinRepository getRepository() {
        return checkinRepository;
    }

    @Override
    public ModelMapper getModelMapper() {
        return modelMapper;
    }

//    @Override
//    public Checkin saveNew(CheckinRequestDTO checkinRequestDTO) throws CustomServiceException {
//        Checkin checkin = new Checkin();
//        Employee employee = employeeRepository.getById(checkinRequestDTO.getEmployeeId());
//        Date date = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//        String strDate= formatter.format(date);
//
//        Format f = new SimpleDateFormat("HH.mm.ss");
//        String strTime = f.format(new Date());
//
//        checkin.setDay(strDate);
//        checkin.setArrivalTime(strTime);
//        checkin.setEmployee(employee);
//        checkin.setStatus(CommonEnums.Status.ACTIVE);
//        CheckinService.saveNew(checkinRequestDTO);
//        return checkin;
//    }

    @Override
    public Checkin test(CheckinRequestDTO checkinRequestDTO) throws CustomServiceException {
        Checkin checkin = new Checkin();
        Employee employee = employeeRepository.getById(checkinRequestDTO.getEmployeeId());
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate= formatter.format(date);

        Format f = new SimpleDateFormat("HH.mm.ss");
        String strTime = f.format(new Date());

        checkin.setDay(strDate);
        checkin.setArrivalTime(strTime);
        checkin.setEmployee(employee);
        checkin.setStatus(CommonEnums.Status.ACTIVE);
        checkinRepository.save(checkin);
        return  checkin;
    }

}
