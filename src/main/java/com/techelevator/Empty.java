package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Empty {
//    private int stockLevel = 5;
//    private List<Product> productInfo;
//    Map<String, List<Product>> inventoryLevels = new HashMap<>();
//
//    public Map<String, List<Product>> createInventory() {
//        File file = new File("vendingmachine.csv");
//
//        try (Scanner scanner = new Scanner(file)) {
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                String[] inventoryArray = line.split("\\|");
//
//                if (inventoryArray[0].startsWith("A")) {
//                    double price = Double.parseDouble(inventoryArray[2]);
//                    Chip chip = new Chip(inventoryArray[1], price);
//                    productInfo = new ArrayList<>();
//                    productInfo.add(chip);
//                    inventoryLevels.put(inventoryArray[0], productInfo);
//                }
//                if (inventoryArray[0].startsWith("B")) {
//                    double price = Double.parseDouble(inventoryArray[2]);
//                    Candy candy = new Candy(inventoryArray[1], price);
//                    productInfo = new ArrayList<>();
//                    productInfo.add(candy);
//                    inventoryLevels.put(inventoryArray[0], productInfo);
//                }
//                if (inventoryArray[0].startsWith("C")) {
//                    double price = Double.parseDouble(inventoryArray[2]);
//                    Beverage beverage = new Beverage(inventoryArray[1], price);
//                    productInfo = new ArrayList<>();
//                    productInfo.add(beverage);
//                    inventoryLevels.put(inventoryArray[0], productInfo);
//                }
//                if (inventoryArray[0].startsWith("D")) {
//                    double price = Double.parseDouble(inventoryArray[2]);
//                    Gum gum = new Gum(inventoryArray[1], price);
//                    productInfo = new ArrayList<>();
//                    productInfo.add(gum);
//                    inventoryLevels.put(inventoryArray[0], productInfo);
//                }
//            }
//
//        } catch (FileNotFoundException e) {
//            System.out.println("File does not exist.");
//        }
//        return inventoryLevels;
//    }
//
//    }
//public Map<String, Product[]> createInventory() {
//    File file = new File("vendingmachine.csv");
//
//
//    try (Scanner scanner = new Scanner(file)) {
//        while (scanner.hasNextLine()) {
//            String line = scanner.nextLine();
//            String[] inventoryArray = line.split("\\|");
//
//            if (inventoryArray[0].startsWith("A")) {
//                Product[] productInfo = new Product[5];
//                for (int i = 0; i < 5; i++) {
//                    double price = Double.parseDouble(inventoryArray[2]);
//                    Chip chip = new Chip(inventoryArray[1], price);
//                    productInfo[i] = chip;
//
//                } inventoryLevels.put(inventoryArray[0], productInfo);
//            }
//            if (inventoryArray[0].startsWith("B")) {
//                Product[] productInfo = new Product[5];
//                for (int i = 0; i < 5; i++) {
//                    double price = Double.parseDouble(inventoryArray[2]);
//                    Candy candy = new Candy(inventoryArray[1], price);
//                    productInfo[i] = candy;
//                } inventoryLevels.put(inventoryArray[0], productInfo);
//            }
//            if (inventoryArray[0].startsWith("C")) {
//                Product[] productInfo = new Product[5];
//                for (int i = 0; i < 5; i++) {
//                    double price = Double.parseDouble(inventoryArray[2]);
//                    Beverage beverage = new Beverage(inventoryArray[1], price);
//                    productInfo[i] = beverage;
//                } inventoryLevels.put(inventoryArray[0], productInfo);
//            }
//            if (inventoryArray[0].startsWith("D")) {
//                Product[] productInfo = new Product[5];
//                for (int i = 0; i < 5; i++) {
//                    double price = Double.parseDouble(inventoryArray[2]);
//                    Gum gum = new Gum(inventoryArray[1], price);
//                    productInfo[i] = gum;
//                } inventoryLevels.put(inventoryArray[0], productInfo);
//            }
//        }
//    } catch (FileNotFoundException e) {
//        System.out.println("File does not exist.");
//        System.exit(1);
//    }
//    return inventoryLevels;
//}
//
//    public void displayInventory() {
//        for (Map.Entry<String, Product[]> entry : inventoryLevels.entrySet()) {
//            String value = entry.getValue().toString().replace("[", "").replace("]", "");
//            System.out.println(entry.getKey() + "| " + value);
////        }
//    }

    /*
    public static void main(String[] args) {

        public void salesReport() {
            Map<String, Integer> report = new HashMap<>();

            try {
                List<String> lines = Files.readAllLines(Path.of("SalesReport.txt"));

                for (String line : lines) {
                    String[] items = line.split("\\|");
                    report.put(items[0], Integer.parseInt(items[1]));
                }
                if (report.containsKey(product)) {
                    int value = report.get(product);
                    report.put(product, value++);
                }

                try (PrintWriter writer = new PrintWriter("SalesReport.txt")) {
                    for (Map.Entry<String, Integer> item : report.entrySet()) {
                        writer.println(item + "|" + report.get(item));
                    }
                }
            } catch (IOException e) {
                System.out.println("Critical error :X-|--<");
            }
        }


    }
    */
}
