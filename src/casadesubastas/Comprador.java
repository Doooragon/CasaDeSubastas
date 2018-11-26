package casadesubastas;

import java.util.ArrayList;

/**
 * @author Hugo Rodríguez
 */
public class Comprador {
    public String nombre;
    public int saldo;
    public ArrayList<Producto> compras;

    public Comprador(String nombre, int saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    
}
