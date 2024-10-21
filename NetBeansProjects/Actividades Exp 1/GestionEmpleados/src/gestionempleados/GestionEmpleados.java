/*

 */
package gestionempleados;
import java.util.Scanner; //siempre para que pueda leer los datos de usuario

public class GestionEmpleados {


    public static void main(String[] args) {
        //Primero partimos creando un objeto de la clase Empresa, quedara almacenado en una variable
        Empresa empresa = new Empresa();
        
        //Crear un objeto de clase Scanner
        Scanner scanner = new Scanner(System.in); //Al poner System.in le decimos que obtendra datos desde la consola
        
        //Creamos una variable que almacene la opcion escogida por el usuario
        int opcion;
        
        while (true){
            //Agregamos las impresiones del menu
            System.out.println("Escoge una opcion del menu");
            System.out.println("1. Agregar un empleado");
            System.out.println("2. Buscar un empleado por nombre");
            System.out.println("3. Salir");
            System.out.println("Escoge una opcion digitando el numero");
            opcion = scanner.nextInt();
            scanner.nextLine(); //Elimino salto de linea probocado por la tecla Enter \n
            
            //Agregamos un switch para poder ejecutar cada instruccion segun la seleccion del menu
            switch(opcion){
                case 1:
                    //Solicitamos los datos al usuario nombre, id, departamento, aqui capturamos los datos
                    System.out.println("Ingrese nombre del empleado ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese id del empleado ");
                    String id = scanner.nextLine();
                    System.out.println("Ingrese departamento del empleado ");
                    String departamento = scanner.nextLine();
                    
                    //Validacion de los datos ingresados
                    //Si el nombre, id, departamento no estan vacios se ejecutara el codigo
                    if (!nombre.isEmpty() && !id.isEmpty() && !departamento.isEmpty()) {
                        Empleado empleado1 =new Empleado(nombre, id, departamento);
                        empresa.agregarEmpleado(empleado1); 
                    }else{
                        System.out.println("Todos los datos son obligatorios");
                    }
                    break;
                    
                case 2:
                    //Buscar un empleado por nombre
                    System.out.println("Ingresa el nombre del empleado a buscar");
                    String nombreBuscar = scanner.nextLine();
                    empresa.buscarEmpleadoPorNombre(nombreBuscar);
                    break;
                
                case 3:
                    System.out.println("Saliendo del programa...");
                    scanner.close(); //Para que cierre el objeto "scanner" para que no utilice recursos demas
                    return; //detiene el programa
                    
                default:
                    System.out.println("Ingresa una opcion valida");
            }
        }
    }  
}
   
//validaciones de igualdad
