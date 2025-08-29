package com.ashok.it.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashok.it.model.Passanger;
import com.ashok.it.model.Ticket;
import com.ashok.it.service.IrctcService;

@RestController
public class IrctcController {

	@Autowired
	private IrctcService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Passanger passanger){
		ResponseEntity<String> save = service.save(passanger);
		return save;
	}
	
	@GetMapping("/getAll")
	public Collection<Ticket> getAllTicket(){
		Collection<Ticket> allTicket = service.getAllTicket();
		return allTicket;
	}
}
