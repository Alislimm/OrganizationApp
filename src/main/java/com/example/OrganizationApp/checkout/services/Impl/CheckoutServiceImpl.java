package com.example.OrganizationApp.checkout.services.Impl;

import com.areeba.common.exceptions.CustomServiceException;
import com.example.OrganizationApp.attendance.models.Attendance;
import com.example.OrganizationApp.attendance.repositories.AttendanceRepository;
import com.example.OrganizationApp.checkin.models.Checkin;
import com.example.OrganizationApp.checkin.repositories.CheckinRepository;
import com.example.OrganizationApp.checkout.models.Checkout;
import com.example.OrganizationApp.checkout.repositories.CheckoutRepository;
import com.example.OrganizationApp.checkout.services.CheckoutService;
import com.example.OrganizationApp.employee.Models.Employee;
import com.example.OrganizationApp.employee.Repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService {


    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CheckoutRepository checkoutRepository;

    @Autowired
    private CheckinRepository checkinRepository;

    @Autowired
    private AttendanceRepository attendanceRepository;

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public Class getModelClass() {
        return Checkout.class;
    }

    @Override
    public CheckoutRepository getRepository() {
        return checkoutRepository;
    }

    @Override
    public ModelMapper getModelMapper() {
        return modelMapper;
    }


    @Override
    public Checkout test(UUID checkinId) {
        Checkout checkout = new Checkout();
        Optional<Checkin> checkin1 = checkinRepository.findById(checkinId);
        Employee employee = checkin1.get().getEmployee();


        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate= formatter.format(date);

        Format f = new SimpleDateFormat("HH.mm.ss");
        String strTime = f.format(new Date());

        checkout.setDay(strDate);
        checkout.setDepartureTime(strTime);
        checkout.setEmployee(employee);
        checkoutRepository.save(checkout);

        Attendance attendance = new Attendance();
        attendance.setDateOfAttendance(strTime);
        attendance.setDepartureTime(strTime);
        attendance.setDateOfAttendance(strDate);
        attendanceRepository.save(attendance);

        checkin1.get().setIsCheckedoutOut(true);
        checkinRepository.save(checkin1.get());

        return checkout;
    }

}


