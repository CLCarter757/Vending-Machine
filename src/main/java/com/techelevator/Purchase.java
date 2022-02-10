package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Purchase {



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

}
