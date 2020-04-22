package com.techelevator.entity;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Food {
    private String slot;
    private String name;
    private int quantity;
    private BigDecimal price;

    public Food(){}

    public Food(String slot, String name, int quantity, BigDecimal price) {
        this.slot = slot;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Food(String slot, String name, BigDecimal price){
        this(slot, name, 5,price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSlot() {
        return slot;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public abstract String getMessage();


    @Override
    public String toString() {
        return "Food{" +
                "slot='" + slot + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food)) return false;
        Food food = (Food) o;
        return quantity == food.quantity &&
                Objects.equals(slot, food.slot) &&
                Objects.equals(name, food.name) &&
                Objects.equals(price, food.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slot, name, quantity, price);
    }
}
