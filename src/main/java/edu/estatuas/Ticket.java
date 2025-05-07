package edu.estatuas;

import edu.estatuas.extras.Extra;

public interface Ticket {
    Double total();
    void print();
    void setChain(Extra extra);
}
