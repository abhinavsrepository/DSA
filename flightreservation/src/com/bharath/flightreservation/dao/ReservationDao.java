package com.bharath.flightreservation.dao;

import com.bharath.flightreservation.model.Reservation;

public interface ReservationDao {
	Reservation bookFlight(Reservation reservation);
	
	Reservation checkIn(long reservationId,int noOfBags);

}
