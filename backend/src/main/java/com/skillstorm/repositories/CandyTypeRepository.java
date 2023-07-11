package com.skillstorm.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.models.CandyType;

@Repository
public interface CandyTypeRepository extends CrudRepository<CandyType, Long>{

}
