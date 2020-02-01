package com.yocket.housing_management.repository;

import com.yocket.housing_management.model.HouseAndOwner;
import com.yocket.housing_management.model.Owners;
//import com.yocket.housing_management.Dao.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnersRepository extends JpaRepository<Owners,Integer> {


//    @Query("SELECT o FROM Owners  o  ")
//    @Query("SELECT owners.name,owners.id,owners.address, houses.owners_id FROM Owners owners inner join Houses houses on owners.id =houses.owners_id;")

//    @Query("SELECT new com.yocket.housing_management.")
//    public List<Owners> findOwnerDetailsByHouse();

//    @Query("SELECT new com.yocket.housing_management.model.HouseAndOwner(owners.owner_id, houses.house_id, owners.address,owners.m_no, owners.name)"
//            +"FROM Owners owners LEFT JOIN owners.houses houses")
//    List <HouseAndOwner> fetchDetails();



}
