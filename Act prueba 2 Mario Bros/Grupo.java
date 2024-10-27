import java.util.ArrayList;

public class Grupo {
    //Atributos
    public ArrayList <Personaje> jugadores;//Tambien se puede inicializar aqui la arraylist

    public Grupo(){
        this.jugadores = new ArrayList<>();
    }

    //agregar jugador
    public void agregarJugador(Personaje jugador){
        jugadores.add(jugador);
    }

    public int calcularTotalMonedas(){
        int totalMonedas = 0;
        for(Personaje jugador : jugadores){
            totalMonedas += jugador.monedas;
        }
        if (totalMonedas>100){
            System.out.println("El grupo a ganado 100 monedas extra");
            totalMonedas += 100;
        }
        return totalMonedas;
    }

    //Metodos info
    public void mostrarInformacionGrupo(){
        for(Personaje jugador : jugadores){
            jugador.mostrarInfo();
        }
    }
}
