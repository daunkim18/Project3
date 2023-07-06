package com.skillstorm.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CandyType {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long typeId;
	 private String description;
	 
	 public CandyType() {}

	public CandyType(long typeId, String description) {
		
		this.typeId = typeId;
		this.description = description;
	}

	public long getTypeId() {
		return typeId;
	}

	public void setTypeId(long typeId) {
		this.typeId = typeId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	 
	 
	 
	 
	 
	 
}
