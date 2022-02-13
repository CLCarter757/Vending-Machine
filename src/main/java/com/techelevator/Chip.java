package com.techelevator;

public class Chip extends Product {

    public Chip(String name, double price){
        super(name, price);
    }

    public Chip() {

    }

    @Override
    public String getSound() {
        return "Crunch Crunch, Yum!";
    }
}
