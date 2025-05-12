package edu.estatuas.extras;

import edu.estatuas.comanda.Comanda;

import java.util.Optional;

public abstract class Extra {
    public static final String CHEESE = "cheese";
    public static final String SAUCE = "sauce";
    public static final String SIZE_LARGE = "large";
    private String extraProduct;
    Optional<Extra> nextExtra = Optional.empty();

    Extra() {}

    public void setNextExtra(Extra nextExtra) {
        this.nextExtra = Optional.of(nextExtra);
    }

    public abstract void sumExtra(Comanda comanda);


}
