package edu.estatuas.extras;

import edu.estatuas.comanda.Comanda;
import edu.estatuas.product.Item;
import edu.estatuas.RetailPrice;


public class CheeseExtra extends Extra {



    @Override
    public void sumExtra(Comanda comanda){
        double price = 0;
        for (Item item : comanda.getItems()) {
            if (item.extra() != null && item.extra().equals(Extra.CHEESE)) {
                price += RetailPrice.contains(item.extra());
            }
        } comanda.updateTotal(price);
        this.nextExtra.ifPresent(chain -> chain.sumExtra(comanda));
    }


}
