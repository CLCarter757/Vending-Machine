package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;

public class Inventory {
    Map<String, List<Product>> inventoryLevels = new LinkedHashMap<>();
    private int quantity = inventoryLevels.values().stream().mapToInt(List::size).sum();

    public Map<String, List<Product>> createInventory() {
        File file = new File("vendingmachine.csv");


        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] inventoryArray = line.split("\\|");

                if (inventoryArray[0].startsWith("A")) {
                    List<Product> productInfo = new ArrayList<>();
                    for (int i = 0; i < 5; i++) {
                        double price = Double.parseDouble(inventoryArray[2]);
                        Chip chip = new Chip(inventoryArray[1], price);
                        productInfo.add(chip);

                    } inventoryLevels.put(inventoryArray[0], productInfo);
                }
                if (inventoryArray[0].startsWith("B")) {
                    List<Product> productInfo = new ArrayList<>();
                    for (int i = 0; i < 5; i++) {
                        double cost = Double.parseDouble(inventoryArray[2]);
                        double price = Math.round(cost * 100.00)/100.00;
                        Candy candy = new Candy(inventoryArray[1], price);
                        productInfo.add(candy);
                    } inventoryLevels.put(inventoryArray[0], productInfo);
                }
                if (inventoryArray[0].startsWith("C")) {
                    List<Product> productInfo = new ArrayList<>();
                    for (int i = 0; i < 5; i++) {
                        double price = Double.parseDouble(inventoryArray[2]);
                        Beverage beverage = new Beverage(inventoryArray[1], price);
                        productInfo.add(beverage);
                    } inventoryLevels.put(inventoryArray[0], productInfo);
                }
                if (inventoryArray[0].startsWith("D")) {
                    List<Product> productInfo = new ArrayList<>();
                    for (int i = 0; i < 5; i++) {
                        double price = Double.parseDouble(inventoryArray[2]);
                        Gum gum = new Gum(inventoryArray[1], price);
                        productInfo.add(gum);
                    } inventoryLevels.put(inventoryArray[0], productInfo);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
            System.exit(1);
        }
        return inventoryLevels;
    }

    public void displayInventory() {
        for (Map.Entry<String, List<Product>> entry : inventoryLevels.entrySet()) {
            String slotIdentifier = entry.getKey();
            String value = entry.getValue().subList(0, 1).toString().replace("[", "").replace("]", "");
            System.out.println(slotIdentifier + "| " + value + entry.getValue().size());
        }
    }


    public void removeItem() {
        inventoryLevels.get("A1").remove(0);
    }



}
