package edu.estatuas.extras;

import edu.estatuas.comanda.Comanda;
import edu.estatuas.product.Item;

public class Regular extends Extra{


    @Override
    public void sumExtra(Comanda comanda){
        double price = 0;
        for (Item item : comanda.getItems()) {
            if (item.extra() == null) {
                price += item.price();

            }
        } comanda.updateTotal(price);

    }

}
