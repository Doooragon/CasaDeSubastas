package casadesubastas;

import java.util.ArrayList;

/**
 * @author Hugo Rodríguez
 */
public class Comprador {
    private String nombre;
    private int saldo;
    private ArrayList<Producto> compras;

    public Comprador(String nombre, int saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    public void addProducto(Producto producto){
        this.compras.add(producto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
}
