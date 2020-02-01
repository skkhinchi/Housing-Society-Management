package com.yocket.housing_management.service;

import com.yocket.housing_management.model.Management;
import com.yocket.housing_management.repository.ManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagementService {

    @Autowired
    private ManagementRepository managementRepository;

    public Object showAdminData(Management management) {
        return managementRepository.findAll();
    }


    public Management saveManagement(Management management) {
        return managementRepository.save(management);
    }

    public void deletesaveManagement(int id) {
        managementRepository.deleteById(id);
    }
}
