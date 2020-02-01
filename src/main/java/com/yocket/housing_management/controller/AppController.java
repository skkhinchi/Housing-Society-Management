package com.yocket.housing_management.controller;

import com.yocket.housing_management.model.HouseAndOwner;
import com.yocket.housing_management.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/home")
public class AppController {
    @Autowired
    private Service service;


    @RequestMapping("/show")
    public String show() {
        return "Hello..Sucessfully Login";
    }

//    @GetMapping("/join/left")
//    public ResponseEntity<List<HouseAndOwner>> getLeftJoinData() {
//        return new ResponseEntity<List<HouseAndOwner>>(service.fetchOwnerInfo(), HttpStatus.OK);
//    }
}
