import java.util.Scanner;
import java.util.ArrayList;

public class MAIN {
    public static void main(String[] args) {
        
        ArrayList listaPersonajes = new ArrayList<Personaje>();
        Scanner scanner = new Scanner(System.in);
        Mario mario = new Mario("Mario", 2, "15 de vida");
        Luigi luigi = new Luigi("Luigui", 1, "10 monedas al iniciar partida");

        int op;

        do{
            System.out.println("Habilidades de Mario o Luigi\n");
            System.out.println("Eligue un personaje:");
            System.out.println("1. Mario");
            System.out.println("2. Luigi");
            System.out.println("3. Listar personajes");
            System.out.println("4. Salir del programa");
            
            op = scanner.nextInt();

            switch(op){
                case 1:
                int op1;
                op1 = scanner.nextInt();
                System.out.println("Eliga que quiere hacer:");
                System.out.println("1. Saltar");
                System.out.println("2. Mover");
                switch(op1){
                    case 1:
                    mario.saltar();
                    break;
                    case 2:
                    mario.moverse();
                    break;
                }

            }
        }
    }
}
