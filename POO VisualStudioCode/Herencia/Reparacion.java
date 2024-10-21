import java.util.ArrayList;

public class Reparacion {
    //Atributos Arraylist y total
    private ArrayList<Vehiculo> vehiculos;
    private double total;

    //Constructor
    public Reparacion(){
        this.vehiculos =  new ArrayList<>();//inicializo lista vehiculos como vacia
        this.total = 0;//El total lo inicializo en 0
    }
    //Metodo para agregar vehiculo a la reparacion
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
        //Suma y asignacion a la vez
        total += vehiculo.calcularDescuento(0.5);
    }
    //Metodo para calcular valor total de la reparacion
    public double calcularTotal(){
        return total;//devuelve el calor de la reparacion
    }
    //Metodo para mostrar la informacion
    public void mostrarInformacion(){
        System.out.println("Vehiculos en reparacion: ");
        for(Vehiculo vehiculo : vehiculos){
            vehiculo.mostrarInfo();
        }
        System.out.println("Total de la reparacion: "+total);
    }

}
