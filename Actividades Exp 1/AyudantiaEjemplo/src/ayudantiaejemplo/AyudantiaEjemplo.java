
package ayudantiaejemplo;
import java.util.Scanner;
public class AyudantiaEjemplo {

    public static void main(String[] args) {
        Empreza empreza = new Empreza();
        
        //Crear objeto de clase Scanner
        Scanner scanner = new Scanner(System.in);
        
        //Variable que almacene opcion del usuario
        int opcion;
        
        while (true) {
            //Menu interactivo
            System.out.println(" Escoga una opcion del menu ");
            System.out.println(" 1. Agregar un empleado ");
            System.out.println(" 2. Buscar un empleado ");
            System.out.println(" 3. Salir del menu ");
            System.out.println(" Escoga una opcion digitando un numero ");
            
            opcion  = scanner.nextInt();
            scanner.nextLine();//Elimino salto de linea por tecla Enter
            
           //Agregamos switch para ejecutar cada instruccion del menu
            switch(opcion){
                case 1:
                    //Solicitamos datos al ususario primero
                    //Recuerda que siempre pedimos un dato al usuario y al instante almacenamos la respuesta de usuario en una variable
                    System.out.println("Ingrese nombre de empleado: "); //Pedimos al usuario
                    String nombre = scanner.nextLine();//Guardamos inmediatamente lo que nos da el usuario en esta variable
                    System.out.println("Ingrese id de empleado: ");
                    String id = scanner.nextLine();
                    System.out.println("Ingrese departamento de empleado: ");
                    String departamento = scanner.nextLine();
                    
                    //Validacion de datos
                    if(!nombre.isEmpty() && !id.isEmpty() && !departamento.isEmpty()){
                        Empleados empleados1 = new Empleados(nombre,id,departamento);
                        empreza.agregarEmpleado(empleados1);
                    }else{
                        System.out.println("Todos los datos son requeridos");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese empleado a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    empreza.buscarEmpleadoPorNombre(nombreBuscar);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return; //Recuerda que aqui es return no break
                default:
                    System.out.println("Ingrese opcion valida");
            }
        }
        
    }
    
}
