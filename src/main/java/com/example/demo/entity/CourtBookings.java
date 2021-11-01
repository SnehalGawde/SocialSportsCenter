package com.example.demo.entity;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class CourtBookings {

	private @Id @GeneratedValue Long courtBookingId;

	private String courtName;	

	@JsonFormat(pattern="yyyy-MM-dd")
    private Date bookingDate;
    private String email;
	
    private String firstName;
    private String lastName;     

	public Long getCourtBookingId() {
		return courtBookingId;
	}
	public void setCourtBookingId(Long courtBookingId) {
		this.courtBookingId = courtBookingId;
	}
	public String getCourtName() {
		return courtName;
	}
	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public CourtBookings() {
		super();
	}
	public CourtBookings(String courtName, Date bookingDate, String firstName, String lastName, String email) {
		super();
		this.courtName = courtName;
		this.bookingDate = bookingDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	@Override
	public String toString() {
		return "CourtBookings [courtBookingId=" + courtBookingId + ", courtName=" + courtName + ", bookingDate="
				+ bookingDate + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookingDate, courtBookingId, courtName, email, firstName, lastName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourtBookings other = (CourtBookings) obj;
		return Objects.equals(bookingDate, other.bookingDate) && Objects.equals(courtBookingId, other.courtBookingId)
				&& Objects.equals(courtName, other.courtName) && Objects.equals(email, other.email)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
	}
}
