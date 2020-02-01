package com.yocket.housing_management.service;

import com.yocket.housing_management.model.Houses;
import com.yocket.housing_management.repository.HousesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HousesService {
    @Autowired
    private HousesRepository housesRepository;
    public Houses saveHouse(Houses houses) {
        return housesRepository.save(houses);
    }

    public Object showAllHouses(Houses houses) {
        return housesRepository.findAll();
    }

    public Optional<Houses> showHouseDetails(int id) {
        return housesRepository.findById(id);
    }

//    public List showjiSumit() {
//        return housesRepository.getOwnerById();
//    }
}
