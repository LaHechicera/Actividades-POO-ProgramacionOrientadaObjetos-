
package scootin;

import java.util.ArrayList;

public class Empresa {
    //Atributo
    private ArrayList<Empleado> listaEmpleados;
    
    //Constructor para inicializar la ArrayList o coleccion
    public Empresa() {
        listaEmpleados = new ArrayList<>();
    }
    
    //Metodo para agregar empleados
    public void agregarEmpleado(Empleado empleado){ //trabajamos con clase empleado 
        listaEmpleados.add(empleado); //Aqui se agrega al empleado a traves de scanner
    }
    
    //Metodo para eliminar empleado //
    public void eliminarEmpleado(String rut){
        //Ciclo que pueda recorrer la lista e ir comparando cada rut 
        //Inicia la lista en 0 // valida el tamaño de la lista // le suma 1 a la lista
        for(int i = 0; i < listaEmpleados.size(); i++){
            if (listaEmpleados.get(i).getRut().equals(rut)){
                listaEmpleados.remove(i);
                System.out.println("El empleado " + rut + " fue eliminado con exito");
                return;
            }
        }
        System.out.println("El empleado " + rut + " no fue encontrado");
    }
    
    //Metodo listar empleado
    public void listarEmpleados(){
        for(Empleado empleado  : listaEmpleados){
            System.out.println(empleado.toString());
        }
    }
    
    //Metodo buscar empleado
    public boolean buscarEmpleado(String Rut){
        for(Empleado empleado : listaEmpleados){
            if(empleado.getRut().equals(Rut)){
                return true;
            }
                
        }
        return false;
    }
    
}
