//Declaramos clase 
public abstract class Personaje {
    //Atributos
    protected String nombre;
    protected int vidas, monedas;

    //Constructor (Trabajamos con constructor para crear un objeto)
    public Personaje(String nombre, int vidas, int monedas){
        this.nombre = nombre;
        this.vidas = vidas;
        this.monedas = monedas;
    }

    //Metodo
    public abstract void moverse();

    //Metodo perder vida
    public int perderVida(){
        if(vidas >0){ //Si vida es mayor a 0
            vidas--; //resta vida
        }
        return vidas;
    }

    //Recoger monedas metodo
    public final int recogerMoneda(){
        monedas ++;
        return monedas;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Vidas: "+vidas);
        System.out.println("Monedas: "+monedas);
    }

    
}