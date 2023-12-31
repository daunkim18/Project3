package com.skillstorm.training.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class WarehouseController {

    @Autowired
    private WarehouseService candyWarehouseService;


    // Item Endpoints

    @GetMapping("/items")
    public ResponseEntity<List<Item>> getAllItems() {
        List<Item> items = candyWarehouseService.getAllItems();
        return ResponseEntity.ok(items);
    }

    @GetMapping("/items/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable("id") int id) {
        Item item = candyWarehouseService.getItemById(id);
        if (item != null) {
            return ResponseEntity.ok(item);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping("/items")
    public ResponseEntity<Item> createItem(@RequestBody Item item) {
        Item createdItem = candyWarehouseService.createItem(item);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdItem);
    }

    // Candy Type Endpoints

    @GetMapping("/candytypes")
    public ResponseEntity<List<CandyType>> getAllCandyTypes() {
        List<CandyType> candyTypes = candyWarehouseService.getAllCandyTypes();
        return ResponseEntity.ok(candyTypes);
    }

    @GetMapping("/candytypes/{id}")
    public ResponseEntity<CandyType> getCandyTypeById(@PathVariable("id") int id) {
        CandyType candyType = candyWarehouseService.getCandyTypeById(id);
        if (candyType != null) {
            return ResponseEntity.ok(candyType);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping("/candytypes")
    public ResponseEntity<CandyType> createCandyType(@RequestBody CandyType candyType) {
        CandyType createdCandyType = candyWarehouseService.createCandyType(candyType);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCandyType);
    }

    // Warehouse Endpoints

    @GetMapping("/warehouses")
    public ResponseEntity<List<Warehouse>> getAllWarehouses() {
        List<Warehouse> warehouses = candyWarehouseService.getAllWarehouses();
        return ResponseEntity.ok(warehouses);
    }

    @GetMapping("/warehouses/{id}")
    public ResponseEntity<Warehouse> getWarehouseById(@PathVariable("id") int id) {
        Warehouse warehouse = candyWarehouseService.getWarehouseById(id);
        if (warehouse != null) {
            return ResponseEntity.ok(warehouse);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping("/warehouses")
    public ResponseEntity<Warehouse> createWarehouse(@RequestBody Warehouse warehouse) {
        Warehouse createdWarehouse = candyWarehouseService.createWarehouse(warehouse);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdWarehouse);
    }

 // Search by Candy Type
    @GetMapping("/candies/search")
    public ResponseEntity<List<Item>> searchByCandyType(@RequestParam("candyType") String candyType) {
        List<Item> items = candyWarehouseService.searchByCandyType(candyType);
        if (!items.isEmpty()) {
            return ResponseEntity.ok(items);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    // Search by Item Name
    @GetMapping("/items/search")
    public ResponseEntity<List<Item>> searchByItemName(@RequestParam("itemName") String itemName) {
        List<Item> items = candyWarehouseService.searchByItemName(itemName);
        if (!items.isEmpty()) {
            return ResponseEntity.ok(items);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }


}
