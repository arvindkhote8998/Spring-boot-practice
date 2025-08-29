package com.ashok.it.model;

public class Passanger {

	private String name;
	private String email;
	private String from;
	private String to;
	private String trainName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public Passanger(String name, String email, String from, String to, String trainName) {
		super();
		this.name = name;
		this.email = email;
		this.from = from;
		this.to = to;
		this.trainName = trainName;
	}
	public Passanger() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Passanger [name=" + name + ", email=" + email + ", from=" + from + ", to=" + to + ", trainName="
				+ trainName + "]";
	}
	
	
	
}
