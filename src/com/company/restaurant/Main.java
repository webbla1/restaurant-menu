package com.company.restaurant;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Date today = Calendar.getInstance().getTime();
        MenuItem newItem1 = new MenuItem("Garlic linguine","Tasty noodles with garlic sauce",30.99, "Dinner", true);
        MenuItem newItem2 = new MenuItem("Pizza","The best pizza ever",20.99, "Dinner", true);
        MenuItem newItem3 = new MenuItem("Flash Brussel Sprouts","Flash fried and seasoned",8.99, "Appetizer", true);
        MenuItem newItem4 = new MenuItem("Lemon Cake","Just order it",10.99, "Dessert", true);

        ArrayList<MenuItem> startingMenu = new ArrayList<>();

        Menu ourLaunchMenu = new Menu(today, startingMenu);

        ourLaunchMenu.addMenuItem(newItem1);
        ourLaunchMenu.addMenuItem(newItem2);
        ourLaunchMenu.addMenuItem(newItem3);
        ourLaunchMenu.addMenuItem(newItem4);

        ourLaunchMenu.printOutMenu();
        System.out.println(newItem1.toString());
        System.out.println(ourLaunchMenu.getLastUpdated());
    }
}
