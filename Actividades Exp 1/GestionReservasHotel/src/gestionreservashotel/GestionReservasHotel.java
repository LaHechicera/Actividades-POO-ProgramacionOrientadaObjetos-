
package gestionreservashotel;
import java.util.Scanner;

public class GestionReservasHotel {

    public static void main(String[] args) {
        
        //Creamos un objeto de la clase hotel
        Hotel hotel = new Hotel();
        
        //Creamos un objeto de la clase scanner para que recoga lo que el usuario introduzca en consola
        Scanner scanner = new Scanner (System.in);
        
        //A su vez creamos una variable donde se almacene la respuesta del usuario
        int opcion;
        
        while(true){
            //Menu interactivo
            System.out.println("Ingrese una opcion");
            System.out.println("1. Agregar reserva");
            System.out.println("2. Buscar reserva por nombre");
            System.out.println("3. Salir del programa");
            System.out.println("Para escoger una opcion digite un numero...");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); //Consume el espacio dejado por el Enter
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese nombre del huesped: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese id del huesped: ");
                    String id = scanner.nextLine();
                    System.out.println("Ingrese fecha de reserva: ");
                    String fechaReserva = scanner.nextLine();
                    
                    //Validacion de datos
                    //Le decimos que si los apartados no estan vacios que realice esta porcion de codigo
                    if (!nombre.isEmpty() && !id.isEmpty() && !fechaReserva.isEmpty()){
                        ReservaHuesped reservahuesped1 = new ReservaHuesped(nombre,id,fechaReserva);
                        hotel.agregarReserva(reservahuesped1);
                    }else{
                        System.out.println("Todos los datos son requeridos, intente nuevamente");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del huesped a buscar ");
                    String buscarHuesped = scanner.nextLine();
                    hotel.buscarReservaPorNombre(buscarHuesped);
                    break;
                case 3:
                    System.out.println("Saliendo de programa reservas...");
                    //Aqui cerramos el scanner en conjunto con el programa para que no consuma mas recursos
                    scanner.close();
                    return;
                default:
                    System.out.println("Ingrese opcion valida, intente nuevamente...");
            }
        }
    }
    
}
