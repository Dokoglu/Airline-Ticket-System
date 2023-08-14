package com.eticket.ETicket.demo.dto;

public class CreateRouteRequest {
	
	private String startingPoint;
	private String endingPoint;
	
	public CreateRouteRequest(String startingPoint, String endingPoint) {
		this.startingPoint = startingPoint;
		this.endingPoint = endingPoint;
	}

	public CreateRouteRequest() {
		
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
