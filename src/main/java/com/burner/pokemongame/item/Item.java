package com.burner.pokemongame.item;

public class Item{
    String name;
    int durability;
    int numberOfItems;
    boolean stackable;

    public String getName(){return this.name;}
    public boolean isStackable(){return this.stackable;}
    public int getNumberOfItems(){return this.numberOfItems;}

    public void setNumberOfItems(int value){numberOfItems = value;}
} 
