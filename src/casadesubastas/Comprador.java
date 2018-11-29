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
        this.compras = new ArrayList<>();
    }
    
    public void listarCompras(){
        System.out.println("Lista de últimas pujas hechas:");
        System.out.println("------------------------------------");
        for(Producto p : this.compras){
            System.out.println("Nombre: " + p.getNombre());
            System.out.print("Última Puja: " + p.getPujas().get(this));
        }
        System.out.println("------------------------------------");
        System.out.println("Saldo en tu cuenta: " + this.saldo);
        System.out.println("------------------------------------");
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
