package com.sqli.isc.iut.courses.cucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceSteps {
	private Place place = new Place();

	@Given("Mr. Pignon and Mr. Leblanc want to enter the bar")
	public void setup() {
		place = new Place();
	}
	
	@Given("there are already {int} people in the bar")
	public void setupSeats(int arg1) {
		place.addSeats(arg1);
	}
	
	@When("they try to enter")
	public void TwoPersonneTryToEnter() {
		place.addSeats(2);
	}
	
	@When("the person behind try enter")
	public void OnePersonneTryToEnter() {
		place.addSeats(1);
	}


	@Then("the bar displays {string}")
	public void the_result_is(String expected) {
		assertEquals(expected, place.status);
	}

	@Then("they are denied entry")
	public void theyAreDeniedEntry() {
        assertFalse(place.canTakeSeats());
	}
}
