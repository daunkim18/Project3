package com.skillstorm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.models.CandyType;

@Repository
public interface CandyTypeRepository extends JpaRepository<CandyType, Long>{

}
