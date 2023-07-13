package com.skillstorm.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long itemId;

	private String itemName;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "warehouse_id")
	@JsonIdentityReference(alwaysAsId = true)
	private Warehouse warehouse;
	
	
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name = "type_id")
//	@JsonIgnore
	@JsonIdentityReference(alwaysAsId = true)
//	@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property = "typeId")
	private CandyType candyType;
	
	private int popularity;
	

	public Item() {
		
	}

	public Item(long itemId, String itemName, Warehouse warehouse, CandyType candyType, int quantity, int popularity) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.warehouse = warehouse;
		this.candyType = candyType;
		this.quantity = quantity;
		this.popularity = popularity;

	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouseId(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public CandyType getType() {
		return candyType;
	}

	public void setType(CandyType candyType) {
		this.candyType = candyType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPopularity() {
		return popularity;
	}

	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}

	

}
