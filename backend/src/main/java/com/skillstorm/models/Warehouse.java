package com.skillstorm.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

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
    
    @OneToMany
    @JoinColumn(name ="itemId")
    private Item item;
	
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

	public Long getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(Long warehouseId) {
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

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
    
    

    // Add other fields (e.g., total capacity)

    // Add constructors, getters, and setters
}
