package com.ashok.it.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashok.it.model.Passanger;
import com.ashok.it.model.Ticket;
import com.ashok.it.service.MakeMyTripService;

@RestController
public class MakeMytripController {

	@Autowired
	private MakeMyTripService makeMyTripService;
	
	@PostMapping("/saveData")
	public ResponseEntity<Ticket> saveData(@RequestBody Passanger passanger){
		ResponseEntity<Ticket> save = makeMyTripService.save(passanger);
		return save;
	}
	
	@GetMapping("/getdata")
	public List<Ticket> getAll(){
		List<Ticket> all = makeMyTripService.getAll();
		return all;
	}
}
