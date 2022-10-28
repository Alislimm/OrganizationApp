package com.example.OrganizationApp.checkout.controllers;

import com.areeba.common.controller.CUDController;
import com.areeba.common.controller.FindAllController;
import com.areeba.common.controller.FindByIdController;
import com.areeba.common.exceptions.CustomServiceException;
import com.example.OrganizationApp.checkin.dtos.CheckinRequestDTO;
import com.example.OrganizationApp.checkin.dtos.CheckinResponseDTO;
import com.example.OrganizationApp.checkin.models.Checkin;
import com.example.OrganizationApp.checkin.services.CheckinService;
import com.example.OrganizationApp.checkout.dtos.CheckoutRequestDTO;
import com.example.OrganizationApp.checkout.dtos.CheckoutResponseDTO;
import com.example.OrganizationApp.checkout.services.CheckoutService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("checkout")
public class CheckoutController implements CUDController<CheckoutRequestDTO, CheckoutResponseDTO, CheckoutService>, FindByIdController<CheckoutRequestDTO, CheckoutService>, FindAllController<CheckoutResponseDTO, CheckoutService> {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    CheckoutService checkoutService;

    @Override
    public CheckoutService getService() {
        return checkoutService;
    }

    @Override
    public Class getResponseClass() {
        return CheckoutResponseDTO.class;
    }

    @Override
    public String findAllPermission() {
        return null;
    }

    @Override
    public String findByCriteriaPermission() {
        return null;
    }

    @Override
    public ModelMapper getModelMapper() {
        return modelMapper;
    }

    @Override
    public String findByIdPermission() {
        return null;
    }

    @Override
    public String saveNewPermission() {
        return null;
    }

    @Override
    public String updatePermission() {
        return null;
    }

    @Override
    public String deletePermission() {
        return null;
    }


    @PostMapping("/checkout")
    void checkout(@RequestBody UUID checkinid) throws CustomServiceException {
        checkoutService.test(checkinid);
    }
}

