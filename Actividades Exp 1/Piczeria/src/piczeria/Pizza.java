
package piczeria;


public class Pizza {
    //Atributos
    private String nombre, tamano, masa;

    public Pizza(String nombre, String tamano, String masa) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.masa = masa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }
    

    //Metodos
    //alt + shift + f para didentar codigo
    public void preparar() {
        System.out.println("Preparando la Picza" + nombre);
    }
     public void calentar() {
        System.out.println("Horneando la Picza" + nombre + tamano + masa);
    }
}
