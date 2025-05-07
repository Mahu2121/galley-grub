package edu.estatuas.extras;

import edu.estatuas.Comanda;
import edu.estatuas.Item;


public class CheeseExtra extends Extra {



    @Override
    public void sumExtra(Comanda comanda){
        double price = 0;
        for (Item item : comanda.getItems()) {
            if (item.extra().equals(Extra.CHEESE)) {
                price += item.price();
            }
        } comanda.updateTotal(price);
    }


}
