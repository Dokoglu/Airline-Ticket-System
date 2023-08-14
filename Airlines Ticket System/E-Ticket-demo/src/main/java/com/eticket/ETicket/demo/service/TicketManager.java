package com.eticket.ETicket.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eticket.ETicket.demo.dto.CreateBuyTicketRequest;
import com.eticket.ETicket.demo.dto.SearchTicketRequest;
import com.eticket.ETicket.demo.model.Ticket;
import com.eticket.ETicket.demo.repository.TicketRepository;
import com.eticket.ETicket.demo.utilities.mappers.ModelMapperService;

@Service
public class TicketManager implements TicketService {

	private final TicketRepository ticketRepository;
	private ModelMapperService modelMapperService;

	public TicketManager(TicketRepository ticketRepository, ModelMapperService modelMapperService) {

		this.ticketRepository = ticketRepository;
		this.modelMapperService = modelMapperService;
	}

	@Override
	public void buyTicket(CreateBuyTicketRequest buyTicketRequest) {
	    // TODO Auto-generated method stub
	    Ticket ticket = new Ticket();
	    
	    String originalCreditCardNumber = buyTicketRequest.getCreditCardNumber();
	    String maskedCreditCardNumber = maskCreditCardNumber(originalCreditCardNumber);
	    
	    ticket.setCreditCardNumber(maskedCreditCardNumber);
	    
	    ticket.setFlightID(buyTicketRequest.getFlightID());
	    ticket.setDepartureAirport(buyTicketRequest.getDepartureAirport());
	    ticket.setArrivalAirport(buyTicketRequest.getArrivalAirport());
	    ticket.setArrivalCity(buyTicketRequest.getArrivalCity());
	    ticket.setDepartureCity(buyTicketRequest.getDepartureCity());
	    ticket.setPrice(buyTicketRequest.getPrice());
	    
	    this.ticketRepository.save(ticket);
	}

	@Override
	public List<Ticket> searchTicket(SearchTicketRequest searchTicketRequest) throws Exception {
		List<Ticket> ticket = this.ticketRepository.findAll();

		if (findTicket(searchTicketRequest.getTicketID())) {
			System.out.println("The ticket exist");
		} else {
			throw new Exception("There is no suitable ticket");
		}
		return ticket;

	}

	public boolean findTicket(int i) {

		if (this.ticketRepository.findById(i) != null) {
			return true;

		} else {
			return false;
		}
	}

	@Override
	public void cancel(int id) {
		// TODO Auto-generated method stub
		Ticket ticket = this.ticketRepository.findById(id).get();
		this.ticketRepository.deleteById(ticket.getTicketID());

	}

	private String maskCreditCardNumber(String creditCardNumber) {

	    int cardNumberLength = creditCardNumber.length();
	    
	    StringBuilder maskedNumberBuilder = new StringBuilder();
	    for (int i = 0; i < cardNumberLength - 4; i++) {
	        maskedNumberBuilder.append('*');
	    }
	    

	    maskedNumberBuilder.append(creditCardNumber.substring(cardNumberLength - 4));
	    
	    return maskedNumberBuilder.toString();
	}

	

}


