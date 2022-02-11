package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Purchase {
    private int currentMoneyProvided;
    Log write = new Log();
    private int endBalance = 0;
    Map<String, List<Inventory>> inventory = new HashMap<>();



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

    public void feedMoney(int depositAmount) {
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

        System.out.println("Change: " + quarters + " Quarters, " + dimes + " dimes, & " + nickles + "nickles.");

        write.writeLog("GIVE CHANGE: ", startBalance, changeOwed);
    }

    public void purchase(String slotIdentifier) {
        if(!inventory.containsKey(slotIdentifier)) { //if choice null
            System.out.println("Product choice not an option. Please choose again.");
        } if(inventory.containsKey(slotIdentifier)) {
            if(inventory.get(slotIdentifier).size() == 0) { //check if in stock
                System.out.println("Item out of stock. Sorry :(");
            } if(inventory.get(slotIdentifier).size() > 0) {
//                if (currentMoneyProvided >= inventory.get(slotIdentifier).get(1)) { //check given enough money
//                    currentMoneyProvided -= inventory.get(slotIdentifier).get(1); //update balance
//                    inventory.get(slotIdentifier).get(2); //update inventory
                } else {
                    System.out.println("Insufficient funds.");
                }
            }
        }
    }





