package com.yocket.housing_management.controller;

import com.yocket.housing_management.model.Billings;
import com.yocket.housing_management.model.Buildings;
import com.yocket.housing_management.service.BillingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/billings")
public class BillingsController {

    @Autowired
    private Billings billings;

    @Autowired
    private BillingsService billingsService;

    @PostMapping("/add-bill")
    public Billings save(@RequestBody Billings billings)
    {
        return billingsService.saveBill(billings);
    }


    @RequestMapping("/show-bills")
    public List<Billings> showAllBills() {
        return (List<Billings>) billingsService.showAllBuildings(billings);
    }

    @PutMapping("/update-bill")
    public Billings update(@RequestBody Billings billings)
    {
        return billingsService.saveBill(billings);
    }


}
