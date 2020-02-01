package com.yocket.housing_management.service;

import com.yocket.housing_management.model.Buildings;
import com.yocket.housing_management.model.Owners;
import com.yocket.housing_management.repository.BuildingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuildingsService {
    @Autowired
    private Buildings buildings;

    @Autowired
    private BuildingsRepository buildingsRepository;

    public  Buildings saveBuilding(Buildings buildings) {
        return buildingsRepository.save(buildings);
    }

    public Object showAllBuildings( Buildings buildings) {
        return buildingsRepository.findAll();

    }
}
