package com.eticket.ETicket.demo.dto;

public class CreateBuyTicketRequest {
	
	private int flightID;
	
	private String departureAirport;
	private String arrivalAirport;
	private String departureCity;
	private String arrivalCity;
	private float price;
	private String creditCardNumber;
	
	public CreateBuyTicketRequest(int flightID,String departureAirport,
			String arrivalAirport,
			String departureCity, String arrivalCity, float price,
			String creditCardNumber) {
		
		this.flightID = flightID;
		
		this.departureAirport = departureAirport;
		this.arrivalAirport = arrivalAirport;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.price = price;
		this.creditCardNumber=creditCardNumber;
	}

	public CreateBuyTicketRequest() {
		
	}

	public int getFlightID() {
		return flightID;
	}

	public void setFlightID(int flightID) {
		this.flightID = flightID;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	
	
	

}
