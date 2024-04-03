
package lista3.oo;

import java.util.Currency;

class Order {
    private boolean paid;
    private String number;
    private Currency price; 

    public void receive() {
        System.out.println("Pedido Recebido");
    }

    public void send() {
        System.out.println("Pedido enviado.");
    }

    public void close() {
        System.out.println("Pedido fechadooo.");
    }
}