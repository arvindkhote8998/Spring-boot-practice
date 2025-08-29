package com.ashok.it.service.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ashok.it.model.Passanger;
import com.ashok.it.model.Ticket;
import com.ashok.it.service.MakeMyTripService;

@Service
public class MakeMytripServiceImpl implements MakeMyTripService{

	RestTemplate template = new RestTemplate();
	
	
	@Override
	public ResponseEntity<Ticket> save(Passanger passanger) {
		String url="http://13.200.242.26:8080/save";
		ResponseEntity<Ticket> entity = template.postForEntity(url, passanger, Ticket.class);
		Ticket ticket = entity.getBody();
		return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
	}

	@Override
	public List<Ticket> getAll() {
		String url="http://13.200.242.26:8080/getAll";
	 ResponseEntity<Ticket[]> forEntity = template.getForEntity(url, Ticket[].class);
	 Ticket[] body = forEntity.getBody();
	 List<Ticket> list = Arrays.asList(body);
		return list;
	}

}
