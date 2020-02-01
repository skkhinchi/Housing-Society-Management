package com.yocket.housing_management.controller;

import com.yocket.housing_management.model.Buildings;
import com.yocket.housing_management.model.Owners;
import com.yocket.housing_management.service.BuildingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buildings")
public class BuildingsController {

    @Autowired
    private Buildings buildings;

    @Autowired
    private BuildingsService buildingsService;


    @PostMapping("/add-building")
    public Buildings save(@RequestBody Buildings buildings)
    {
        return buildingsService.saveBuilding(buildings);
    }


    @RequestMapping("/show-buildings")
    public List<Buildings> showAllBuilding() {
        return (List<Buildings>) buildingsService.showAllBuildings(buildings);
    }

    @PutMapping("/update-building")
    public Buildings update(@RequestBody Buildings buildings)
    {
        return buildingsService.saveBuilding(buildings);
    }




}
