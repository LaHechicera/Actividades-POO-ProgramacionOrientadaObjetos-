
package gestordeproductos;


public class Producto {
    //Atributos -> codigo, nombre y disponible
    private String codigo;
    private String nombre;
    private Boolean disponible;

    //Constructor
    public Producto(String codigo, String nombre, Boolean disponible) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.disponible = disponible;
    }
    
    //Metodos
    public String getInfo(){
        return "Codigo del producto: " + codigo + " Nombre del producto: " + nombre + " Disponible: " + (disponible ? " Producto se encuentra disponible " : " Producto no disponible ");
    }
    
    public Boolean isDisponible (){
        return disponible;
    }
}
