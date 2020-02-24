package io.spring.simplecache.service;


import io.spring.simplecache.Repository.TicketBooking;
import io.spring.simplecache.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class TicketService {


    @Autowired
    private TicketBooking ticketBooking;
    private Ticket ticket;

    @Cacheable(value="ticketsCache",key="#ticketId")
    public Ticket getTicketById(Integer ticketId) {
        return ticketBooking.getOne(ticketId);
    }

    @CacheEvict(value="ticketsCache",key="#ticketId")
    public void deleteTicket(Integer ticketId) {
        ticketBooking.deleteById(ticketId);
    }

    @CachePut(value="ticketsCache",key="#ticketId")
    public Ticket updateTicket(Integer ticketId, Ticket ticket){
        ticket.setTicketId(ticketId);
        return ticketBooking.save(ticket);
    }
}
