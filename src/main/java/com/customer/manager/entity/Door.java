package com.customer.manager.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Door {
	
	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}
