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


    public void mainMenu(){

        //Scanner userInput = new Scanner(System.in);
        mainMenuOptions();
        String menuChoice = userInput.nextLine();

        if(userInput.equals("1")){
            Inventory.displayInventory();
        }
        if(userInput.equals("2")){
            purchaseMenuOptions();
            purchaseMenu();
        }
        if(userInput.equals("3")){
            System.exit(0);
        }
    }

    public void mainMenuOptions() {
        System.out.println("(1)Display vending machine items");
        System.out.println("(2) Purchase");
        System.out.println("(3) Exit");
    }
    public void purchaseMenuOptions(){
        System.out.println("(1) Feed Money");
        System.out.println("(2) Select Product");
        System.out.println("(3) Finish Transaction");
    }
    public void purchaseMenu(){

        String purchaseMenuChoice = userInput.nextLine();
        if(purchaseMenuChoice.equals("1")){
            Purchase.feedMoney();
            Purchase.getCurrentMoneyProvided();

        }
        if(purchaseMenuChoice.equals("2")){
            Inventory.displayInventory();
            Purchase.purchase();
        }
        if(purchaseMenuChoice.equals("3")){
            Purchase.getChange();
            Purchase.getCurrentMoneyProvided();
            mainMenu();
        }
    }



    //(1) Display vending machine items - picked
    // Show list of items in vending machine
    //List<Object> vendingMachineItems = new ArrayList<>();
    //products have slot identifier + purchase price


    //(2) Purchase - picked
    //(1)Feed Money
    //(Select Product)
    //(3) Finish Transaction
}
