package com.eticket.ETicket.demo.service;

import java.util.List;

import com.eticket.ETicket.demo.dto.CreateAirlineRequest;
import com.eticket.ETicket.demo.dto.CreateFlightRequest;
import com.eticket.ETicket.demo.dto.SearchAirlineRequest;
import com.eticket.ETicket.demo.model.Airline;
import com.eticket.ETicket.demo.model.Flight;

public interface AirlineService {
	
	void addAirline(CreateAirlineRequest createAirlineRequest);
	
	List<Airline> search(SearchAirlineRequest searchAirlineRequest) ;
	void addFlight(CreateFlightRequest createFlightRequest);
	
	Flight searchFlight(int id);
	void deleteById(int id);
	
}
