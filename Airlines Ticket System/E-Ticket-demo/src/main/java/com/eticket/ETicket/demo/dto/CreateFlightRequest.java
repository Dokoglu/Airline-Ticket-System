package com.eticket.ETicket.demo.dto;

import java.sql.Date;

public class CreateFlightRequest {
	
	private String departureAirport;
	private String arrivalAirport;
	private String departureCity;
	private String arrivalCity;
	private Date departureDate;
	private double currentQuota;
	private double flightPrice;
	private String requestIncrease;
	private String durationOfFlight;
	
	public CreateFlightRequest(String departureAirport, String arrivalAirport
			,String departureCity, String arrivalCity, Date departureDate,double currentQuota,
			double flightPrice, String requestIncrease,
			String durationOfFlight) {
		
		this.departureAirport = departureAirport;
		this.arrivalAirport = arrivalAirport;
		this.departureCity=departureCity;
		this.arrivalCity=arrivalCity;
		this.departureDate=departureDate;
		this.currentQuota=currentQuota;
		this.flightPrice=flightPrice;
		this.requestIncrease=requestIncrease;
		this.durationOfFlight=durationOfFlight;
	}

	public CreateFlightRequest() {
		
	}

	public String getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}

	public String getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public double getCurrentQuota() {
		return currentQuota;
	}

	public void setCurrentQuota(double currentQuota) {
		this.currentQuota = currentQuota;
	}

	public double getFlightPrice() {
		return flightPrice;
	}

	public void setFlightPrice(double flightPrice) {
		this.flightPrice = flightPrice;
	}

	public String getRequestIncrease() {
		return requestIncrease;
	}

	public void setRequestIncrease(String requestIncrease) {
		this.requestIncrease = requestIncrease;
	}

	public String getDurationOfFlight() {
		return durationOfFlight;
	}

	public void setDurationOfFlight(String durationOfFlight) {
		this.durationOfFlight = durationOfFlight;
	}
	
	
	

	
	
	
	
	
	

}
