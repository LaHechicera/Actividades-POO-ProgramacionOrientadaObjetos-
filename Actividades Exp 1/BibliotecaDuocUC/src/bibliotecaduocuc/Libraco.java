
package bibliotecaduocuc;

public class Libraco {
    //Atributos
    private String titulo;
    private String autor;
    
    //Constructor

    public Libraco(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    //Get y Set

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    //Metodo para mostrar datos
    public void mostrarInformacion(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
