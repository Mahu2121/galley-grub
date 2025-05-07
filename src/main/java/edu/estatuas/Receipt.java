package edu.estatuas;

public class Receipt implements Ticket{
    private Double total;
    private Comanda order;

    Receipt(Comanda order){
    this.order = order;
    }

    @Override
    public Double total() {
        double total = 0;
        for (Item item  : order.getItems()) {
            total += item.price();
        } this.total = total;
        return total;
    }

    @Override
    public void print() {
        order.display();
        System.out.println("TOTAL --------> " + String.format("%.2f",total).replace(".", ",") + "$");
    }

}
