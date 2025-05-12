package edu.estatuas.ticket;

import edu.estatuas.comanda.Comanda;
import edu.estatuas.product.Item;
import edu.estatuas.extras.Extra;

public class Receipt implements Ticket {
    private Double total;
    private Comanda order;

    public Receipt(Comanda order){
    this.order = order;
    }

    @Override
    public void setChain(Extra extra) {
        extra.sumExtra(order);
    }

    @Override
    public Double total() {
        double total = 0;
        for (Item item  : order.getItems()) {
            total += item.price();
        } this.total = total + order.getTotal();
        return total;
    }

    @Override
    public void print() {
        order.display();
        System.out.println("TOTAL --------> " + String.format("%.2f",total).replace(".", ",") + "$");
    }

}
