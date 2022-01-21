package com.company.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    //Class variables
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    //Constructors
    public Menu(Date lastUpdated, ArrayList<MenuItem> menuItems) {
        this.lastUpdated = lastUpdated;
        this.menuItems = menuItems;
    }

    //Getters and Setters

    public ArrayList<MenuItem> getMenuItems() {
        return this.menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    //Methods
    //add menu item
    public ArrayList<MenuItem> addMenuItem(MenuItem newMenuItem){

        this.menuItems.add(newMenuItem);
        return this.menuItems;

    }
    //remove menu item
    public ArrayList<MenuItem> removeMenuItem(MenuItem oldMenuItem){

        int toBeRemoved = -1;
        for(int i=0; i < menuItems.size(); i++) {
            if(menuItems.get(i).equals(oldMenuItem)){
                toBeRemoved = i;
            }
        }
        this.menuItems.remove(toBeRemoved);
        return this.menuItems;
    }

    //print out entire menu
    public void printOutMenu() {
        for (int i=0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i).toString());
        }
    }
    //check last updated
    public String menuUpdated(){
        return ("The menu was last updated on " + this.lastUpdated);
    }
}
