//Creamos clase abstracta; esta no permite ser instanciada directamente, solo desde una sub clase

public abstract class Jugador {
    //Atributos
    protected String nombre;
    protected int salud;

    //constructor
    public Jugador (String nombre, int salud){
        this.nombre = nombre;
        this.salud = salud;
    }

    //Metodo abstracto, declara el nombre y si va a tener un return o va a ser void
    //Este metodo si o si tendra que poner este metodo, pero lo que se ponga dentro del parentesis dependera de lo que necesite la clase hija
    //Clases hijas obligadas a utilizar este metodo
    public abstract int calcularPuntos();
    
    //Metodo final = no cambia ni puede ser sobreescrito
    public final void mostrarInfo(){
        System.out.println("Nombre jugador: " + nombre);
        System.out.println("Vida del jugador: " + salud);
    }
}

