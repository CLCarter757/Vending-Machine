package com.techelevator;

public class Chip extends Product {

    public Chip(String name, double price){
        super(name, price);
    }

    @Override
    public String getSound() {
        return "Crunch Crunch, Yum!";
    }
}
