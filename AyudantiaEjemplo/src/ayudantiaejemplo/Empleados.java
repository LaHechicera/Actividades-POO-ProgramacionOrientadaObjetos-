
package ayudantiaejemplo;

public class Empleados {
    //Atributos
    private String nombre, id, departamento;
    
    //Constructor
    public Empleados(String nombre, String id, String departamento) {
        this.nombre = nombre;
        this.id = id;
        this.departamento = departamento;
    }
    
    //Get y Set
    //Click derecho, luego insert code y seleccionar "get y set"
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    //Mostrar la informacion de empleado con un toString
    //Click derecho luego, insert code y seleccionar "toString"
    @Override
    public String toString() {
        return "Empleados{" + "nombre= " + nombre + ", id= " + id + ", departamento= " + departamento + '}';
    }
    
}
