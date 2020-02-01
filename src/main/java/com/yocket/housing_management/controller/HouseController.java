package com.yocket.housing_management.controller;

import com.yocket.housing_management.model.Houses;
import com.yocket.housing_management.service.HousesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/houses")
public class HouseController {
    @Autowired
    private Houses houses;

    @Autowired
    private HousesService housesService;

    @PostMapping("/add-house")
    public Houses save(@RequestBody Houses houses)
    {
        return housesService.saveHouse(houses);
    }


    @RequestMapping("/show-houses")
    public List<Houses> showAllHouses() {
        return (List<Houses>) housesService.showAllHouses(houses);
    }

    @PutMapping("/update-house")
    public Houses update(@RequestBody Houses houses)
    {
        return housesService.saveHouse(houses);
    }

    @GetMapping("/show-house-details")
    public <Optional> java.util.Optional<Houses> showHouse(@RequestParam int id) {
        java.util.Optional<Houses> houses = housesService.showHouseDetails(id);
        return houses;
    }






}
