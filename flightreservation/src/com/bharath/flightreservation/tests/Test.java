package com.bharath.flightreservation.tests;

import com.bharath.flightreservation.dao.ReservationDao;
import com.bharath.flightreservation.dao.ReservationDaoImpl;
import com.bharath.flightreservation.model.Passenger;
import com.bharath.flightreservation.model.Reservation;

public class Test {

	public static void main(String[] args) {
		ReservationDao dao = new ReservationDaoImpl();
		Reservation reservation = new Reservation();
		Passenger passenger = new Passenger();
		passenger.setId(123l);
		passenger.setFirstName("John");
		passenger.setLastName("Bailey");
		passenger.setEmail("john@bailey.com");
		reservation.setPassenger(passenger);
		reservation.setFlightId(1l);

		Reservation savedReservation = dao.bookFlight(reservation);
		System.out.println(savedReservation);

		Reservation checkedInReservation = dao.checkIn(savedReservation.getId(), 2);
		System.out.println(checkedInReservation);
	}

}
