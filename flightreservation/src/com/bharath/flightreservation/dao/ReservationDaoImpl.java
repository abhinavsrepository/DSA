package com.bharath.flightreservation.dao;

import java.util.HashMap;

import com.bharath.flightreservation.model.Flight;
import com.bharath.flightreservation.model.Reservation;

public class ReservationDaoImpl implements ReservationDao {

	HashMap<Long, Flight> flights;
	HashMap<Long, Reservation> reservations;
	long reservationId;

	public ReservationDaoImpl() {
		reservations = new HashMap<>();
		flights = new HashMap<>();
		Flight flight1 = new Flight();
		flight1.setId(1l);
		flight1.setFlightNumber("123");
		flight1.setOperatingAirlines("American");
		flight1.setDepartureCity("Austin");
		flight1.setArrivalCity("Newyork");
		flight1.setDateAndTimeOfDeparture("5/22/2022 9PM");

		flights.put(flight1.getId(), flight1);

		Flight flight2 = new Flight();
		flight2.setId(2l);
		flight2.setFlightNumber("456");
		flight2.setOperatingAirlines("South West");
		flight2.setDepartureCity("Denver");
		flight2.setArrivalCity("San Diego");
		flight2.setDateAndTimeOfDeparture("6/22/2022 10PM");

		flights.put(flight2.getId(), flight2);
	}

	@Override
	public Reservation bookFlight(Reservation reservation) {
		Flight flight = flights.get(reservation.getFlightId());
		reservation.setFlight(flight);
		reservationId = reservationId + 1;
		reservation.setId(reservationId);
		reservations.put(reservationId, reservation);
		return reservation;
	}

	@Override
	public Reservation checkIn(long reservationId, int noOfBags) {
		Reservation reservation = reservations.get(reservationId);
		reservation.setNoOfBags(noOfBags);
		reservation.setCheckedIn(true);
		return reservation;
	}

}











