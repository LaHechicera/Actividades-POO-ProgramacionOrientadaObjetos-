import java.util.Scanner;
public class MAIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grupo grupo = new Grupo();
        boolean continuar  = true;

        while (continuar) {
            System.out.println("\nSeleccione una opcion\n");
            System.out.println("1. Crear un nuevo Mario");
            System.out.println("2. Crear un nuevo Yoshi");
            System.out.println("3. Mover un personaje");
            System.out.println("4. Calcular total monedas");
            System.out.println("5. Mostrar informacion");
            System.out.println("6. Salir del programa\n");
            int op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                Personaje personaje = new Mario("Mario", 2, 100, true);
                grupo.agregarJugador(personaje);
                break;

                case 2:
                Personaje personaje2 = new Yoshi("Yoshi", 2, 100, "Verde");
                grupo.agregarJugador(personaje2);
                break;

                case 3:
                for(Personaje jugador : grupo.jugadores){
                    jugador.moverse();
                }
                break;

                case 4:
                int totalMonedas = grupo.calcularTotalMonedas();
                System.out.println("Total monedas del grupo: "+ totalMonedas);
                break;

                case 5:
                grupo.mostrarInformacionGrupo();
                break;

                case 6:
                    continuar =  false;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Ingrese opcion valida");
            }
        }
        scanner.close();
    }
}
