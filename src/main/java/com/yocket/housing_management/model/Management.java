package com.yocket.housing_management.model;


import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component

@Entity
@Table(name = "management")
public class Management {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Column(name = "building_id")
    private int buildingId;

    @Column(name = "name")
    private String name;

    public Management() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Management{" +
                "id=" + id +
                ", buildingId=" + buildingId +
                ", name='" + name + '\'' +
                '}';
    }
}