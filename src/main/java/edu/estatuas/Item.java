package edu.estatuas;

public class Item implements Product{

    private String name;
    private Double price;
    private String extra;

    Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    Item(String name, Double price, String extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
    }

    @Override
    public String toString() {
        return name + (extra != null ? "w/ " + extra : "") + ".... " + String.format("%.2f",price).replace(".", ",") + "$ ";
    }

}
