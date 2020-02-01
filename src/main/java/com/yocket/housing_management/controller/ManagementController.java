package com.yocket.housing_management.controller;

import com.yocket.housing_management.model.Management;
import com.yocket.housing_management.service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/management")
public class ManagementController {
    @Autowired
    private Management management;

    @Autowired
    private ManagementService managementService;

    @GetMapping("/show-admin")
    public List<Management> showAdmin() {
        return (List<Management>) managementService.showAdminData(management);
    }

    @PostMapping("/add-Management")
    public Management save(@RequestBody Management management)
    {
        return managementService.saveManagement(management);
    }


    @PutMapping("/update-Management")
    public Management update(@RequestBody Management management) {
        return managementService.saveManagement(management);
    }



    @DeleteMapping("/delete-admin-data")
    public void delete(@RequestParam int id)
    {
        managementService.deletesaveManagement(id);
    }


}
