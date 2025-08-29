package com.ashok.it.service;

import java.util.Collection;

import org.springframework.http.ResponseEntity;

import com.ashok.it.model.Passanger;
import com.ashok.it.model.Ticket;

public interface IrctcService {

	public ResponseEntity<String> save(Passanger passanger);
	
	public Collection<Ticket> getAllTicket();
}
