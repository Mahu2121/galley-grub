package edu.estatuas;

import java.util.ArrayList;
import java.util.List;

public class Order implements Comanda {

    private Double total;
    private ArrayList<Item> items;

    Order() {
        items = new ArrayList<>();
    }

    @Override
    public List<Item> getItems() {
        return items;
    }


    @Override
    public void addItem(String item, double price) {
        items.add(new Item(item, price));
        ItemFactory.getItem(item,price);
    }

    @Override
    public void display() {
        System.out.println("\n\t --- ORDER ---");
        for (Item item : items) {
            System.out.println(item);
        }
    }

}
