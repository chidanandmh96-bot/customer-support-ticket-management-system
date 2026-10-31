package com.example.ticketsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ticketsystem.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}