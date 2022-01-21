package com.company.restaurant;

import java.util.Date;

public class MenuItem {
    //Class Variables
    private String name;
    private String description;
    private double price;
    private String category;
    private boolean isNew;

    //Constructors
    public MenuItem(String name, String description, double price, String category, boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;

        this.isNew = true;
    }


    //Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return this.isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    //Methods
    //print out a single menu item
    @Override
    public String toString() {
        //printOutMenuItem()
        String returnString = "";

        //print itemName
        returnString += "Item Name: " + this.name + "\n";

        //print itemDescription
        returnString += "Item Description: " + this.description + "\n";

        //print itemPrice
        returnString += "Item Price: " + this.price + "\n";

        //print itemCategory
        returnString += "Item Category: " + this.category + "\n";

        //print itemIsNew
        returnString += "Item is New? " + this.isNew + "\n";

        return returnString;
    }
//check if a menuItem is equal to another menuItem
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        // isEqual ( menuItem )
        // if menuItem is NOT a MenuItem
        if (!(obj instanceof MenuItem)) {
            return false;
        }

        MenuItem menuItem = (MenuItem) obj;

        //if itemName equals menuItem.itemName
        if (menuItem.name.equals(this.name)
                && menuItem.description.equals(this.description)) {
            return true;
        }

        //otherwise return false
        else return false;
    }

}
