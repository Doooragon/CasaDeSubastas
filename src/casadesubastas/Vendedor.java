package casadesubastas;

import java.util.ArrayList;

/**
 * @author Hugo Rodríguez
 */
public class Vendedor {
    private String nombre;
    private int ganancias;
    private ArrayList<Producto> productos;

    public Vendedor(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }
    
    public void listarP(){
        System.out.println("Lista de productos:");
        System.out.println("------------------------------------");
        for(Producto p : this.productos){
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Código: " + p.getCodigo());
            System.out.println("Precio Base: " + p.getPrecio());
            System.out.println("Pujas:");
            p.listarPujas();
            System.out.println("-----");
        }
    }
    
    public void addProducto(Producto producto){
        this.productos.add(producto);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }
    
}
