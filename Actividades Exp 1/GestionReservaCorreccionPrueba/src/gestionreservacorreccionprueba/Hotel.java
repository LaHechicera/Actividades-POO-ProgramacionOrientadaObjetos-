
package gestionreservacorreccionprueba;

public class Hotel {
    
    //Crear variable que guarde la ultima reserva realizada
    public Reserva ultimaReserva;
    
    //Metodo para agregar una reserva al hotel
    public void agregarReserva(Reserva nuevaReserva){
        
        //asignamos la nueva reserva
        this.ultimaReserva = nuevaReserva;
        System.out.println("La reserva se a realizado con exito "+ this.ultimaReserva.toString());      
    }
    
    //Metodo para buscar una reserva en el hotel por el nombre
    public void buscarReservaPorNombre(String nombreHuespedBuscar){
        //Se verifica que exista una reserva
        //Que el numbre coincida
        if(ultimaReserva != null && ultimaReserva.obtenerNombreHuesped().equalsIgnoreCase(nombreHuespedBuscar)){
            System.out.println("Reserva encontrada " + this.ultimaReserva.toString());
        }else{
            System.out.println("Reserva no encontrada");
        }
    }
}
