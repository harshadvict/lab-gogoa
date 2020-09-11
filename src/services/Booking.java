package services;

public class  Booking {
	
	public double booking(int noOfPersons,int rates) {
		int totalrate =noOfPersons * rates;
		return totalrate;
	}
	
}
