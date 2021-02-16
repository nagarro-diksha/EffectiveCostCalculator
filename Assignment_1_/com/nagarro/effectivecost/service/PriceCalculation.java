package com.nagarro.effectivecost.service;

interface PriceCalculation {
	double calculateTax(String type , double price);
	double calculateSurcharge(double price);
}
