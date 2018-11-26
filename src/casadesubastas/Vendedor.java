package casadesubastas;

import java.util.ArrayList;

/**
 * @author Hugo Rodríguez
 */
public class Vendedor {
    public String nombre;
    public int ganancias;
    public ArrayList<Producto> productos;

    public Vendedor(String nombre, int ganancias) {
        this.nombre = nombre;
        this.ganancias = ganancias;
    }
}
