package com.eticket.ETicket.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eticket.ETicket.demo.model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
