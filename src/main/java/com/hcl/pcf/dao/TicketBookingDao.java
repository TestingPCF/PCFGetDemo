package com.hcl.pcf.dao;

import org.springframework.data.repository.CrudRepository;

import com.hcl.pcf.entities.Ticket;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{

}
