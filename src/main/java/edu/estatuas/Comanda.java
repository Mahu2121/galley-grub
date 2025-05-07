package edu.estatuas;

import java.util.List;

public interface Comanda{
    void addItem(String name ,double price);
    void display();
    List<Item> getItems();
    void addItem(String item1, double price, String item2);
}
