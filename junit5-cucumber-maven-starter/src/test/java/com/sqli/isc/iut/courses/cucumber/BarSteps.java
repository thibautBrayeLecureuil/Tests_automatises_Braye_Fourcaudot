package com.sqli.isc.iut.courses.cucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static java.util.Arrays.asList;

public class BarSteps {
	private Bar bar;

	@Given("Mr. Pignon and Mr. Leblanc are in the bar")
	public void setup() {
		bar = new Bar();
	}

	@When("order {int} cocktails at {int}€ each")
	public void add(int arg1, int arg2) {
		bar.addDrinks(arg1,arg2);
	}
	
	@When("They pay separatly")
	public void splitBill() {
		bar.setSplitBill(true);
	}

	@Then("Mr. Leblanc pays {int}€")
	public void the_result_is(int expected) {
		assertEquals(Collections.singletonList(expected), bar.check());
	}
	
	@Then("They each pays {int}€")
	public void the_split_bill_result_is(int expected) {
		ArrayList<Integer> resultsExpected = new ArrayList<Integer>();
		resultsExpected.add(expected);
		resultsExpected.add(expected);
		assertEquals(resultsExpected, bar.check());
	}

}
