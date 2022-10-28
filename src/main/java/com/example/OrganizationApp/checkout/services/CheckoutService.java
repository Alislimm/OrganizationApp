package com.example.OrganizationApp.checkout.services;

import com.areeba.common.exceptions.CustomServiceException;
import com.areeba.common.services.CUDService;
import com.areeba.common.services.FindAllService;
import com.areeba.common.services.FindByIdService;
import com.example.OrganizationApp.checkin.models.Checkin;
import com.example.OrganizationApp.checkout.dtos.CheckoutRequestDTO;
import com.example.OrganizationApp.checkout.models.Checkout;
import com.example.OrganizationApp.checkout.repositories.CheckoutRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;


public interface CheckoutService extends CUDService<Checkout, CheckoutRequestDTO, CheckoutRepository>, FindByIdService<Checkout, CheckoutRepository>, FindAllService<Checkout, CheckoutRepository> {

    Checkout test(UUID id);
}
