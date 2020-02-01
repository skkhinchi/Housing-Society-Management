package com.yocket.housing_management.service;

import com.yocket.housing_management.repository.HousesRepository;
import com.yocket.housing_management.repository.OwnersRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private OwnersRepository ownersRepository;

    @Autowired
    private HousesRepository housesRepository;


//    public List fetchOwnerInfo()
//    {
//        return ownersRepository.fetchDetails();
////        return ownersRepository.findAll();
//    }
}
