package edu.estatuas;

import edu.estatuas.product.Product;

import java.util.HashMap;
import java.util.Map;

public class RetailPrice {
    private static HashMap<String,Double> prices;

    RetailPrice(){
    }

    public static void init_prices() {
        prices = new HashMap<>();
        prices.put("large", 0.50);
        prices.put("sauce", 0.50);
        prices.put("medium", 0.25);
        prices.put("cheese", 0.25);
    }

    public static void display() {
        for(Map.Entry<String,Double> entry : prices.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

    public static void display(Product product){
        System.out.println(product);
    }

    public static double contains(String extra) {
        double price = 0;
        for (Map.Entry<String, Double> entry : prices.entrySet()) {
            if (entry.getKey().equals(extra)) {
                price = entry.getValue();
            }
        } return price;
    }






}
