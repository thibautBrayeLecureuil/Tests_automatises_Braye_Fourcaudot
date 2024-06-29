package com.sqli.isc.iut.courses.cucumber;

import java.util.ArrayList;
import static java.util.Arrays.asList;

public class Bar {

	private int bill = 0;
	private boolean splitBill = false;
	
	public Bar() {
		
	}
	
	public void addDrinks(int number, int amount) {
		this.bill += number*amount;
	}
	
	public void setSplitBill(boolean status) {
		this.splitBill = status;
	}
	
	public ArrayList<Integer> check() {
		ArrayList<Integer> res = new ArrayList<>();
		if (this.splitBill) {
			int splitAmount = this.bill/2;
			res.add(splitAmount);
			res.add(splitAmount);
		}else {
			res.add(this.bill);
		}
		return res;

	}
}
