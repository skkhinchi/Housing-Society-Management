package com.yocket.housing_management.service;

import com.yocket.housing_management.model.Owners;
import com.yocket.housing_management.repository.OwnersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OwnersService {

    @Autowired
    private OwnersRepository ownersRepository;

    public Owners saveMethod(Owners owners) {
        return ownersRepository.save(owners);
    }


    public Object showAll(Owners owners) {
        return ownersRepository.findAll();
    }

    public Optional<Owners> showOwnerDetails(int id) {
        return ownersRepository.findById(id);
    }

    public void deleteOwner(int id) {
        ownersRepository.deleteById(id);
    }




}
