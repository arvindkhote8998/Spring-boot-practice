package com.ashok.it.service.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.random.RandomGenerator;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ashok.it.model.Passanger;
import com.ashok.it.model.Ticket;
import com.ashok.it.service.IrctcService;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
public class IrctcServiceImpl implements IrctcService {

	Map<Integer,Ticket> db = new HashMap<>();
	@Override
	public ResponseEntity<String> save(Passanger passanger) {
		
		Ticket ticket = new Ticket();
		Random random = new Random();
		int nextInt = random.nextInt(100);
		ticket.setTicketNum(nextInt);
		
		BeanUtils.copyProperties(passanger, ticket);
		ticket.setStatus("Confirmed");
		db.put(nextInt, ticket);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	public Collection<Ticket> getAllTicket() {
		Collection<Ticket> values = db.values();
		return values;
		
	}

}
