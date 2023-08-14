package com.eticket.ETicket.demo.service;

import com.eticket.ETicket.demo.dto.CreateFlightRequest;

public interface FlightService {
	
	void addFlight(CreateFlightRequest createFlightRequest);
	void deleteFlight(int id);

}
