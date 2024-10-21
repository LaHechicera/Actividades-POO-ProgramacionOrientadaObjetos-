import java.util.ArrayList;

public class Clan {
    //Atributos
    private String nombreClan;
    private ArrayList <Jugador> listaJugadores;

    //Constructor
    public Clan (String nombreClan){
        this.nombreClan = nombreClan;
        this.listaJugadores = new ArrayList<>();//Iniciamos la lista como vacia (Por que no tiene datos dentro pues)

    }

    //Metodo para agregar jugadores a lista
    public void agregarJugadores(Jugador jugadorInstancia){
        listaJugadores.add(jugadorInstancia);
    }

    //Metodo para calcular puntos del clan
    public int calcularTotalPuntos(){
        //Declaramos una variable que almacene el total
        int totalPuntos = 0;
        for (Jugador jugadorInstancia : listaJugadores){
            //Sumar + y asignar = a la vez +=
            totalPuntos += jugadorInstancia.calcularPuntos();
        }
        return totalPuntos;
    }

}
