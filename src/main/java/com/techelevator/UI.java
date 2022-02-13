package com.techelevator;

import java.io.File;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

//Where we print to user and receive input from user
public class UI {

    Scanner userInput = new Scanner(System.in);
    //private Map<String, Inventory> vendingProduct = new HashMap<>();

    Inventory inventory = new Inventory();
    Purchase purchase = new Purchase();


    public void mainMenu(){

        //Scanner userInput = new Scanner(System.in);
        mainMenuOptions();
        String menuChoice = userInput.nextLine();

        while(!menuChoice.equals("3")){

            inventory.createInventory();

            if(menuChoice.equals("1")){
                inventory.displayInventory();
            }
            if(menuChoice.equals("2")){
                purchaseMenuOptions();
                purchaseMenu();
            }
            if(menuChoice.equals("4")){
                //Sales Report
            }
            System.out.print("\n");
            mainMenuOptions();
            menuChoice = userInput.nextLine();
        }
        if(menuChoice.equals("3")){
            System.exit(0);
        }
    }

    public void purchaseMenu(){

        String purchaseMenuChoice = userInput.nextLine();

        while (!purchaseMenuChoice.equals("3")){
            inventory.createInventory();

            if(purchaseMenuChoice.equals("1")){
                purchase.feedMoney();
                System.out.println("Current money provided: $" + purchase.getCurrentMoneyProvided());

            }
            if(purchaseMenuChoice.equals("2")){
                inventory.displayInventory();
                System.out.print("Enter the code of the item: ");
                String itemCode = userInput.nextLine();
                inventory.purchase(itemCode);
            }

            System.out.print("\n");
            purchaseMenuOptions();
            purchaseMenuChoice = userInput.nextLine();
        }
        if(purchaseMenuChoice.equals("3")){
            purchase.giveChange();
            //Need to make getCurrentMoneyProvided to 0
            System.out.println("\nCurrent money provided: $" + purchase.getCurrentMoneyProvided());
        }
    }

    public void mainMenuOptions() {
        System.out.println("(1) Display vending machine items");
        System.out.println("(2) Purchase");
        System.out.println("(3) Exit");
    }
    public void purchaseMenuOptions(){
        System.out.println("(1) Feed Money");
        System.out.println("(2) Select Product");
        System.out.println("(3) Finish Transaction");
        System.out.println("\nCurrent money provided: $" + purchase.getCurrentMoneyProvided());
    }

}
