package com.techelevator.data;

import com.techelevator.domain.VendingMachine;
import com.techelevator.entity.Candy;
import com.techelevator.entity.Chip;
import com.techelevator.entity.Drink;
import com.techelevator.entity.Food;

import java.io.File;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryReader {
    //private static final String FILE_NAME = "./vendingmachine.csv";


    public static VendingMachine loadInventory(String fileName) throws Exception {

        Map<String, Food> map = new LinkedHashMap<>();
        Food item = null;

        Scanner scan = new Scanner(new File(fileName));
        while (scan.hasNextLine()) {
            String[] tokens = scan.nextLine().split(",");

            if (tokens[3].equals("Chip")) {
                item = new Chip(tokens[0], tokens[1], new BigDecimal(tokens[2]));
            } else if (tokens[3].equals("Candy")) {
                item = new Candy(tokens[0], tokens[1], new BigDecimal(tokens[2]));
            } else if (tokens[3].equals("Drink")) {
                item = new Drink(tokens[0], tokens[1], new BigDecimal(tokens[2]));
            } else if (tokens[3].equals("Gum")) {
                item = new Drink(tokens[0], tokens[1], new BigDecimal(tokens[2]));
            }

            map.put(tokens[0],item);
        }
        scan.close();

        return new VendingMachine(map);

    }
}


