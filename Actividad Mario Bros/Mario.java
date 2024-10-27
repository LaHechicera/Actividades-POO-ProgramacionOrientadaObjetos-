public class Mario extends Personaje implements Saltar{
    //Atributos especificos de mario
    private String vida;

    //constructor
    public Mario (String nombre, int posicion, String vida){
        super(nombre, posicion);
        this.vida = vida;
    }

    //Implementar metodo padre
    @Override
    public void moverse(){
        System.out.println("Mario corre x2 mas rapido que Luigui");
    }

    //Metodo interface
    @Override
    public void saltar(){
        System.out.println("Mario solo puede saltar una vez por turno");
    }

    //Metodo puntaje de vida
    public void vida(){
        System.out.println("Mario tiene 15 puntos de vida");
    }
        
}
