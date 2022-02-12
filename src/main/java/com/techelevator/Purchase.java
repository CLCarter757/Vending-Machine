package com.techelevator;

import java.util.*;

public class Purchase {
    private int currentMoneyProvided;
    Log write = new Log();
    private int endBalance = 0;
    Map<String, List<Product>> inventoryLevels = new LinkedHashMap<>();



    //(1) Feed Money - Start at 0, keep adding input until user is finished
    double moneyProvided = 0; //money in machine

    //(2) Select Product -
    List<Object> vendingMachineItems = new ArrayList<>();
    //Show list of products available
    //Have user enter code to select item - try - catch returns them to main menu
    //if items works then give item to customer
        //print (item name, cost, money remaining)
        //print message depending on food type
        //machine update balance + return to menu

    //(3) Finish Transaction
    //Give back remaining money
        //give back using all coins and smallest amount of coins possible
        //machine balance is then 0

    //theft method
    //create file "Log.txt"
    //create new line for file
        //Add info for every purchase


    public int getCurrentMoneyProvided() {
        return currentMoneyProvided;
    }

    public void feedMoney() {
        Scanner userInput = new Scanner(System.in);
            System.out.println("Please enter the whole dollar amount you would like to deposit: ");
            int depositAmount = Integer.parseInt(userInput.nextLine());
            currentMoneyProvided += depositAmount;
            write.writeLog("FEED MONEY: ", depositAmount, currentMoneyProvided);
    }

    public void giveChange() {
        double startBalance = currentMoneyProvided;
        int changeOwed = currentMoneyProvided * 100;
        int quarters = changeOwed / 25;
        changeOwed -= (quarters * 25);
        int dimes = changeOwed / 10;
        changeOwed -= (dimes * 10);
        int nickles = changeOwed / 5;
        changeOwed -= (nickles * 5);

        System.out.println("Change: ");
        if (quarters > 0) {
            System.out.println("Quarters: " + quarters);
        } if (dimes > 0) {
            System.out.println("Dimes: " + dimes);
        } if(nickles > 0) {
            System.out.println("Nickles: " + nickles);
        }
        write.writeLog("GIVE CHANGE: ", startBalance, changeOwed);
    }

//    public void purchase(String slotIdentifier) {
//        if(!inventoryLevels.containsKey(slotIdentifier)) { //if choice null
//            System.out.println("Product choice not an option. Please choose again.");
//        } if(inventoryLevels.containsKey(slotIdentifier)) {
//            if(inventoryLevels.get(slotIdentifier).size() == 0) { //check if in stock
//                System.out.println("Item out of stock. Sorry :(");
//            } if(inventoryLevels.get(slotIdentifier).size() > 0) {
////                if (currentMoneyProvided >= inventory.get(slotIdentifier).get(1)) { //check given enough money
////                    currentMoneyProvided -= inventory.get(slotIdentifier).get(1); //update balance
////                    inventory.get(slotIdentifier).get(2); //update inventory
//                System.out.println("Test");
//                } else {
//                    System.out.println("Insufficient funds.");
//                }
//            }
//        }
    }





