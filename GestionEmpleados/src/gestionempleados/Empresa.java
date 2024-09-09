
package gestionempleados;

public class Empresa {
    //Trabajar de manera colaborativa entre clases
    //Aqui estamos invocando a la clase "Empleado" y a la vez creamos una instancia en la clase (objeto) "empleado" con letras chikitas
    private Empleado empleado;
    
    //Metodo para agregar un empleado
    //trabaja con la clase y el objeto creado, asi trabaja de manera colaborativa enre clases
    public void agregarEmpleado(Empleado empleado){
        this.empleado = empleado; //Instancia del objeto le pasare el dato de "empleado" que viene desde el MAIN
        System.out.println("Empleado fue agregado exitosamente");
    }    
    
    //Segundo metodo
    //Buscar un empleado por su nombre
    //Nombre debe describir especifico que es lo que hace
    public void buscarEmpleadoPorNombre(String nombre){//recibira dato desde el MAIN desde lo que ponga el usuario
        //Si empleado no esta vacio
        //&& nombre del empleado es igual al nombre obtenido por consola
        //ignorando mayusculas y minusculas
        //cuando hay && (amperzon) ambas condiciones deben ser verdaderas
        if (empleado != null && empleado.getNombre().equalsIgnoreCase(nombre)){//null = vacio equalIgnoreCase=va a comparar e ignorar si los datos son en mayuscula o minuscula
            System.out.println(empleado.toString());
        }else{
            System.out.println("El empleado no fue encontrado");
        }
    }
}
