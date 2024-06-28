package com.sqli.isc.iut.courses.cucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static java.util.Arrays.asList;

public class BarSteps {
	private Bar bar;

	@Given("^Mr. Pignon and Mr. Leblanc are in the bar")
	public void setup() {
		bar = new Bar();
	}

	@When("^order (\\\\d+) cocktails at (\\\\d+)€ each")
	public void add(int arg1, int arg2) {
		bar.addDrinks(arg1,arg2);
	}
	
	@When("^They pay separatly")
	public void splitBill() {
		bar.setSplitBill(true);
	}

	@Then("^Mr. Leblanc pays (\\d+)€")
	public void the_result_is(int expected) {
		assertEquals(asList(expected), bar.check());
	}
	
	@Then("^They each pays (\\d+)€")
	public void the_split_bill_result_is(int expected) {
		ArrayList<Integer> resultsExpected = (ArrayList<Integer>) asList(expected, expected);
		assertEquals(resultsExpected, bar.check());
	}

}
