package com.nagarro.effectivecost.model;

import com.nagarro.effectivecost.service.PriceCalculationService;

public class Item {
	private String name = "";
	private double price = 0;
	private int quantity = 0;
	private String type = "";
	private double tax = 0;
    PriceCalculationService taxcalculator = new PriceCalculationService();
    
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public String getType() {
		return type;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(String type, double price) {
		this.tax = taxcalculator.calculateTax(type, price) ;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setType(String type) {
		this.type = type;
	}



}
