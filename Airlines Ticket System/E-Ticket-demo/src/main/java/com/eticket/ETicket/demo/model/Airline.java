package com.eticket.ETicket.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity

@Getter
@Setter
public class Airline {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String airlineName;
	private String airlineCountry;
	private int flightID;
	
	public Airline(int id, String airlineName, String airlineCountry
			, int flightID) {
		this.id = id;
		this.airlineName = airlineName;
		this.airlineCountry=airlineCountry;
		this.flightID=flightID;
	}

	public Airline() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getFlightID() {
		return flightID;
	}

	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}


	@OneToMany(mappedBy="airline")
	List<Flight> flights;
	
	
	
	

}
