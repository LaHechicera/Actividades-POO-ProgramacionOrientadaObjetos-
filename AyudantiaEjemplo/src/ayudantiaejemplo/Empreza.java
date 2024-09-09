
package ayudantiaejemplo;

public class Empreza {
    //Creamos atributo de tipo clases
    private Empleados empleados;
    
    //Primer metodo
    //Cuando se trabaja colaborativamente entre clases no tiene atributos ya que los atributos los tiene la clase con la que colaboramos
    public void agregarEmpleado(Empleados empleados) {
        this.empleados = empleados;
        System.out.println("Empleado ha sido agregado con exito");
    }
    
    //Segundo metodo
    public void buscarEmpleadoPorNombre(String nombre){
        //si el empleado no esta vacio y si empleado es igual al nombre buscado (ignorando mayusculas y minusculas)
        if (empleados != null && empleados.getNombre().equalsIgnoreCase(nombre)){
            System.out.println(empleados.toString());//Aqui trae la informacion de empleados para que lo muestre
        }else{
            System.out.println("Empleado no fue encontrado");
        }
    }
}
