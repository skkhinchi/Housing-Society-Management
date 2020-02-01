package com.yocket.housing_management.model;


import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Component

@Entity
@Table(name = "owners")
public class Owners implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "owner_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "m_no")
    private String mobileNo;

    @Column(name = "address")
    private String address;

//    @OneToMany(targetEntity = Houses.class, mappedBy = "owners_id", orphanRemoval = false, fetch = FetchType.LAZY)
//    private Set<Houses> houses;
//
//    public static long getSerialVersionUID() {
//        return serialVersionUID;
//    }
//
//    public Set<Houses> getHouses() {
//        return houses;
//    }
//
//    public void setHouses(Set<Houses> houses) {
//        this.houses = houses;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Owners() {
    }


}
