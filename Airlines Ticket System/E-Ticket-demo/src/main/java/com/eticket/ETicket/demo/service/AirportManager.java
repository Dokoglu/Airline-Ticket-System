package com.eticket.ETicket.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eticket.ETicket.demo.dto.CreateAirportRequest;
import com.eticket.ETicket.demo.dto.SearchAirportRequest;
import com.eticket.ETicket.demo.model.Airport;
import com.eticket.ETicket.demo.repository.AirportRepository;
import com.eticket.ETicket.demo.utilities.mappers.ModelMapperService;

@Service
public class AirportManager implements AirportService {
	
	private final AirportRepository airportRepository;
	private ModelMapperService modelMapperService;
	

	public AirportManager(AirportRepository airportRepository,
			ModelMapperService modelMapperService) {
		
		this.airportRepository = airportRepository;
		this.modelMapperService=modelMapperService;
	}


	@Override
	public void addAirport(CreateAirportRequest createAirportRequest) {
		// TODO Auto-generated method stub
//		Airport airport=new Airport();
//		airport.setName(createAirportRequest.getName());
//		airport.setCountry(createAirportRequest.getCountry());
//		airport.setCity(createAirportRequest.getCity());
		Airport airport=this.modelMapperService.forRequest().map(createAirportRequest, Airport.class);
		this.airportRepository.save(airport);
		
		
	}


	@Override
	public List<Airport> searchAirport(SearchAirportRequest searchAirportRequest) throws Exception {
		// TODO Auto-generated method stub
		List<Airport> airport=this.airportRepository.findAll();
		if(IsExistName(searchAirportRequest.getAirportName())) {
			System.out.println("The airport found");
		}
		else {
			throw new Exception("Not found");
		}
		
		return airport;
	}
	
	
	public boolean IsExistName(String name) {
		if(this.airportRepository.equals(name)) {
			return true;
		}
		else {
			return false;
		}
	}

}
