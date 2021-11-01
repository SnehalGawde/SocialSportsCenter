package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CourtBookings;
import com.example.demo.repository.CourtsBookingRepository;

@RestController
public class CourtsBookingController {
	private static final Logger log = LoggerFactory.getLogger(CourtsBookingController.class);

	private final CourtsBookingRepository repository;

	CourtsBookingController(CourtsBookingRepository repository) {
	    this.repository = repository;
	}

	@PostMapping("/bookings")	
	String book(@RequestBody CourtBookings courtBooking) {		
		List<CourtBookings> lstCurrentBookings = repository.getBookings(courtBooking.getCourtName(), courtBooking.getBookingDate());
		
		if (lstCurrentBookings.size() == 4) {
			return "The Tennis court is occupied for the day!";
		} else if (lstCurrentBookings.size() == 3) {
			CourtBookings cb = repository.save(courtBooking);			
			lstCurrentBookings.forEach(booking -> log.info(booking.getEmail() + " game is on!"));			
			return "Registed successfully. Details - " + cb + "\n game is on!";			
		} else {
			return "Registed successfully. Details - " + repository.save(courtBooking);
		} 
	}	
}
