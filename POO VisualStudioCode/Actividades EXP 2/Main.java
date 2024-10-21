import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Creamos una instancia de tienda para gestionar los productos
        Tienda tienda = new Tienda();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        //Creamos menu principal
        do{

            System.out.println("\n Menu de Tienda");
            System.out.println("1. Agregar");
            System.out.println("2. Listar");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");

            System.out.println("\nSelecciona una opcion");

            opcion = scanner.nextInt();

            //Procesar la opcion seleccionada
            switch(opcion){
                case 1:
                    tienda.agregarProducto();
                    break;

                case 2: 
                    tienda.mostrarProducto();
                    break;

                case 3:
                    tienda.actualizarProducto();
                    break;

                case 4: 
                    tienda.eliminarProducto();
                    break;


                case 5:
                    System.out.println("Saliendo del sistema ...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Ingrese una opcion valida");

            }
        }while(opcion!=5); //Se seguira ejecutando si el ususario no apreta el 5

    }
}
