package com.skillstorm.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long warehouseId;

    private String streetAddress;
    private String city;
    private String state;
    private int capacity;	// capacity in number of items
    private int inventory;  // amount in number of items
	
    public Warehouse() {}

	public Warehouse(Long warehouseId, String streetAddress, String city, String state, int capacity, int inventory) {
		super();
		this.warehouseId = warehouseId;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.capacity = capacity;
		this.inventory = inventory;
	}
    
    

    // Add other fields (e.g., total capacity)

    // Add constructors, getters, and setters
}
