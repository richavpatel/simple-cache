package io.spring.simplecache.controller;

import io.spring.simplecache.model.Ticket;
import io.spring.simplecache.service.TicketService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by vrpatel on 2/23/20.
 */
@RestController
@RequestMapping
public class TicketBookingController {
    @Autowired
    private TicketService ticketService;


    @GetMapping(value="/ticket/{ticketId}")
    public Ticket getTicketById(@PathVariable("ticketId")Integer ticketId){
        return ticketService.getTicketById(ticketId);
    }

    @DeleteMapping(value="/ticket/{ticketId}")
    public void deleteTicket(@PathVariable("ticketId")Integer ticketId){
        ticketService.deleteTicket(ticketId);
    }

    @PutMapping(value="/ticket/{ticketId}")
    public Ticket updateTicket(@PathVariable("ticketId")Integer ticketId, @RequestBody Ticket ticket){
        return ticketService.updateTicket(ticketId,ticket);
    }
}

