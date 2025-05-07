package edu.estatuas.extras;

import edu.estatuas.Comanda;
import edu.estatuas.Item;

public class SauceExtra extends Extra {


    @Override
    public void sumExtra(Comanda comanda){
        double price = 0;
        for (Item item : comanda.getItems()) {
            if (item.extra().equals(Extra.SAUCE)) {
                price += item.price();
            }
        } comanda.updateTotal(price);
    }


}
