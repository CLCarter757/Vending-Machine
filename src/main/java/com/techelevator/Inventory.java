package com.techelevator;

public class Inventory {

    //already grabbed input file
    //use slot identifier and keep as location
    //get inventory
    private String name;
    private double price;
    private String productType;
    private double quantity;


    public Inventory(String name, double price, String productType, double quantity){
        this.name = name;
        this.price = price;
        this.productType = productType;
        this.quantity = quantity;
    }
//Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getProductType() {
        return productType;
    }

    public double getQuantity() {
        return 5;
    }
    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
