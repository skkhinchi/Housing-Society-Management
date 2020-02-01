package com.yocket.housing_management.model;


import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component

@Entity
@Table(name = "billings")
public class Billings {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

//    @Id
    @Column(name = "house_id")
    private String houseId;


    @Column(name = "water_bill")
    private String waterBill;


    @Column(name = "electricity_bill")
    private String elecBill;


    @Column(name = "maintenance")
    private String maintenance ;


    @Column(name = "parking")
    private String parking;


    @Column(name = "status")
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getWaterBill() {
        return waterBill;
    }

    public void setWaterBill(String waterBill) {
        this.waterBill = waterBill;
    }

    public String getElecBill() {
        return elecBill;
    }

    public void setElecBill(String elecBill) {
        this.elecBill = elecBill;
    }

    public String getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(String maintenance) {
        this.maintenance = maintenance;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public Billings() {
    }

    @Override
    public String toString() {
        return "Billings{" +
                "id=" + id +
                ", houseId='" + houseId + '\'' +
                ", waterBill='" + waterBill + '\'' +
                ", elecBill='" + elecBill + '\'' +
                ", maintenance='" + maintenance + '\'' +
                ", parking='" + parking + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
