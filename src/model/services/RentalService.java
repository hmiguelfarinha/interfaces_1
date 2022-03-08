package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService { //

	private Double pricePerDay;
	private Double pricePerHour;
	
	private BrazilTaxService taxService;

	public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		long t1 = carRental.getStart().getTime(); // getTime gives the value in milliseconds off the date getStart
		long t2 = carRental.getFinsh().getTime();
		double hours = (double)(t2 - t1) /1000 / 60 / 60; //we had to convert from milliseconds to hours, made the casting to ensure that we have a double value in order to not lose some minutes
		
		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour; //Math.ceil rounds the value
		}
		else {
			basicPayment = Math.ceil(hours / 24) * pricePerDay;
		}
		
		double tax = taxService.tax(basicPayment); //made the calculation of the tax using the amount of the basicPayment
		
		carRental.setInvoice(new Invoice(basicPayment, tax)); //instanced the new object of Invoice with the baiscPayment and the tax
	} 
}
