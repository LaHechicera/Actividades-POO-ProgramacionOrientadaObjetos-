//MAIN

package bibliotecaduocuc;
import java.util.Scanner; //Importamos Scanner

public class BibliotecaDuocUC {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Creamos una clase Scanner que nos ayuda a leer lo que el usuario ingresa en consola
        
        //Crear objeto de la clase Biblioteca para trabajar con los metodos de la Clase, aqui comienza la colaboracion entre clases
        //Metodos: agregarLibro(), mostrarLibro(), buscarPalabraTitulo(), 
        Biblioteca biblioteca = new Biblioteca();//Creo objeto de la clase Biblioteca para trabajar con sus metodos
        
        //declaramos una variable para almacenar la respuesta del usuario en el menu
        int opcion;
        
        //Menu con bucle infinito (While) para que el usuario pueda escoger la opcion del menu
        //Salimos del bucle cuando el usuario escoge la opcion de salir
        while(true){//bucle infinito
            //opciones menu
            System.out.println("Menu de Biblioteca DuocUC");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar libro");
            System.out.println("3. Buscar palabra en el titulo");
            System.out.println("4. Salir del programa");
            System.out.println("Escoga un numero");
            
            opcion = scanner.nextInt(); //Leemos opcion digitada por el usuario
            scanner.nextLine();// capturamos y borramos el enter o salto de linea que presiona el usuario, ya que igual lo captura. Es necesario consumir o eliminar el salto de linea 
            //creado por el usuario al presionar enter
            
            switch (opcion){
                case 1:
                    //solicitamos al usuario que ingrese el nombre de titulo y autor
                    System.out.println("Ingrese el titulo del libro: ");
                    String titulo = scanner.nextLine();
                    
                    System.out.println("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    
                    //Agregamos un libro a la biblioteca
                    biblioteca.agregarLibro(titulo, autor);
                    break;
                    
                case 2:
                    //Mostramos un libro de a biblioteca
                    biblioteca.mostrarLibro();
                    break;
                    
                case 3:
                    //Busqueda de palabra en el titulo
                    System.out.println("Ingrese la palabra a buscar en el titulo de libro: ");
                    //capturamos la palabra que ingresa el usuario, y la guardamos en la variable que creamos "palabra"
                    String palabra = scanner.nextLine();
                    
                    biblioteca.buscarPalabraTitulo(palabra);
                    break;
                    
                case 4:
                    System.out.println("Saliendo del programa...");
                    return; //hace que se detenga el programa, la ejecucion del MAIN, del bucle
                    
                default:
                    System.out.println("Ingresa una opcion valida");
                    break;
            }
        }
    }
    
}
