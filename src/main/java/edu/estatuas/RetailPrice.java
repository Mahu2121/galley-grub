package edu.estatuas;

import java.util.HashMap;
import java.util.Map;

public class RetailPrice {
            /*(extra,precio)*/
    private static HashMap<String,Double> prices;

    RetailPrice(){
    }

    public static void init_prices() {
        prices = new HashMap<>();
        prices.put("large", 0.50);
        prices.put("sauce", 0.50);
        prices.put("medium", 0.25);
        prices.put("chese", 0.25);
    }

    public static void display() {
        for(Map.Entry<String,Double> entry : prices.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }




}
