
package gestionreservacorreccionprueba;
import java.util.Scanner;

public class GestionReservaCorreccionPrueba {


    public static void main(String[] args) {
        //Creo un objeto de la clase Hotel
        Hotel sistemaDeReservasHotel = new Hotel();
        
        //Creamos instancia de Scanner
        Scanner entradaUsuario = new Scanner(System.in);
        
        //Creamos variable para almacenar opcion del usuario
        int opcionMenu;
        
        //Declaramos una instancia del objeto vacio
        Reserva reservaActual = new Reserva(null,null,null);
        
        while(true){
            //Menu de opciones
            System.out.println("Escoge una opcion del menu");
            System.out.println("1. Agregar un huesped");
            System.out.println("2. Buscar reserva por nombre de husped");
            System.out.println("3. Salir del programa");
            System.out.println("Selecciona un numero");
            
            opcionMenu = entradaUsuario.nextInt();
            entradaUsuario.nextLine();
            
            //Switch para que segun la opcion escoja un camino de codigitto
            switch(opcionMenu){
                case 1:{
                    //Inicializamos las variables como vacias
                    String nombreHuesped = "";
                    String codigoReserva = "";
                    String fechaReserva = "";
                    
                    //Solicitar los datos al usuario, hasta que ingrese algo
                    while(nombreHuesped.isEmpty()){
                        System.out.println("Ingresa el nombre de huesped: ");
                        nombreHuesped = entradaUsuario.nextLine();
                        if (nombreHuesped.isEmpty()){
                            System.out.println("El nombre de huesped no puede estar vacio");
                        }
                    }
                    
                    while(codigoReserva.isEmpty()){
                        System.out.println("Ingresa codigo de reserva del usuario: ");
                        codigoReserva = entradaUsuario.nextLine();
                        if (codigoReserva.isEmpty()){
                            System.out.println("El codigo del huesped no puede estar vacio");
                        }
                    }
                    
                    while(fechaReserva.isEmpty()){
                        System.out.println("Ingresa fecha de reserva del usuario: ");
                        fechaReserva = entradaUsuario.nextLine();
                        if (fechaReserva.isEmpty()){
                            System.out.println("La fecha de reserva no puede estar vacia");
                        }
                    }
                    
                    //Verificar que el id no este repetido
                    if(!codigoReserva.equals(reservaActual.obtenerCodigoReserva())){
                        
                        //Creamos nueva reserva
                        reservaActual = new Reserva(nombreHuesped, codigoReserva,fechaReserva);
                        //Registramos nueva reserva
                        sistemaDeReservasHotel.agregarReserva(reservaActual);
                    }
                }
                    
                case 2:{
                    //Declaro variable vacia
                    String nombreBuscado = "";
                    //solicitar el nombre al user hasta que ingrese algo
                    while(nombreBuscado.isEmpty()){
                        System.out.println("Ingresa el nombre del huesped a buscar ");
                        nombreBuscado = entradaUsuario.nextLine();
                        
                        if(!nombreBuscado.isEmpty()){
                            System.out.println("Campo no puede estar vacio");
                        }
                    }
                    //Buscar reserva por el nombre del huesped
                    sistemaDeReservasHotel.buscarReservaPorNombre(nombreBuscado);
                }        
                 case 3:{
                //salir del programa
                    System.out.println("Saliendo del programa...");
                    entradaUsuario.close();
                    return;        
                }
                 default : System.out.println("Saliendo del programa...");
        }    
            
     }
        
  }
    
}


