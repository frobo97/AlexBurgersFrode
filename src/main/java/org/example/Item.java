package org.example;

public class Item {
private String name;
private ItemType type;
private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void printItem(){
        System.out.println(type);
    }
}
