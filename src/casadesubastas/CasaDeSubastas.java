package casadesubastas;

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
            //Menus y otras cosas
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
                    Vendedor ven = new Vendedor(nombre);
                    boolean check = false;
                    for(Vendedor v : this.vendedores){
                        if(v.getNombre().equals(ven.getNombre())){
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
                    this.vendedores.add(ven);
                    while(true){
                        System.out.println("- Productos a subastar:");
                        System.out.print("Nombre del producto: ");
                        scanner = new Scanner(System.in);
                        String nombreP = scanner.nextLine();
                        System.out.print("Precio base: ");
                        scanner = new Scanner(System.in);
                        int precio = scanner.nextInt();
                        Producto p = new Producto(nombreP, precio, ven);
                        ven.addProducto(p);
                        System.out.println();
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
                    //...
                    break;
                case 2:
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
        
    }
    
}
