public class MAIN {
    public static void main(String[] args) {
        //Creamos Jugadores
        Jugador cazador1 = new Cazador("Steve",20, 100);
        Jugador minero1 = new Minero("Alex", 18, 50);

        //Crear clan
        Clan clanDuoc = new Clan("Clan Duoc UC");

        //Asignar jugadores a clan
        clanDuoc.agregarJugadores(minero1);
        clanDuoc.agregarJugadores(cazador1);

        //Mostrar info por cada jugador
        cazador1.mostrarInfo();
        System.out.println("Puntos obtenidos cazador: " + cazador1.calcularPuntos());
        minero1.mostrarInfo();
        System.out.println("Puntos obtenidos minero: " + minero1.calcularPuntos());

        //Total puntos clan
        System.out.println("Total puntos del clan: "+ clanDuoc.calcularTotalPuntos());

    }
}
