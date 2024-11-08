package com.groceryAPI.pojo;

import jakarta.persistence.*;
import jdk.jfr.Name;

@Entity
@Table(name = "item")
public class GroceryElements {

    @Id
    @Column(name = "Id")
    public Integer id;
    @Name( "Name")
    @Column(name = "Name")
    public String name;
    @Column(name = "Amount")
    public Float amount;
    @Column(name = "Quantity")
    public Float quantity;

    public GroceryElements(Integer id, String name, Float amount, Float quantity) {
        super();
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.quantity = quantity;
    }

    public GroceryElements() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "GroceryElements{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", amount='" + amount + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
