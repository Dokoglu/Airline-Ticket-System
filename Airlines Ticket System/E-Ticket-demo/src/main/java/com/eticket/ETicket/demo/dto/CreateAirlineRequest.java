package com.eticket.ETicket.demo.dto;

public class CreateAirlineRequest {

	private String airlineName;
	private String airlineCountry;
	private String flightID;
	public CreateAirlineRequest( String airlineName, String airlineCountry,
			String flightID) {
		
		this.airlineName = airlineName;
		this.airlineCountry=airlineCountry;
		this.flightID=flightID;
	}
	public CreateAirlineRequest() {
		
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getAirlineCountry() {
		return airlineCountry;
	}
	public void setAirlineCountry(String airlineCountry) {
		this.airlineCountry = airlineCountry;
	}
	public String getFlightID() {
		return flightID;
	}
	public void setFlightID(String flightID) {
		this.flightID = flightID;
	}
	
	
	
	
	
}
