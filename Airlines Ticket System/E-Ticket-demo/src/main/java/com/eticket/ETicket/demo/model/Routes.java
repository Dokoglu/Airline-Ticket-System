package com.eticket.ETicket.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Routes {
	
	@Id
	private int id;
	
	private String startingPoint;
	private String endingPoint;
	
	public Routes(int id, String startingPoint, String endingPoint) {
		this.id = id;
		this.startingPoint = startingPoint;
		this.endingPoint = endingPoint;
	}

	public Routes() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	public String getEndingPoint() {
		return endingPoint;
	}

	public void setEndingPoint(String endingPoint) {
		this.endingPoint = endingPoint;
	}
	
	
	
	
	

}
