package com.yocket.housing_management.model;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "buildings")
public class Buildings {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "building_name")
    private String name;


    @Column(name = "address")
    private String address;


    @Column(name = "total_house")
    private int totalHouses;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTotalHouses() {
        return totalHouses;
    }

    public void setTotalHouses(int totalHouses) {
        this.totalHouses = totalHouses;
    }

    public Buildings() {

    }

    @Override
    public String toString() {
        return "Buildings{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", totalHouses=" + totalHouses +
                '}';
    }
}
