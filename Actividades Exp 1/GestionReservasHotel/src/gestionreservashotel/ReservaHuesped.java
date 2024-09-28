
package gestionreservashotel;

public class ReservaHuesped {
    //Atributos de la clase
    private String nombre, id, fechaReserva;
    
    //Constructor

    public ReservaHuesped(String nombre, String id, String fechaReserva) {
        this.nombre = nombre;
        this.id = id;
        this.fechaReserva = fechaReserva;
    }
    
    //Agregamos Getter y Setter

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
    public String getFechaReserva() {
        return fechaReserva;
    }
    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
    
    //Agregamos un toString para facilitar la busqueda mas adelante en MAINy que solo lea en String
    @Override
    public String toString() {
        return "ReservaHuesped {" + " Nombre = " + nombre + ", ID = " + id + ", Fecha de Reservacion = " + fechaReserva + '}';
    }
    
    
    
}
