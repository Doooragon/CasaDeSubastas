package casadesubastas;

import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Hugo Rodríguez
 */
public class CasaDeSubastas {
    private ArrayList<Producto> subastas;
    private ArrayList<Comprador> compradores;
    private ArrayList<Vendedor> vendedores;
    private Scanner scanner;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CasaDeSubastas cs = new CasaDeSubastas();
    }

    public CasaDeSubastas() {
        this.subastas = new ArrayList<>();
        this.compradores = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.menu();
    }
    
    public void menu(){
        while(true){
            System.out.println("          CASA DE SUBASTAS");
            System.out.println("------------------------------------");
            System.out.println("1. Ingresar como vendedor");
            System.out.println("2. Ingresar como comprador");
            System.out.println("3. Ingresar como observador");
            System.out.println("------------------------------------");
            System.out.print("> ");
            scanner = new Scanner(System.in);
            int in = scanner.nextInt();
            switch(in){
                case 1:
                    System.out.println();
                    System.out.println("------------------------------------");
                    System.out.println();
                    System.out.print("Nombre Completo: ");
                    scanner = new Scanner(System.in);
                    String nombre = scanner.nextLine();
                    boolean check = false;
                    for(Vendedor v : this.vendedores){
                        if(v.getNombre().equals(nombre)){
                            System.out.println("------------------------------------");
                            System.out.print("Ya ingresaste productos a la subasta.\n¿Revisar la lista de tus productos? (y/n): ");
                            scanner = new Scanner(System.in);
                            String c = scanner.nextLine();
                            while(!c.toUpperCase().equals("N") && !c.toUpperCase().equals("Y")){
                                System.out.println();
                                System.out.println("! ------------------------------------ !");
                                System.out.println("  Por favor ingresar una opción válida");
                                System.out.println("! ------------------------------------ !");
                                System.out.println();
                                System.out.print("¿Revisar la lista de tus productos? (y/n): ");
                                scanner = new Scanner(System.in);
                                c = scanner.nextLine();
                            }
                            if(c.toUpperCase().equals("Y")){
                                System.out.println();
                                System.out.println("------------------------------------");
                                System.out.println();
                                v.listarP();
                                System.out.println();
                                System.out.println("------------------------------------");
                                System.out.println();
                                check = true;
                                break;
                            }
                            else{
                                System.out.println("------------------------------------");
                                System.out.println();
                                check = true;
                                break;
                            }
                        }
                    }
                    if(check) break;
                    Vendedor ven = new Vendedor(nombre);
                    this.vendedores.add(ven);
                    while(true){
                        System.out.println("- Productos a subastar:");
                        System.out.print("Nombre del producto: ");
                        scanner = new Scanner(System.in);
                        String nombreP = scanner.nextLine();
                        System.out.print("Precio base: ");
                        scanner = new Scanner(System.in);
                        int precio = scanner.nextInt();
                        System.out.print("Codigo de Producto: ");
                        scanner = new Scanner(System.in);
                        String code = scanner.nextLine();
                        Producto p = new Producto(nombreP, precio, ven, code);
                        ven.addProducto(p);
                        this.subastas.add(p);
                        System.out.println();
                        System.out.println("------------------------------------");
                        System.out.println(" Producto agregado con éxito");
                        System.out.println("------------------------------------");
                        System.out.println();
                        System.out.print("¿Añadir otro producto? (y/n): ");
                        scanner = new Scanner(System.in);
                        String c = scanner.nextLine();
                        while(!c.toUpperCase().equals("N") && !c.toUpperCase().equals("Y")){
                            System.out.println();
                            System.out.println("! ------------------------------------ !");
                            System.out.println("  Por favor ingresar una opción válida");
                            System.out.println("! ------------------------------------ !");
                            System.out.println();
                            System.out.print("¿Añadir otro producto? (y/n): ");
                            scanner = new Scanner(System.in);
                            c = scanner.nextLine();
                        }
                        if(c.toUpperCase().equals("N")){
                            System.out.println();
                            System.out.println("------------------------------------");
                            System.out.println();
                            ven.listarP();
                            System.out.println();
                            System.out.println("------------------------------------");
                            System.out.println();
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("------------------------------------");
                    System.out.println();
                    System.out.print("Nombre Completo: ");
                    scanner = new Scanner(System.in);
                    String nombre2 = scanner.nextLine();
                    Comprador com = null;
                    boolean check2 = false;
                    boolean validate = false;
                    for(Comprador c : this.compradores){
                        if(c.getNombre().equals(nombre2)){
                            validate = true;
                            com = c;
                            System.out.println("------------------------------------");
                            System.out.print("Ya ingresaste a pujar alguna vez.\n¿Revisar la lista de tus pujas y tu saldo? (y/n): ");
                            scanner = new Scanner(System.in);
                            String c2 = scanner.nextLine();
                            while(!c2.toUpperCase().equals("N") && !c2.toUpperCase().equals("Y")){
                                System.out.println();
                                System.out.println("! ------------------------------------ !");
                                System.out.println("  Por favor ingresar una opción válida");
                                System.out.println("! ------------------------------------ !");
                                System.out.println();
                                System.out.print("¿Revisar la lista de tus pujas y tu saldo? (y/n): ");
                                scanner = new Scanner(System.in);
                                c2 = scanner.nextLine();
                            }
                            if(c2.toUpperCase().equals("Y")){
                                System.out.println();
                                System.out.println("------------------------------------");
                                System.out.println();
                                c.listarCompras();
                                System.out.println();
                                System.out.println("------------------------------------");
                                System.out.println();
                            }
                            System.out.println("------------------------------------");
                            System.out.println();
                            System.out.print("¿Desea pujar nuevamente? (y/n): ");
                            scanner = new Scanner(System.in);
                            c2 = scanner.nextLine();
                            while(!c2.toUpperCase().equals("N") && !c2.toUpperCase().equals("Y")){
                                System.out.println();
                                System.out.println("! ------------------------------------ !");
                                System.out.println("  Por favor ingresar una opción válida");
                                System.out.println("! ------------------------------------ !");
                                System.out.println();
                                System.out.print("¿Desea pujar nuevamente? (y/n): ");
                                scanner = new Scanner(System.in);
                                c2 = scanner.nextLine();
                            }
                            if(c2.toUpperCase().equals("N")){
                                check = true;
                            }
                            break;
                        }
                    }
                    if(check2) break;
                    if(!validate){
                        System.out.print("Saldo total para pujar: ");
                        scanner = new Scanner(System.in);
                        int saldo = scanner.nextInt();
                        com = new Comprador(nombre2, saldo);
                        this.compradores.add(com);
                    }
                    System.out.println();
                    System.out.println("------------------------------------");
                    System.out.println();
                    this.listarProductos();
                    System.out.println();
                    System.out.println("------------------------------------");
                    System.out.println();
                    System.out.print("Código de producto por el cual pujará: ");
                    scanner = new Scanner(System.in);
                    String code = scanner.nextLine();
                    Producto p2 = null;
                    boolean breik = false;
                    boolean noC = true;
                    while(true){
                        for(Producto p : this.subastas){
                            if(p.getCodigo().toUpperCase().equals(code.toUpperCase())){
                                noC = false;
                                System.out.println();
                                System.out.println("------------------------------------");
                                System.out.println("Nombre: " + p.getNombre() + " | Precio Base: " + p.getPrecio());
                                System.out.println();
                                System.out.print("¿Está correcto el producto? (y/n): ");
                                scanner = new Scanner(System.in);
                                String c = scanner.nextLine();
                                while(!c.toUpperCase().equals("N") && !c.toUpperCase().equals("Y")){
                                    System.out.println();
                                    System.out.println("! ------------------------------------ !");
                                    System.out.println("  Por favor ingresar una opción válida");
                                    System.out.println("! ------------------------------------ !");
                                    System.out.println();
                                    System.out.print("¿Está correcto el producto? (y/n): ");
                                    scanner = new Scanner(System.in);
                                    c = scanner.nextLine();
                                }
                                if(c.toUpperCase().equals("N")){
                                    System.out.println();
                                    System.out.print("Código de producto por el cual pujará: ");
                                    scanner = new Scanner(System.in);
                                    code = scanner.nextLine();
                                    break;
                                }
                                else{
                                    p2 = p;
                                    breik = true;
                                    break;
                                }
                            }
                               
                        }
                        if(breik) break;
                        if(noC){
                            System.out.println();
                            System.out.println("! ------------------------------------ !");
                            System.out.println("    El código de producto no existe.");
                            System.out.println("! ------------------------------------ !");
                            System.out.println();
                            System.out.print("Código de producto por el cual pujará: ");
                            scanner = new Scanner(System.in);
                            code = scanner.nextLine();
                        }
                    }
                    System.out.print("¿Cuánto dinero pujará?: ");
                    scanner = new Scanner(System.in);
                    int puja = scanner.nextInt();
                    while(com.getSaldo() < puja){
                        System.out.println();
                        System.out.println("! ------------------------------------ !");
                        System.out.println("  No tiene saldo suficiente para realizar esta acción.");
                        System.out.println("! ------------------------------------ !");
                        System.out.println();
                        System.out.print("¿Cuánto dinero pujará?: ");
                        scanner = new Scanner(System.in);
                        puja = scanner.nextInt();
                    }
                    com.addProducto(p2);
                    com.setSaldo(com.getSaldo() - puja);
                    p2.addPuja(com, puja);
                    //p2.getPropietario().setGanancias(p2.getPropietario().getGanancias() + puja);
                    System.out.println();
                    System.out.println("------------------------------------");
                    System.out.println(" Puja realizada con éxito");
                    System.out.println("------------------------------------");
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("------------------------------------");
                    System.out.println("Modo Observador.\nLista de productos y pujas");
                    System.out.println("------------------------------------");
                    System.out.println();
                    this.listarProductos();
                    System.out.println();
                    System.out.println("------------------------------------");
                    System.out.println("Ahora puedes entrar como comprador o vendedor si lo deseas");
                    System.out.println("------------------------------------");
                    System.out.println();
                    break;
                default:
                    System.out.println();
                    System.out.println("! ------------------------------------ !");
                    System.out.println("  Por favor ingresar una opción válida");
                    System.out.println("! ------------------------------------ !");
                    System.out.println();
                    break;
            }
        }
    }
    
    public void listarProductos(){
        for(Vendedor v : this.vendedores){
            System.out.println(" - Vendedor: " + v.getNombre());
            v.listarP();
            System.out.println("-----");
        }
    }
    
}
