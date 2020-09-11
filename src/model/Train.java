package model;

import java.time.LocalDate;

public class Train{

    private int noOfPersons;
    private String berth;
    private int rates;
    private LocalDate date;
    Train(int noOfPersons, int rates, String berth, LocalDate date){
    	this.noOfPersons=noOfPersons;
    	this.rates=rates;
    	this.berth=berth;
    	this.date=date;
    }
	public int getNoOfPersons() {
		return noOfPersons;
	}
	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	public String getBerth() {
		return berth;
	}
	public void setBerth(String berth) {
		this.berth = berth;
	}
	public int getRates() {
		return rates;
	}
	public void setRates(int rates) {
		this.rates = rates;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}

}