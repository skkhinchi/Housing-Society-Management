package com.yocket.housing_management.controller;

import com.yocket.housing_management.model.Owners;
import com.yocket.housing_management.repository.OwnersRepository;
import com.yocket.housing_management.service.OwnersService;
import com.yocket.housing_management.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owners")
public class OwnersController {

 @Autowired
 private Owners owners;

 @Autowired
 private OwnersService ownersService;

 @Autowired
 private Service service;

    @PostMapping("/add-owners")
    public Owners save(@RequestBody Owners owners)
    {
        return ownersService.saveMethod(owners);
    }

    @GetMapping("/show-owners")
    public List<Owners> showAllOwners() {
        return (List<Owners>) ownersService.showAll(owners);
    }
    @PutMapping("/update-owners")
    public Owners update(@RequestBody Owners owners) {
        return ownersService.saveMethod(owners);
    }

    @GetMapping("/show-owner-details")
    public <Optional> java.util.Optional<Owners> showOwner(@RequestParam int id) {
        java.util.Optional<Owners> owners = ownersService.showOwnerDetails(id);
        return owners;
    }

    @DeleteMapping("/delete-owner-data")
    public void delete(@RequestParam int id)
    {
        ownersService.deleteOwner(id);
    }

//    @GetMapping("/sumit")
//    public List showsumit() {
//        return  service.fetchOwnerInfo();
//    }





}
