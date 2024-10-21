
package scootin;

public class Puesto {
    //Atributos
    private String codigo, nombrePuesto;
    
    //Constructor default vacio
    public Puesto() {
    }
    
    //Constructir con argumentos

    public Puesto(String codigo, String nombrePuesto) {
        this.codigo = codigo;
        this.nombrePuesto = nombrePuesto;
    }
    
    //Creamos Getter y Setter
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombrePuesto() {
        return nombrePuesto;
    }
    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }
    
    //toString para acceder a los datos de la clase
    @Override
    public String toString() {
        return "Puesto{" + "codigo=" + codigo + ", nombrePuesto=" + nombrePuesto + '}';
    }
    
    }
    
    
