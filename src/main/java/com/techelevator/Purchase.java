package com.techelevator;

import java.math.BigDecimal;
import java.util.*;

public class Purchase {

    private double currentMoneyProvided;
    Log write = new Log();
    private int endBalance = 0;
    Map<String, List<Product>> inventoryLevels = new LinkedHashMap<>();

    public double getCurrentMoneyProvided() {
        return currentMoneyProvided;
    }
    public void setCurrentMoneyProvided(double currentMoneyProvided) {
        this.currentMoneyProvided = currentMoneyProvided;
    }


    public void feedMoney() {
        Scanner userInput = new Scanner(System.in);
            System.out.println("Please enter the whole dollar amount you would like to deposit: ");
            System.out.print(">> ");
            int depositAmount = Integer.parseInt(userInput.nextLine());
            currentMoneyProvided += depositAmount;
            write.writeLog("FEED MONEY: ", depositAmount, currentMoneyProvided);
    }

    public void giveChange() {
        double startBalance = Math.round(currentMoneyProvided * 100) / 100;
        double changeOwed = currentMoneyProvided * 100;
        int quarters = (int) (changeOwed / 25);
        changeOwed -= (quarters * 25);
        int dimes = (int) (changeOwed / 10);
        changeOwed -= (dimes * 10);
        int nickles = (int) (changeOwed / 5);
        changeOwed -= (nickles * 5);

        System.out.println();
        System.out.println("Change: ");
        if (quarters > 0) {
            System.out.println("Quarters- " + quarters);
        } if (dimes > 0) {
            System.out.println("Dimes- " + dimes);
        } if(nickles > 0) {
            System.out.println("Nickles- " + nickles);
        }
        write.writeLog("GIVE CHANGE: ", startBalance, changeOwed);

        currentMoneyProvided = 0;
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





