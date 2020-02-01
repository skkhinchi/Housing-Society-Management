package com.yocket.housing_management.repository;

import com.yocket.housing_management.model.Buildings;
import org.springframework.data.repository.CrudRepository;

public interface BuildingsRepository extends CrudRepository <Buildings,Integer> {
}
