
package gestionreservahotelarraylist;
import java.util.ArrayList;

public class Hotel {
    //Atributos
    private String idHotel, nombre;
    private ArrayList <Habitacion> habitacionDisponible;
    
    //Constructor
    public Hotel(String idHotel, String nombre) {
        this.idHotel = idHotel;
        this.nombre = nombre;
        this.habitacionDisponible = new ArrayList<>();
    }
    
    //Inicializacion ArrayList
    public void disponibilidadHabitacion(Habitacion habitacion){
        habitacionDisponible.add(habitacion);
    }

    public String getIdHotel() {
        return idHotel;
    }
    public void setIdHotel(String idHotel) {
        this.idHotel = idHotel;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Habitacion> getHabitacionDisponible() {
        return habitacionDisponible;
    }
    public void setHabitacionDisponible(ArrayList<Habitacion> habitacionDisponible) {
        this.habitacionDisponible = habitacionDisponible;
    }
    
    

    //Get info
    @Override
    public String toString() {
        return "Hotel{" + "idHotel=" + idHotel + ", nombre=" + nombre + ", habitacionDisponible=" + habitacionDisponible + '}';
    }
    
    
    
    
    
}
