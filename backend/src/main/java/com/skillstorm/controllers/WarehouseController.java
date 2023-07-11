package com.skillstorm.controllers;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.models.Warehouse;
import com.skillstorm.repositories.CandyTypeRepository;
import com.skillstorm.repositories.ItemRepository;
import com.skillstorm.repositories.WarehouseRepository;
import com.skillstorm.services.WarehouseService;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/warehouses")
public class WarehouseController {

    @Autowired
    private WarehouseRepository warehouseRepo;
    
    @Autowired
    private ItemRepository itemRepo;
    
    @Autowired
    private CandyTypeRepository candyTypeRepo;
    
    @Autowired
    private WarehouseService service;

    @Autowired
	EntityManager entityManager;
    

    

    // Warehouse Endpoints

    @GetMapping
    public ResponseEntity<Iterable<Warehouse>> findAll() {
        Iterable<Warehouse> warehouses = service.findAll();
        return ResponseEntity.ok(warehouses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Warehouse> findById(@PathVariable("id") Long id) {
        Warehouse warehouse = service.findById(id);
        if (warehouse != null) {
            return ResponseEntity.ok(warehouse);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	@Transactional 
    public ResponseEntity<Warehouse> create(@RequestBody Warehouse warehouse) {
        Warehouse createdWarehouse = service.create(warehouse);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdWarehouse);
    }

    @PutMapping
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public ResponseEntity<Warehouse> update(@RequestBody Warehouse warehouse) {
    	Warehouse createdWarehouse = service.save(warehouse);
    	return ResponseEntity.status(HttpStatus.ACCEPTED).body(createdWarehouse);
    }
    
    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
    	service.delete(id);
    }


}