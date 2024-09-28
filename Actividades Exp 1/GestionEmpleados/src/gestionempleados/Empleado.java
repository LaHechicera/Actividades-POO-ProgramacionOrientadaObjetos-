
package gestionempleados;

public class Empleado {
    //Atributos nombre, id, departamento String
    private String nombre, id, departamento;
    
    //Creamos Constructor

    public Empleado(String nombre, String id, String departamento) {
        this.nombre = nombre;
        this.id = id;
        this.departamento = departamento;
    }
    // Accesadores GET (obtienen datos) y mutadores SET (Cambiar valor o setear)
    //Ej GET: nombre = empleado1.getNombre; //Marcelo
    //Ej SET: nombre = empleado1.setNombre("Eduardo");//Aqui cambiaria el nombre
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
    
    //GetInfo crearemos otro metodo "toString" retorna todos los atributos de la clase si todos son String
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", id=" + id + ", departamento=" + departamento + '}';
    }
}
