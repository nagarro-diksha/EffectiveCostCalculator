package com.nagarro.effectivecost.service;

public class PriceCalculationService implements PriceCalculation {
	
	public double calculateTax(String type , double price){
		double tax=0.0;
		// checking the type for implying tax rules
		if(type.equalsIgnoreCase("Raw")) {
			tax = .125*price;
		}
		else
			if(type.equalsIgnoreCase("Manufactured")) {
				tax = (.125*price)+.02*(price+(.125*price));
			}
			else
				if(type.equalsIgnoreCase("Imported")) {
					tax = .1*price+ calculateSurcharge(price);
				}
		return tax;
	}
	// method for calculating surcharge
	public double calculateSurcharge(double price) {
		price+= .1*price;
		double surcharge= 0.0;
		if(price<=100.0)
			surcharge = 5.0;
		else
			if(price<=200.0)
				surcharge = 10.0;
			else
				surcharge = .05*price;
		return surcharge;
	}

}
