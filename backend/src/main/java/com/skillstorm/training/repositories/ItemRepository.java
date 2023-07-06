package com.skillstorm.training.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.models.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long>{

}
