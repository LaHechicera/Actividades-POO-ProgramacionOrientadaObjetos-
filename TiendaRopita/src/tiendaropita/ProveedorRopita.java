
package tiendaropita;

public class ProveedorRopita {
    
    //Atributos
    private String codigoProveedor;
    private String nombre;
    private String prendasSuministradas;
    
    //Constructor

    public ProveedorRopita(String codigoProveedor, String nombre) {
        this.codigoProveedor = codigoProveedor;
        this.nombre = nombre;
        this.prendasSuministradas = "";
    }
    //metodo
    //suministro de prenda por el proveedor
    public void suministrarPrenda(PrendaDeVestir prenda){
        prendasSuministradas = prenda.getInfo(); //guarda info de la prenda
        
        System.out.println(nombre + " ha sumnistrado: " + prendasSuministradas);
    }
    public String getInfo(){
        return "Codigo proveedor: " + codigoProveedor + ", Nombre proveedor: " + nombre + ", Prendas suministradas: " + prendasSuministradas;
    }
}