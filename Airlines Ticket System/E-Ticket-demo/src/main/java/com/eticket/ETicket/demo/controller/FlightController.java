package com.eticket.ETicket.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eticket.ETicket.demo.dto.CreateFlightRequest;
import com.eticket.ETicket.demo.service.FlightService;

@RestController
@RequestMapping("/flights")
public class FlightController {
	
	private final FlightService flightService;

	public FlightController(FlightService flightService) {
		this.flightService = flightService;
	}
	
	@PostMapping("/addFlight")
	public void addFlight(@RequestBody CreateFlightRequest createFlightRequest) {
		flightService.addFlight(createFlightRequest);
	}
	@DeleteMapping("/deleteFlight")
	public void deleteFlight(@RequestParam int id) {
		flightService.deleteFlight(id);
	}

}
