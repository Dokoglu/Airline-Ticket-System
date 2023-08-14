package com.eticket.ETicket.demo.dto;

public class SearchAirlineRequest {
	
	private int airlineId;

	public SearchAirlineRequest(int airlineId) {
		
		this.airlineId = airlineId;
	}

	public SearchAirlineRequest() {
		
	}

	public int getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}
	
	
	
	

}
