package com.practice;

public class Invoice {
	private Marker marker;
	private int quantity;
	
	public Invoice(Marker marker, int quantity) {
		super();
		this.marker = marker;
		this.quantity = quantity;
	}
	public int calculation() {
		int price= marker.getPrice() * quantity;
		return price;
	}
	public void printInvoice() {
		//logic 
	}
	public void saveToDB() {
		//logic
	}
	
	
}
