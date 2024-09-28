
package gestordeproductos;
import java.util.Scanner; //Sirve para leer los datos ingresados en la consola, hechos por el usuario

public class GestorDeProductos {

  
    public static void main(String[] args) {
      //Para utilizar Scanner, hay que crear una instancia de Scannerpara poder utilizarlo
      Scanner scanner = new Scanner (System.in); //Capta datos en consola
      
      //Solicitar el codigo al usuario
        System.out.println("Ingrese el codigo del producto ");
        String codigo = scanner.nextLine(); //nextLine String sirve para capturar los datos que ingrese el usuario
        
        //Solicitar el nombre al usuario
        System.out.println("Ingrese el nombre del producto ");
        String nombre = scanner.nextLine();
        
        //Solicitar la disponibilidad al usuario
        System.out.println("Ingrese la disponibilidad del product (true/false) ");
        Boolean disponible = scanner.nextBoolean();//Aqui cambia el codigo ya que "disponibilidad" es un booleano
        
        // Creamos un objeto de la clase producto
        Producto producto1 = new Producto (codigo, nombre, disponible);
        
        //Mostrar toda la info del producto
        System.out.println("Informacion del producto");
        System.out.println(producto1.getInfo());
        
        //Verificar si el producto esta disponible
        if (producto1.isDisponible()){
            System.out.println("Producto disponible para compra");
        }else{
            System.out.println("Producto no disponible");
        }
    }
    
}
