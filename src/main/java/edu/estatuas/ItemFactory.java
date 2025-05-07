package edu.estatuas;

public class ItemFactory {

    ItemFactory(){

    }

    public static Item getItem(String name, Double price){
        return new Item(name, price);
    }

}
