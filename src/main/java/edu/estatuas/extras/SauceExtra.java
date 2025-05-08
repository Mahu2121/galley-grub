package edu.estatuas.extras;

import edu.estatuas.comanda.Comanda;
import edu.estatuas.product.Item;
import edu.estatuas.RetailPrice;

public class SauceExtra extends Extra {


    @Override
    public void sumExtra(Comanda comanda){
        double price = 0;
        for (Item item : comanda.getItems()) {
            if (item.extra().equals(Extra.SAUCE)) {
                price += item.price() + RetailPrice.contains(item.extra());
            }
        } comanda.updateTotal(price);
    }


}
