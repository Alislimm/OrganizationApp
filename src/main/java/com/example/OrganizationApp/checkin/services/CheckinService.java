package com.example.OrganizationApp.checkin.services;

import com.areeba.common.exceptions.CustomServiceException;
import com.areeba.common.services.CUDService;
import com.areeba.common.services.FindAllService;
import com.areeba.common.services.FindByIdService;
import com.example.OrganizationApp.checkin.dtos.CheckinRequestDTO;
import com.example.OrganizationApp.checkin.models.Checkin;
import com.example.OrganizationApp.checkin.repositories.CheckinRepository;

import java.util.UUID;

public interface CheckinService extends CUDService<Checkin, CheckinRequestDTO, CheckinRepository>, FindByIdService<Checkin, CheckinRepository>, FindAllService<Checkin, CheckinRepository> {

     Checkin test(CheckinRequestDTO checkinRequestDTO) throws CustomServiceException;
}
