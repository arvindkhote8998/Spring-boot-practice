package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class WelcomeController {

	@GetMapping("/welcome")
	public String getMessage() {
		return("Welcome To Ouer Restfull Application..");
	}
	
	//Request param
	@GetMapping("/greet")
	public ResponseEntity<String> getValue(@RequestParam("name") String name){
		String msg = name + ", Good Morning..!!";
		return new  ResponseEntity<>(msg, HttpStatus.OK);
	}
	
	@GetMapping("/greet/{name}")
	public ResponseEntity<String> getValeAll(@PathVariable("name") String name){
		String msg = name +", You are Selected..!!";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	
	@PostMapping(value="/save", consumes ="application/json",produces = "text/plain")
	public ResponseEntity<String> savedata(@RequestBody Customer customer){
		System.out.println(customer);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
