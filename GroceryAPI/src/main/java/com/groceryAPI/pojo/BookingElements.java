package com.groceryAPI.pojo;

import jakarta.persistence.*;

@Entity
@Table(name = "booking")
public class BookingElements {

    @Column(name = "User_Name")
    public String userName;
    @Id
    @Column(name = "Item_Name")
    public String itemName;
    @Column(name = "Quantity")
    public Float quantity;

    public BookingElements(String userName, String itemName, Float quantity) {
        super();
        this.userName = userName;
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public BookingElements() {
        super();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "BookingElements{" +
                "userName='" + userName + '\'' +
                ", itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
