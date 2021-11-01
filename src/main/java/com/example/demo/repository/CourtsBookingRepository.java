package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CourtBookings;

@Repository
public interface CourtsBookingRepository extends CrudRepository<CourtBookings, Integer> {
	
	@Query(value = "SELECT cb FROM CourtBookings cb WHERE cb.courtName = ?1 and cb.bookingDate = ?2 ")
	public List<CourtBookings> getBookings(String courtName, Date bookingDate);
}
