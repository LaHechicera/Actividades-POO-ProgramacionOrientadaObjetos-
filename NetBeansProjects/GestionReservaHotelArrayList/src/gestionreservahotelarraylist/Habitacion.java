
package gestionreservahotelarraylist;

public class Habitacion {
    //Atributos
    private String numeroHabitacion;
    private Double precioNoche;
    private Boolean disponible;
    
    //Constructor
    public Habitacion(String numeroHabitacion, Double precioNoche, Boolean disponible) {
        this.numeroHabitacion = numeroHabitacion;
        this.precioNoche = precioNoche;
        this.disponible = disponible;
    }
    
    //Get y setter
    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }
    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }
    public Double getPrecioNoche() {
        return precioNoche;
    }
    public void setPrecioNoche(Double precioNoche) {
        this.precioNoche = precioNoche;
    }
    public Boolean getDisponible() {
        return disponible;
    }
    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
      
    //Metodo traer info
    public String getInfo(){
        return "Numero de habitacion: " + numeroHabitacion + ", Precio por noche: " + precioNoche + ", Disponibilidad habitacion: " + (disponible ? "Esta disponible" : "No esta disponible");
}
    
}
