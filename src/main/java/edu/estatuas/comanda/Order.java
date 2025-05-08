package edu.estatuas.comanda;

import edu.estatuas.ItemFactory;
import edu.estatuas.product.Item;

import java.util.ArrayList;
import java.util.List;

public class Order implements Comanda {

    private Double total = 0.0;
    private ArrayList<Item> items;

    public Order() {
        items = new ArrayList<>();
    }

    @Override
    public void updateTotal(Double total) {
        total = this.total + total;
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
    public void addItem(String item1, double price, String item2) {
        items.add(new Item(item1, price, item2));
    }

    @Override
    public void display() {
        System.out.println("\n\t --- ORDER ---");
        for (Item item : items) {
            System.out.println(item);
        }
    }

}
