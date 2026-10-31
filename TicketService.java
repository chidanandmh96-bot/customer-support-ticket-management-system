
package com.example.ticketsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ticketsystem.entity.Ticket;
import com.example.ticketsystem.repository.TicketRepository;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    // POST - Create Ticket
    public Ticket createTicket(Ticket ticket) {
        ticket.setStatus("OPEN");
        return ticketRepository.save(ticket);
    }

    // GET - View All Tickets
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    // GET - Find Ticket By ID
    public Ticket getTicketById(Long id) {
        return ticketRepository.findById(id)
                .orElseThrow(() ->
                    new RuntimeException("Ticket not found with id: " + id));
    }

    // PUT - Update Ticket
    public Ticket updateTicket(Long id, Ticket updatedTicket) {

        Ticket existingTicket = getTicketById(id);

        existingTicket.setCustomerName(updatedTicket.getCustomerName());
        existingTicket.setEmail(updatedTicket.getEmail());
        existingTicket.setSubject(updatedTicket.getSubject());
        existingTicket.setDescription(updatedTicket.getDescription());
        existingTicket.setPriority(updatedTicket.getPriority());
        existingTicket.setStatus(updatedTicket.getStatus());

        return ticketRepository.save(existingTicket);
    }

    // DELETE - Delete Ticket
    public void deleteTicket(Long id) {

        Ticket existingTicket = getTicketById(id);

        ticketRepository.delete(existingTicket);
    }
}
