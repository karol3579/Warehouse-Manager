package com.Data;

public class Product {
   private float price=0;
   private String symbol;
   private String name;
   private float quantity=0;

    public float getQuantity() {
        return quantity;
    }


    public float getPrice() {
        return price;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public Product(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
}
