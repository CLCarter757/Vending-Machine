package com.techelevator;

public class Chips extends Product {

    public Chips(String name, double price){
        super(name, price);
    }

    public String getSound() {
        return "Crunch Crunch, Yum!";
    }
}
