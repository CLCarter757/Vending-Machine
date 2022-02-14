package com.techelevator;

// Main class where we run the program through
public class VendingMachine {


	public static void main(String[] args) {

		UI vendingMachine = new UI();
		vendingMachine.mainMenu();

		SalesReport test = new SalesReport();
		test.makeReport();
	}
}
