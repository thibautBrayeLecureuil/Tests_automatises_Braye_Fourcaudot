package com.sqli.isc.iut.courses.cucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BarSteps {
	private Bar bar;

	@Given("^are in the bar")
	public void setup() {
		bar = new Bar();
	}

	@When("^order (\\d+) cocktails at (//d+)€ each")
	public void add(int arg1, int arg2) {
		bar.addDrinks(arg1,arg2);
	}
	
	@When("^They pay separatly")
	public void splitBill() {
		bar.setSplitBill(true);
	}


	@Then("^pays (\\d+)€")
	public void the_result_is(double expected) {
		assertEquals(expected, bar.chech());
	}

}
