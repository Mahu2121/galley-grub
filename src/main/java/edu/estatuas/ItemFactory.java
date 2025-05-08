package edu.estatuas;

import edu.estatuas.product.Item;

public class ItemFactory {

    ItemFactory(){

    }

    public static Item getItem(String name, Double price){
        return new Item(name, price);
    }

}
