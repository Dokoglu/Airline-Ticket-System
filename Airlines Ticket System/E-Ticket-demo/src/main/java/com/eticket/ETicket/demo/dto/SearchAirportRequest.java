package com.eticket.ETicket.demo.dto;

public class SearchAirportRequest {
	
	private String airportName;

	public SearchAirportRequest(String airportName) {
		this.airportName = airportName;
	}

	public SearchAirportRequest() {
		
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	
	
	

}
