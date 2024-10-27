public abstract class Personaje{
    //Atributos abstractos
    protected String nombre;
    protected int posicion;

    //Constructor
    public Personaje(String nombre, int posicion){
        this.nombre = nombre;
        this.posicion = posicion;
    }

    //Metodos
    public abstract void moverse();
    
    //Metodo mostrar info
    public final void mostrarInfo(){
        System.out.println("Personaje seleccionado: " + nombre);
        System.out.println("Posicion personaje: "+ posicion);
    }
}