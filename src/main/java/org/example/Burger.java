package org.example;


public class Burger extends Item {
    private Item toppingOne;
    private Item toppingTwo;


    public Burger(String name, ItemType type, double price,Item topping1,Item topping2) {
        super(name, type, price);
        this.toppingOne = topping1;
        this.toppingTwo = topping2;
    }


    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }

    @Override
    // todo fixa så att den tat med priset för de tilläggen men kan göra
    public double getTotalPrice(){
        return super.getPrice();
    }

    public void setToppings(Item topping1,Item topping2){
        // todo fyll på med det som ska göras.
    }

    protected void printToppings(){
        // todo fixa
    }

    public void printItem(){
        // todo fixa
    }

}
