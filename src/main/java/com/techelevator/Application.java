package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Main class where we run the program through,
public class Application {


	public static void main(String[] args) {
		/*Inventory inventory = new Inventory();

		inventory.createInventory();
		inventory.displayInventory();

		System.out.println();

		inventory.removeItem();
		inventory.displayInventory();
		*/

		UI ui = new UI();
		ui.mainMenu();
		//Need to figure out where to put the log(theft)

	}
}
