public class Luigi extends Personaje implements Saltar {
    //Atributos
    private String monedas;

    //Constructor
    public Luigi(String nombre, int posicion, String monedas){
        super(nombre, posicion);
        this.monedas = monedas;
    }

    //Implementar metodo padre
    @Override
    public void moverse(){
        System.out.println("Luigi puede correr hasta 4 casillas");
    }

    //Metodo interface
    @Override
    public void saltar(){
        System.out.println("Luigi puede saltar 2 veces en el aire");
    
    }

    //Metodo 
    public void monedas(){
        System.out.println("Luigi comienza con 10 monedas la partida");
    }

}
