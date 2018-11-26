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
                    System.out.println("------------------------------------");
                    System.out.print("Nombre Completo: ");
                    scanner = new Scanner(System.in);
                    String nombre = scanner.nextLine();
                    Vendedor ven = new Vendedor(nombre);
                    System.out.println("- Productos a subastar:");
                    System.out.print("Nombre del producto: ");
                    scanner = new Scanner(System.in);
                    String nombreP = scanner.nextLine();
                    System.out.print("Precio base: ");
                    scanner = new Scanner(System.in);
                    int precio = scanner.nextInt();
                    //...
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("! ------------------------------------ !");
                    System.out.println("  Por favor ingresar una opción válida");;
                    System.out.println("! ------------------------------------ !");
                    break;
            }
        }
    }
    
}
