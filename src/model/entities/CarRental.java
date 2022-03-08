package model.entities;

import java.util.Date;

public class CarRental { //

	private Date start;
	private Date finsh;
	
	private Vehicle vehicle;
	private Invoice invoice;
	
	public CarRental() {
		
	}

	public CarRental(Date start, Date finsh, Vehicle vehicle) {
		this.start = start;
		this.finsh = finsh;
		this.vehicle = vehicle;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getFinsh() {
		return finsh;
	}

	public void setFinsh(Date finsh) {
		this.finsh = finsh;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	
}
