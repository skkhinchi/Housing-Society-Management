package com.yocket.housing_management.model;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Component
@Entity
@Table(name = "houses")
public class Houses implements Serializable {

//    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "house_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "building_id")
    private int buildingId;

    @Column(name = "owners_id")
    private int ownersId;

//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "owner_id", insertable = false, updatable = false)
//    @Fetch(FetchMode.JOIN)
//     private Owners owners;
////
////    public static long getSerialVersionUID() {
////        return serialVersionUID;
////    }
//
//    public Owners getOwners() {
//        return owners;
//    }
//
//    public void setOwners(Owners owners) {
//        this.owners = owners;
//    }

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

    public int getOwnersId() {
        return ownersId;
    }

    public void setOwnersId(int ownersId) {
        this.ownersId = ownersId;
    }

    public Houses() {
    }

    @Override
    public String toString() {
        return "Houses{" +
                "id=" + id +
                ", buildingId=" + buildingId +
                ", ownersId=" + ownersId +
                '}';
    }
}
