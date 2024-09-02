
package gestionestudiantes;
import java.util.Scanner;

public class GestionEstudiantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        //Se le pide al usuario ingresar datos
        System.out.println("Ingrese matricula de estudiantes: ");
        String matricula = scanner.nextLine();
        
        System.out.println("Ingrese nombre de estudiante: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese nota final de estudiante: " );
        double notaFinal = scanner.nextDouble();
        
        //Se crea el objeto
        Estudiante estudiante1 = new Estudiante(matricula, nombre,notaFinal);
        
        //Le pedimosque nos imprima los datos antes ingresados
        System.out.println("Informacion del estudiante");
        System.out.println(estudiante1.getInfo());
        
        //Aqui se realiza la condicional
        if (notaFinal>= 4.0){
            System.out.println("Ha aprobado con exito!");
        }else{
            System.out.println("Ha reprobado nos vemos el otro semestre c:");
        }
    }
}            
    

