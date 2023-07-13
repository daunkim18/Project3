package com.skillstorm.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property = "warehouseId")
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long warehouseId;

    private String streetAddress;
    private String city;
    private String state;
    private int capacity;	// capacity in number of items
    
    
    @OneToMany(mappedBy = "warehouse")
    private List<Item> item;
	
    public Warehouse() {}

	public Warehouse(long warehouseId, String streetAddress, String city, String state, int capacity) {
		super();
		this.warehouseId = warehouseId;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.capacity = capacity;
		
	}

	public long getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(long warehouseId) {
		this.warehouseId = warehouseId;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


    
    

    // Add other fields (e.g., total capacity)

    // Add constructors, getters, and setters
}
