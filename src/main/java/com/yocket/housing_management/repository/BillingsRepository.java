package com.yocket.housing_management.repository;

import com.yocket.housing_management.model.Billings;
import org.springframework.data.repository.CrudRepository;

public interface BillingsRepository extends CrudRepository <Billings,Integer> {
}
