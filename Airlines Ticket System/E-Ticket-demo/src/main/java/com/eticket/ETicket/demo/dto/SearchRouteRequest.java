package com.eticket.ETicket.demo.dto;

public class SearchRouteRequest {

	private int id;
	private String startingPoint;
	private String endingPoint;
	
	public SearchRouteRequest(int id,String startingPoint, String endingPoint) {
		this.id=id;
		this.startingPoint = startingPoint;
		this.endingPoint = endingPoint;
	}

	public SearchRouteRequest() {
		
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
