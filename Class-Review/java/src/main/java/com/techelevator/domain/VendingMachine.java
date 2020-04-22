package com.techelevator.domain;

import com.techelevator.entity.Food;

import java.util.Map;

public class VendingMachine {
    private Map<String, Food> inventory;

    public VendingMachine(Map<String,Food> inventory){
        this.inventory = inventory;
    }

    public Food getFood(String slot){
        return inventory.get(slot.toUpperCase());
    }
}
