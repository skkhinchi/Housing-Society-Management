package com.yocket.housing_management.repository;

import com.yocket.housing_management.model.Houses;
import com.yocket.housing_management.model.Management;
import org.springframework.data.repository.CrudRepository;

public interface ManagementRepository extends CrudRepository<Management,Integer> {
}
