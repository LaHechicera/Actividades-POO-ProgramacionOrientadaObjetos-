import java.util.ArrayList;
import java.util.Scanner;

public class Gimnasio {
    //Atributos; creamos lista que almacene a los Alumnos
    private ArrayList<Alumno> alumnos;

    //Creamos objeto de Scanner
    private Scanner scanner;

    //Constructor para iniciar ArrayList y Scanner, quiere decir crear nuevo objetos de cada atributo
    public Gimnasio (){
        alumnos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    //1. metodo para agregar alumno
    public void agregarAlumno (){
        System.out.println("Ingrese ID de alumno: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese nombre del alumno: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese edad del alumno: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese N° de membresia del alumno: ");
        int membresia = scanner.nextInt();
        scanner.nextLine();

        //Creamos nuevo objeto donde se almacenara el Alumno
        Alumno alumno = new Alumno(id, nombre,edad, membresia);

        //Agregamos a la lista el objeto
        alumnos.add(alumno);
        System.out.println("Alumno agregado exitosamente!");

    }

    //2. Metodo para mostrar lista de alumnos
    public void mostrarAlumno(){
        if(alumnos.isEmpty()){
            System.out.println("No se encontraron alumnos que listar");
        }else{
            for(Alumno alumno : alumnos){
                System.out.println(alumno);
            }
        }
    }

    //3. Actualizacion de alumnos
    public void actualizacionAlumno(){
        System.out.println("Ingrese ID alumno a actualizar");
        int id = scanner.nextInt();
        scanner.nextLine();

        for(Alumno alumno : alumnos){
            if(alumno.getIdAlumno()==id){
                System.out.println("Ingrese nuevo nombre de alumno");
                String nuevoNombre = scanner.nextLine();
                System.out.println("Ingrese edad de alumno");
                int nuevaEdad = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingrese numero de membresia");
                int nuevaMembresia = scanner.nextInt();
                scanner.nextLine();

                //Actualizacion datos con set
                alumno.setNombreAlumno(nuevoNombre);
                alumno.setEdadAlumno(nuevaEdad);
                alumno.setMembresiaAlumno(nuevaMembresia);
                System.out.println("Alumno actualizado con exito!");
                return;
            }
        }
        System.out.println("Alumno no encontrado");
    }

    //Eliminar 
    public void eliminarAlumno(){
        System.out.println("Ingrese ID alumno a eliminar: ");
        int id = scanner.nextInt();

        Alumno alumnoEliminar = null;

        for(Alumno alumno : alumnos){
            if(alumno.getIdAlumno()==id){
                alumnoEliminar = alumno;
            }
        }

        if(alumnoEliminar != null){
            alumnos.remove(alumnoEliminar);
            System.out.println("Alumno se ha eliminado con exito");
        }else{
            System.out.println("No se ha encontrado el alumno");
        }

    }

}
