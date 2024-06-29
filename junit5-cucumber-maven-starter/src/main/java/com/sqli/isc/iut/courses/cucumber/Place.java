package com.sqli.isc.iut.courses.cucumber;

public class Place {

	private final int maximumSeats = 10;
	private int takenSeats = 0;
	public String status = "not full";
	
	public Place() {
		
	}

	public void addSeats(int seats) {
		if (this.maximumSeats >= this.takenSeats + seats) {
			this.takenSeats += seats;
			this.status = "not full";
		}else {
			this.status = "full";
		}
	}

	public boolean canTakeSeats() {
		return this.takenSeats + 2 <= this.maximumSeats;
	}

}
