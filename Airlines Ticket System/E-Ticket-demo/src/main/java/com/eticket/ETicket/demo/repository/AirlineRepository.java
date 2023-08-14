package com.eticket.ETicket.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eticket.ETicket.demo.model.Airline;
import com.eticket.ETicket.demo.model.Flight;

@Repository
public interface AirlineRepository extends JpaRepository<Airline, Integer> {

	void save(Flight flight);
	
	Optional<Flight> findByFlightID(int id);
	
	
}
