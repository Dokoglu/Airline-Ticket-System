package com.eticket.ETicket.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eticket.ETicket.demo.dto.CreateFlightRequest;
import com.eticket.ETicket.demo.model.Flight;
import com.eticket.ETicket.demo.repository.FlightRepository;
import com.eticket.ETicket.demo.utilities.mappers.ModelMapperService;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class FlightManager implements FlightService{
	
	@Autowired
	private FlightRepository flightRepository;

	public double increaseQuota(double currentQuota) {
		 double newQuota = currentQuota + currentQuota * 0.1;
		    return newQuota;
		
	}
	
	public boolean shouldIncrease(String requestIncrease) {
		return "Yes".equals(requestIncrease);
	}
	
	@Transactional
	@Override
	public void addFlight(CreateFlightRequest createFlightRequest) {
		// TODO Auto-generated method stub
		Flight flight=new Flight();
		flight.setArrivalAirport(createFlightRequest.getArrivalAirport());
		flight.setArrivalCity(createFlightRequest.getArrivalCity());
		flight.setDepartureAirport(createFlightRequest.getDepartureAirport());
		flight.setDepartureCity(createFlightRequest.getDepartureCity());
		flight.setDurationOfFlight(createFlightRequest.getDurationOfFlight());
		flight.setRequestIncrease(createFlightRequest.getRequestIncrease());
		flight.setDepartureDate(createFlightRequest.getDepartureDate());
		double flightPrice = createFlightRequest.getFlightPrice();
		double quota = createFlightRequest.getCurrentQuota();
		
		 if (shouldIncrease(createFlightRequest.getRequestIncrease())) {
		       quota = increaseQuota(quota);
		       flightPrice = flightPrice + flightPrice * 0.1;
		    }
		    
		    flight.setFlightPrice(flightPrice);
		    flight.setCurrentQuota(quota);

		this.flightRepository.save(flight);
	
		
	}

	@Override
	public void deleteFlight(int id) {
		// TODO Auto-generated method stub
		this.flightRepository.findById(id);
	}

}