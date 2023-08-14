package com.eticket.ETicket.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CreditCard {
	
	@Id
	private String creditCardNumber;

	public CreditCard(String creditCardNumber) {
		
		this.creditCardNumber = creditCardNumber;
	}

	public CreditCard() {
		
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	
	

}
