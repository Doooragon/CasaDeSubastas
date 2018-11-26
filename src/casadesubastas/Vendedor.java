package casadesubastas;

import java.util.ArrayList;

/**
 * @author Hugo Rodríguez
 */
public class Vendedor {
    private String nombre;
    private int ganancias;
    private ArrayList<Producto> productos;

    public Vendedor(String nombre, int ganancias) {
        this.nombre = nombre;
        this.ganancias = ganancias;
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
