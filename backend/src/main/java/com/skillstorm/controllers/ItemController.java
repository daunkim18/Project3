package com.skillstorm.controllers;

import java.util.List;

import javax.persistence.EntityManager;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.models.Item;
import com.skillstorm.models.Warehouse;
import com.skillstorm.services.ItemService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/items")
public class ItemController {

	@Autowired
	private ItemService service;
	// Item Endpoints
    @Autowired
	EntityManager entityManager;

	@GetMapping
	public ResponseEntity<Iterable<Item>> findAll() {
		Iterable<Item> items = service.findAll();
		return ResponseEntity.ok(items);
	}
	


	@GetMapping("/{id}")
	public ResponseEntity<Item> getItemById(@PathVariable("id") long id) {
		Item item = service.findById(id);
		if (item != null) {
			return ResponseEntity.ok(item);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	//We will have a path variable and request params
	
	@GetMapping("/warehouses/{id}/items")
	public Iterable<Item> getItemByWarehouseId(@PathVariable("id") long id, @RequestParam(defaultValue = "all") String type) {
		return service.findItemsByWarehouse(id);
	}
	
	@GetMapping("/warehouses/{id}/items/search")
	public Iterable<Item> getItemBySearch(@PathVariable("id") long id, @RequestParam(defaultValue = "all") List<String> type) {
		return service.findByWarehouse_WarehouseIdAndCandyTypeDescriptionIn(id, type);
	}
	
	@GetMapping("/description")
	public Iterable<Item> getItemByDescription(@RequestParam(defaultValue = "all") String type) {
		return service.findByCandyTypeDescription(type);
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<Item> createItem(@RequestBody Item item) {
		Item createdItem = service.save(item);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdItem);
	}
	
    @PutMapping
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public ResponseEntity<Item> update(@RequestBody Item item) {
    	Item createdItem = service.save(item);
    	return ResponseEntity.status(HttpStatus.ACCEPTED).body(createdItem);
    }
	
	@DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") long id) {
    	service.delete(id);
	}
	
	
}
