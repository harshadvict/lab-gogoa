package model;

import java.time.LocalDate;

public class Hotel{

    private int noOfPersons;
    private String roomType;
    private int rates;
    private String occupancy;
    Hotel(int noOfPersons, String roomType, int rates,String occupancy,LocalDate fromdate,LocalDate todate){
    	this.noOfPersons=noOfPersons;
    	this.roomType=roomType;
    	this.rates=rates;
    	this.occupancy=occupancy;
    	this.fromdate=fromdate;
    	this.todate=todate;
    }
    public int getNoOfPersons() {
		return noOfPersons;
	}
	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getRates() {
		return rates;
	}
	public void setRates(int rates) {
		this.rates = rates;
	}
	public String getOccupancy() {
		return occupancy;
	}
	public void setOccupancy(String occupancy) {
		this.occupancy = occupancy;
	}
	public LocalDate getFromdate() {
		return fromdate;
	}
	public void setFromdate(LocalDate fromdate) {
		this.fromdate = fromdate;
	}
	public LocalDate getTodate() {
		return todate;
	}
	public void setTodate(LocalDate todate) {
		this.todate = todate;
	}
	private LocalDate fromdate;
    private LocalDate todate;

}