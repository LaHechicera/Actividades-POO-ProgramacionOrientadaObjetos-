
package gestionreservahotelarraylist;
import java.util.ArrayList;

public class Cliente {
    //Atributos
    private String idCliente, nombreCliente;
    private ArrayList <Reserva>reservaRealizada;
    
    //Constructor
    public Cliente(String idCliente, String nombreCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.reservaRealizada = new ArrayList<>();
    }
    
    public void agregarReserva(Reserva reservaRecibida){
        reservaRealizada.add(reservaRecibida);
    }
    
    //Get y Sett
    public String getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public ArrayList<Reserva> getReservaRealizada() {
        return reservaRealizada;
    }
    public void setReservaRealizada(ArrayList<Reserva> reservaRealizada) {
        this.reservaRealizada = reservaRealizada;
    }

    //GetInfo
    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", reservaRealizada=" + reservaRealizada + '}';
    }
    
    
    
}
