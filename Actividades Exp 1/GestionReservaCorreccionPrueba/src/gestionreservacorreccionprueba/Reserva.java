
package gestionreservacorreccionprueba;

public class Reserva {
    //Atributos
    private String nombreHuesped, codigoReserva, fechaReserva;
    
    //Constructor
    public Reserva(String nombreHuesped, String codigoReserva, String fechaReserva) {
        this.nombreHuesped = nombreHuesped;
        this.codigoReserva = codigoReserva;
        this.fechaReserva = fechaReserva;
    }
    
    //Get (obtener ID y Nombre)
    public String obtenerNombreHuesped() {
        return nombreHuesped;
    }
    public String obtenerCodigoReserva() {
        return codigoReserva;
    }
    
    //toString
    @Override
    public String toString() {
        return "Reserva{" + "nombreHuesped=" + nombreHuesped + ", codigoReserva=" + codigoReserva + ", fechaReserva=" + fechaReserva + '}';
    }
    
    
}
