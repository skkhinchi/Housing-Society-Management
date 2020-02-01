package com.yocket.housing_management.service;

import com.yocket.housing_management.model.Billings;
import com.yocket.housing_management.repository.BillingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillingsService {

    @Autowired
    private BillingsRepository billingsRepository;


    public Billings saveBill(Billings billings) {
        return billingsRepository.save(billings);
    }

    public Object showAllBuildings(Billings billings) {
        return billingsRepository.findAll();
    }
}
