//Clase Empleado no puede ser instanciada desde otros lugares. No se puede crear clase Empleado en otras clases como el MAIN 
//Sirven como guia o plantilla
public abstract class Empleado {

    //CREACION CLASE ABSTRACTA
//Dato va a estar protegido 
    protected String idEmpleado;
    protected String nombre;
    protected double sueldoBase;

    //Constructir
    public Empleado(String idEmpleado, String nombre, double suelddoBase){
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.sueldoBase = suelddoBase;
    }

    //CREACION METODO ABSTRACTO
//Metodo abstracto, solo se declara, es un tipo de contrato es decir todas las subclases deben tener este metodo
//No tiene implementacion en la clase abstracta, sino en las subclases (Cuando se crea el objeto).
    public abstract double calcularSalario();

//Metodo final = no cambia como tal, pero no puede ser cambiado por las subclases o clases hijas
//Final = metodo de tipo fijo, no cambia
    public final void mostrarInfo(){
        System.out.println("ID Empleado: "+ idEmpleado + " Nombre Empleado: "+nombre+" Sueldo Base: "+sueldoBase);
    }
    
}