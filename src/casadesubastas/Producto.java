package casadesubastas;

import java.util.HashMap;

/**
 * @author Hugo Rodríguez
 */
public class Producto {
    private String nombre;
    private int precio;
    private String codigo;
    private Vendedor propietario;
    private HashMap<Comprador, Integer> pujas;

    public Producto(String nombre, int precio, Vendedor propietario, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.propietario = propietario;
        this.codigo = codigo;
        this.pujas = new HashMap<>();
    }
    
    public void listarPujas(){
        System.out.println("     Comprador      ---      Última Puja");
        for(Comprador c : this.pujas.keySet()){
            System.out.println(c.getNombre() + "  ---  " + this.pujas.get(c));
        }
    }
    
    public void addPuja(Comprador comprador, int puja){
        pujas.put(comprador, puja);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Vendedor getPropietario() {
        return propietario;
    }

    public void setPropietario(Vendedor propietario) {
        this.propietario = propietario;
    }

    public HashMap<Comprador, Integer> getPujas() {
        return pujas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
