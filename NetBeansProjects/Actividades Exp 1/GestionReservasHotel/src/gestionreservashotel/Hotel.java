
package gestionreservashotel;

public class Hotel {
    
    //Creamos un atributo de tipo clase, ya que la Clase Hotel no posee atributos sino que los sacara desde la clase con la que colabora
    //En este caso ReservaHuesped
    private ReservaHuesped reservahuesped;
    
    //Creamos primer metodo de la clase "agregarReserva"
    public void agregarReserva(ReservaHuesped reservahuesped){
        this.reservahuesped = reservahuesped;
        System.out.println("Se ha reservado con exito!");
    }
    
    //Creamos segundo metodo de la clase "buscarReservaPorNombre"
    public void buscarReservaPorNombre(String nombre){
        //Aqui le decimos que si la reserva no esta vacia y si el nombre es igual al buscado ignorando las mayusculas y minusculas entonces que realice esa linea de codigo
        if(reservahuesped != null && reservahuesped.getNombre().equalsIgnoreCase(nombre)){
            System.out.println("Reserva encontrada con exito");
            System.out.println(reservahuesped.toString());
        }else{
            System.out.println("Reserva no fue encontrada");
        }
    }
}
