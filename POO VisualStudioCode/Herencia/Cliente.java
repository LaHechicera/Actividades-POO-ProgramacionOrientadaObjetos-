import java.util.ArrayList;
public class Cliente {
    //Atributos id, nombre y lista llamada reparacion
    private String idCliente;
    private String nombreCliente;
    private ArrayList <Reparacion> reparacionesRealizadas;

    //Constructor
    public Cliente(String idCliente, String nombreCliente){
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.reparacionesRealizadas = new ArrayList<>();
    }
    //Metodo para agregar una reparacion a la lista
    public void agregarReparacion(Reparacion reparacion){
        //Llamo a la lista y le asigno una reparacion
        reparacionesRealizadas.add(reparacion);
    }
    //Metodo para mostrar reparaciones del cliente
    public void mostrarReparaciones(){
        System.out.println("ID cliente: "+idCliente);
        System.out.println("Nombre cliente: "+nombreCliente);
        for(Reparacion reparacion : reparacionesRealizadas){
            reparacion.mostrarInformacion();
        }
        
    }

}
