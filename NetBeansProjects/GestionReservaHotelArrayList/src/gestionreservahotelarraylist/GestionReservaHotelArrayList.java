
package gestionreservahotelarraylist;

public class GestionReservaHotelArrayList {


    public static void main(String[] args) {
        //Creamos objetos
        Hotel Sherlock = new Hotel("H001","Hotel Sherlock");
        
        Habitacion casual = new Habitacion ("N° 204", 50000.0, false);
        Habitacion suit = new Habitacion ("N° 908", 115000.0, true);
        Habitacion presi = new Habitacion ("N° 1010", 350000.0, true);
        
        Cliente cliente1 = new Cliente ("N° 56", "CampoSama");
        
        Reserva reserva1 = new Reserva(Sherlock, presi);

        Sherlock.disponibilidadHabitacion(suit);
        Sherlock.disponibilidadHabitacion(presi);
        Sherlock.disponibilidadHabitacion(casual);
        
        cliente1.agregarReserva(reserva1);
        System.out.println("Cliente " + cliente1.getNombreCliente());
        System.out.println("Reservas realizadas");
        for(Reserva reservaRecibida:.cliente1.getReservaRealizada()){
            System.out.println(reservaRecibida);
    }
        
        
        
        
    }
    
}
