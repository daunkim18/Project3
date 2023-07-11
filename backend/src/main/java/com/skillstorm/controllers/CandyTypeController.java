package com.skillstorm.controllers;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.models.CandyType;
import com.skillstorm.models.Warehouse;
import com.skillstorm.services.CandyTypeService;
import com.skillstorm.services.WarehouseService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/candyTypes")
public class CandyTypeController {

	@Autowired
	private CandyTypeService service;
	
    @Autowired
	EntityManager entityManager;

	// Candy Type Endpoints

	@GetMapping
	public ResponseEntity<Iterable<CandyType>> findAll() {
		Iterable<CandyType> candyTypes = service.findAll();
		return ResponseEntity.ok(candyTypes);
	}

	@GetMapping("/{id}")
	public ResponseEntity<CandyType> findById(@PathVariable("id") Long id) {
		CandyType candyType = service.findById(id);
		if (candyType != null) {
			return ResponseEntity.ok(candyType);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}

	@PostMapping
	public ResponseEntity<CandyType> create(@RequestBody CandyType candyType) {
		CandyType createdCandyType = service.create(candyType);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdCandyType);
	}
	
	 @PutMapping
	    @ResponseStatus(code = HttpStatus.ACCEPTED)
	    public ResponseEntity<CandyType> update(@RequestBody CandyType candyType) {
	    	CandyType createdCandyType = service.save(candyType);
	    	return ResponseEntity.status(HttpStatus.ACCEPTED).body(createdCandyType);
	    }
}
