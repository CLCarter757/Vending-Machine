package com.techelevator;

import java.io.File;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

//Where we print to user and receive input from user
public class UI {

    Scanner userInput = new Scanner(System.in);
    private Map<String, Inventory> vendingProduct = new HashMap<>();

    public void makeFIle() {

        System.out.println("What is the file");
        userInput.useDelimiter(Pattern.compile("|"));
        String filePath = userInput.nextLine();
        File userFile = new File(filePath);


    }

    //main menu
    //(1) Display vending machine items
    //(2) Purchase
    //(3) Exit


    //(1) Display vending machine items - picked
    // Show list of items in vending machine
    //List<Object> vendingMachineItems = new ArrayList<>();
    //products have slot identifier + purchase price
    String slotIdentifier;
    double purchasePrice;


    //(2) Purchase - picked
    //(1)Feed Money
    //(Select Product)
    //(3) Finish Transaction
}
