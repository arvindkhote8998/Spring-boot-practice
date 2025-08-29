package com.ashok.it.model;

public class Ticket {

	private Integer ticketNum;
	private String name;
	private String email;
	private String from;
	private String to;
	private String trainName;
	private String status;
	public Integer getTicketNum() {
		return ticketNum;
	}
	public void setTicketNum(Integer ticketNum) {
		this.ticketNum = ticketNum;
	}
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Ticket(Integer ticketNum, String name, String email, String from, String to, String trainName,
			String status) {
		super();
		this.ticketNum = ticketNum;
		this.name = name;
		this.email = email;
		this.from = from;
		this.to = to;
		this.trainName = trainName;
		this.status = status;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Ticket [ticketNum=" + ticketNum + ", name=" + name + ", email=" + email + ", from=" + from + ", to="
				+ to + ", trainName=" + trainName + ", status=" + status + "]";
	}
	
	
}
