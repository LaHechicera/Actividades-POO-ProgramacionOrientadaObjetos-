import java.util.ArrayList;

public class Departamento {
    //Atributos id, nombre, lista empleados
    private String idDepartamento;
    private String nombre;
    private ArrayList<Empleado> listaEmpleados;

    //Constrtuctor
    public Departamento (String idDepartamento, String nombre){
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.listaEmpleados = new ArrayList< >(); //Inicializo mi lista como vacia
    }

    //Metodo para agregar empleado a la lista
    public void agregarEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
    }

    //Metodo que calcule costo total de los salarios
    public double CalcularCostoTotalSalario(){
        double total = 0;
        for (Empleado empleado : listaEmpleados){
            total += empleado.calcularSalario();//Metodo que realiza ese trabajo
        }
        return total;
    }
}
