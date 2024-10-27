public class Mario extends Personaje implements SuperPoder{
    //Atributos
    private boolean poderFuego;

    //Constructor
    public Mario(String nombre, int vidas, int monedas, boolean poderFuego){

        super(nombre, vidas, monedas);
        this.poderFuego= poderFuego;
    }

    //Metodos
    @Override
    public void moverse(){
        System.out.println(nombre + " Mario se mueve corriendo");
    }

    @Override
    public int comerEstrella(){
        return 10;//referencia a 10 segundos, cuando mario come una estrella tiene un poder que dura 10 segundos
    }

    @Override
    public boolean comerHongo(){
        return true;//Cuando mario crece al comer el hongo
    }

    public void lanzarBolasFuego(){
        if(poderFuego){
            System.out.println(nombre + " lanza bola de fuego");
        }else{
            System.out.println(nombre+" no tiene poder de fuego");
        }
    }
}
