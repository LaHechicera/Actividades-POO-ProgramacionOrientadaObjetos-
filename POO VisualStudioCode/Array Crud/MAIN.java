import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        //Creamos instancia de gimnasio
        Gimnasio gimnasio = new Gimnasio();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do{
            System.out.println("\n Gestion alumnos insritos a Gimnasio Duoc UC");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Mostrar lista de alumno");
            System.out.println("3. Actualizar alumno");
            System.out.println("4. Eliminar alumno por ID");
            System.out.println("5. Salir del programa");
            System.out.println("\nFavor escoga una opicion");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    gimnasio.agregarAlumno();
                    break;
                
                case 2: 
                    gimnasio.mostrarAlumno();
                    break;
                
                case 3:
                    gimnasio.actualizacionAlumno();
                    break;

                case 4:
                    gimnasio.eliminarAlumno();
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    return;

                default:
                    System.out.println("Ingrese opcion valida");
                    scanner.close(); 
            }
        }while(opcion!=5);//Mientras la opcion no sea 5 el programa se seguira ejecutando


    }
}
