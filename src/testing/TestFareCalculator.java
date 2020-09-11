package testing;

/* Uncomment the below code to test your application

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;
import services.FareCalculator;

public class TestFareCalculator {
	FareCalculator fare = new FareCalculator();

	@Test
	public void testBook() {
		
		LocalDate ld1 = LocalDate.of(2020, 02, 5);
		LocalDate ld2 = LocalDate.of(2020, 02, 8);
		Hotel hotel1 = new Hotel(2, "nonac", 20000, "single", ld1, ld2);
		assertEquals(40000, fare.book(hotel1), 0);
		LocalDate ld3 = LocalDate.of(2020, 11, 3);
		LocalDate ld4 = LocalDate.of(2020, 11, 10);
		Hotel hotel2 = new Hotel(1, "nonac", 700, "double", ld3, ld4);
		assertEquals(700.0, fare.book(hotel2), 0);
		try {
			Hotel h1 = new Hotel(0, "ac", 1500, "single", ld1, ld2);
			Hotel h2 = new Hotel(1, null, 1500, "single", ld1, ld2);
			Hotel h3 = new Hotel(1, "ac", 0, "single", ld1, ld2);
			Hotel h4 = new Hotel(1, "ac", 1500, null, ld1, ld2);
			Hotel h5 = new Hotel(1, "ac", 1500, "single", null, ld2);
			Hotel h6 = new Hotel(1, "ac", 1500, "single", ld1, null);
			fare.book(h1);
			fare.book(h2);
			fare.book(h3);
			fare.book(h4);
			fare.book(h5);
			fare.book(h6);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBusMethod() {
		LocalDate ld1 = LocalDate.of(2020, 02, 5);
		Bus bus = new Bus(2, 1500, "acsleeper", ld1);
		assertEquals(3000,fare.book(bus),0);
		try {
			Bus bus1 = new Bus(0, 0, null, null);
			fare.book(bus1);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testFlightMethod() {
		LocalDate ld = LocalDate.of(2020, 02, 03);
		LocalDate ld1 = LocalDate.of(2020, 02, 05);
		Flight flight = new Flight(2, 10000, "economy", ld, ld1,"one-way");
		assertEquals(20000,fare.book(flight),0);
		try {
			Flight flight1 = new Flight(0, 0, null, null, null,null);
			fare.book(flight1);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testTrainMethod() {
		LocalDate ld = LocalDate.of(2020, 02, 03);
		Train train = new Train(2,1500,"nonac",ld);
		assertEquals(3000,fare.book(train),0);
		try {
			Train train1 = new Train(0,0,null,null);
			fare.book(train1);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}*/

