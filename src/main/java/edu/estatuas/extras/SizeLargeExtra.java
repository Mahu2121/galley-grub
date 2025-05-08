package edu.estatuas.extras;

import edu.estatuas.comanda.Comanda;
import edu.estatuas.product.Item;
import edu.estatuas.RetailPrice;

public class SizeLargeExtra extends Extra{


    @Override
    public void sumExtra(Comanda comanda){
        double price = 0;
        for (Item item : comanda.getItems()) {
            if (item.extra().equals(Extra.SIZE_LARGE)) {
                price += item.price() + RetailPrice.contains(item.extra());
            }
        } comanda.updateTotal(price);
    }



}
