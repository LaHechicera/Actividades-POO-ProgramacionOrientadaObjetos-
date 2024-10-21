
package scootin;

public class Empleado {
    //Atributos
    private String rut, nombreEmpleado;
    private int acno, edad;
    //Dato de tipo objeto, trabajo colaborativo entre clases
    private Puesto puesto; //Trabajamos con clase Puesto creando una instancia de esta 
    
    //Constructor
    public Empleado(String rut, String nombreEmpleado, int acno, int edad, Puesto puesto) {
        this.rut = rut;
        this.nombreEmpleado = nombreEmpleado;

        this.acno = acno;
        this.edad = edad;
        this.puesto = puesto;
    }
    //Constructor para inicializar el objeto
    public Empleado() {
        puesto = new Puesto();
    }
    
    //Getter y Setter
    public String getRut() {
        return rut;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    public int getAcno() {
        return acno;
    }
    public void setAcno(int acno) {
        this.acno = acno;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Puesto getPuesto() {
        return puesto;
    }
    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }
    
    //toString

    @Override
    public String toString() {
        return "Empleado{" + "rut=" + rut + ", nombreEmpleado=" + nombreEmpleado +  ", acno=" + acno + ", edad=" + edad + ", puesto=" + puesto + '}';
    }
    
    
}
