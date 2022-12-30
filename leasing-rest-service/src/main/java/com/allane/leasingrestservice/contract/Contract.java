/**
 * 
 */
package com.allane.leasingrestservice.contract;

/**
 * @author msakthi
 *
 */

public class Contract {

	private long contractNum;
	private String customer;
	private String vehicle;
	private String vin;
	private String monthlyRate;
	private String price;

	public Contract(long contractNum, String customer, String vehicle, String vin, String monthlyRate, String price) {
		super();
		this.contractNum = contractNum;
		this.customer = customer;
		this.vehicle = vehicle;
		this.vin = vin;
		this.monthlyRate = monthlyRate;
		this.price = price;
	}

	public long getContractNum() {
		return contractNum;
	}

	public void setContractNum(long contractNum) {
		this.contractNum = contractNum;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getMonthlyRate() {
		return monthlyRate;
	}

	public void setMonthlyRate(String monthlyRate) {
		this.monthlyRate = monthlyRate;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
