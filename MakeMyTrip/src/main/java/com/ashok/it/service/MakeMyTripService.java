package com.ashok.it.service;

import java.util.Collection;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ashok.it.model.Passanger;
import com.ashok.it.model.Ticket;

public interface MakeMyTripService {

	public ResponseEntity<Ticket> save(Passanger passanger);
	
	public List<Ticket> getAll();
}
