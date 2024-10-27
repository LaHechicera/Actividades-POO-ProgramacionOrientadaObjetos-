import java.util.ArrayList;

public class ListaArray {
    //Atributos
    private ArrayList <Personaje> listaPersonajes;

    //Constructor
    public ListaArray(){
        this.listaPersonajes = new ArrayList<>();
    }

    //Metodo
    public void agregarPersonajes(Personaje pj){
        listaPersonajes.add(pj);
    }
}