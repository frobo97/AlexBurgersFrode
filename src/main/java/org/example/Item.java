package org.example;

public class Item {
private String name;
private ItemType type;
private double price;

    public Item(String name, ItemType type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // TODO kolla mera på denna. är osäker på hur den ska funka.
    public void printItem(){
        System.out.println(type);
    }

}
