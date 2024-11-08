package com.groceryAPI.pojo;

public class GroceryInfo {


    public String name;
    public float quantity;

    public GroceryInfo(String name, float quantity) {
        super();
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public float getQuantity() {
        return quantity;
    }
}
