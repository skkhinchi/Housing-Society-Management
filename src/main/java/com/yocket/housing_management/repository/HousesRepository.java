package com.yocket.housing_management.repository;

import com.yocket.housing_management.model.Houses;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HousesRepository extends CrudRepository <Houses,Integer> {

//    String s="SELECT owners.owner_id, houses.house_id, owners.address,owners.m_no, owners.name FROM owners inner join houses on owners.owner_id =houses.owners_id where houses.house_id=2 ";
//
//    @Query(s)
//    public List getOwnerById();

}
