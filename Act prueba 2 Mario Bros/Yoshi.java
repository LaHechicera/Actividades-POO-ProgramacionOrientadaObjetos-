public class Yoshi extends Personaje implements SuperPoder{
    //Atributos
    private String color;

    //Constructor
    public Yoshi(String nombre, int vidas, int monedas, String color){
        super(nombre, vidas, monedas);
        this.color=color;
    }

    //Metodos
    @Override
    public void moverse(){
        System.out.println(nombre + "Se mueve con saltos");
    }

    @Override
    public int comerEstrella(){
        return 8;
    }

    @Override
    public boolean comerHongo(){
        return true;
    }

    public void usarLengua(){
        System.out.println(nombre + " usa su lengua para comer enemigos");
    }
}
