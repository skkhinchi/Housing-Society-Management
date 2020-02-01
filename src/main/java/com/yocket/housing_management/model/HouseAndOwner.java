package com.yocket.housing_management.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HouseAndOwner {
    @Id
    private int owner_id;
    private int house_id;
    private String address;
    private String m_no;
    private String name;


    public int getHouse_id() {
        return house_id;
    }

    public void setHouse_id(int house_id) {
        this.house_id = house_id;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getM_no() {
        return m_no;
    }

    public void setM_no(String m_no) {
        this.m_no = m_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    @Override
    public String toString() {
        return "HouseAndOwner{" +
                "house_id=" + house_id +
                ", owner_id=" + owner_id +
                ", name='" + name + '\'' +
                ", m_no='" + m_no + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public HouseAndOwner(int house_id, int owner_id, String name, String m_no, String address) {
        this.house_id = house_id;
        this.owner_id = owner_id;
        this.name = name;
        this.m_no = m_no;
        this.address = address;
    }

    public HouseAndOwner() {
    }
}
