package com.eticket.ETicket.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eticket.ETicket.demo.dto.CreateBuyTicketRequest;
import com.eticket.ETicket.demo.dto.SearchTicketRequest;
import com.eticket.ETicket.demo.model.Ticket;
import com.eticket.ETicket.demo.service.TicketService;

@RestController
@RequestMapping("/tickets")
public class TicketController {
	
	private final TicketService ticketService;

	public TicketController(TicketService ticketService) {
		
		this.ticketService = ticketService;
	}
	
	@PostMapping("/buyTicket")
		public void buyTicket(@RequestBody CreateBuyTicketRequest buyTicketRequest) {
			ticketService.buyTicket(buyTicketRequest);
		
	}
	
	@GetMapping("/searchTickets")
	public ResponseEntity<List<Ticket>> searchTicket(@RequestBody SearchTicketRequest searchTicketRequest) throws Exception {
		List<Ticket> tickets=ticketService.searchTicket(searchTicketRequest);
		return ResponseEntity.ok(tickets);
	}
	}
	


