package com.eticket.ETicket.demo.dto;

public class SearchTicketRequest {
	
	private int ticketID;

	public SearchTicketRequest(int ticketID) {
		
		this.ticketID = ticketID;
	}

	public SearchTicketRequest() {
		
	}

	public int getTicketID() {
		return ticketID;
	}

	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}
	
	

}
