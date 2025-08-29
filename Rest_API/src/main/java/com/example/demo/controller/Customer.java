package com.example.demo.controller;

public class Customer {

	private Integer custId;
	private String customerNsme;
	private String  geneder;
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getCustomerNsme() {
		return customerNsme;
	}
	public void setCustomerNsme(String customerNsme) {
		this.customerNsme = customerNsme;
	}
	public String getGeneder() {
		return geneder;
	}
	public void setGeneder(String geneder) {
		this.geneder = geneder;
	}
	public Customer(Integer custId, String customerNsme, String geneder) {
		super();
		this.custId = custId;
		this.customerNsme = customerNsme;
		this.geneder = geneder;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", customerNsme=" + customerNsme + ", geneder=" + geneder + "]";
	}
	
	
}
