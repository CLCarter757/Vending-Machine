package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Inventory {
    private int stockLevel = 5;
    private List<Product> productInfo;
    Map<String, List<Product>> inventoryLevels = new HashMap<>();

    public Map<String, List<Product>> createInventory() {
        File file = new File("vendingmachine.csv");


        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] inventoryArray = line.split("\\|");

                if (inventoryArray[0].startsWith("A")) {
                    double price = Double.parseDouble(inventoryArray[2]);
                    Chip chip = new Chip(inventoryArray[1], price);
                    productInfo = new ArrayList<>();
                    productInfo.add(chip);
                    inventoryLevels.put(inventoryArray[0], productInfo);
                }
                if (inventoryArray[0].startsWith("B")) {
                    double price = Double.parseDouble(inventoryArray[2]);
                    Candy candy = new Candy(inventoryArray[1], price);
                    productInfo = new ArrayList<>();
                    productInfo.add(candy);
                    inventoryLevels.put(inventoryArray[0], productInfo);
                }
                if (inventoryArray[0].startsWith("C")) {
                    double price = Double.parseDouble(inventoryArray[2]);
                    Beverage beverage = new Beverage(inventoryArray[1], price);
                    productInfo = new ArrayList<>();
                    productInfo.add(beverage);
                    inventoryLevels.put(inventoryArray[0], productInfo);
                }
                if (inventoryArray[0].startsWith("D")) {
                    double price = Double.parseDouble(inventoryArray[2]);
                    Gum gum = new Gum(inventoryArray[1], price);
                    productInfo = new ArrayList<>();
                    productInfo.add(gum);
                    inventoryLevels.put(inventoryArray[0], productInfo);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        }
        return inventoryLevels;
    }

    public void displayInventory(Map<String, List<Product>> inventoryLevels) {
        for (Map.Entry<String, List<Product>> entry : inventoryLevels.entrySet()) {
            if (entry.getValue().get(2).equals("0")) {
                System.out.println(entry.getKey() + " is out of stock");
            }
        }
    }
}


