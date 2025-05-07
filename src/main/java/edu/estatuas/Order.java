package edu.estatuas;


import org.assertj.core.internal.cglib.proxy.Factory;

import java.util.ArrayList;

import static edu.estatuas.ItemFactory.getItem;

public class Order implements Comanda {

    private Double total;
    private ArrayList<Item> items;

    Order() {
        items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }


    @Override
    public void addItem(String item, double price) {
        items.add(new Item(item, price));
        ItemFactory.getItem(item,price);
    }

    @Override
    public void display() {
        System.out.println(" ---ORDER--- " + "\n" + getItems());

    }





}
