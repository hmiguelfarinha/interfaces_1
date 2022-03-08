package model.services;

public class BrazilTaxService { //

	public double tax(double amount) { //used the primitive type double because was considered that we always have an amount for the tax method
		if(amount <= 100.0) {
			return amount * 0.2;
		}
		else {
			return amount * 0.15;
		}
	}
}
