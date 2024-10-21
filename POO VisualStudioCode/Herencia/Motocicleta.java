public class Motocicleta extends Vehiculo {
    //Atributos especificos de la clase, recordando siempre que tiene los atributos de la superClase
    //Maletera Alforja
    private boolean tieneMaletero;

    //Constructor
    /*private String idVehiculo;
    private String marcaVehiculo;
    private double precioReparacion;*/
    public Motocicleta(String idVehiculo, String marcaVehiculo, double precioReparacion, boolean tieneMaletero){
        super(idVehiculo, marcaVehiculo, precioReparacion);
        this.tieneMaletero = tieneMaletero;
    }
    //Sobreescribir metodo 
    @Override
    public void mostrarInfo(){
        //super.mostrarInfo(); para poder heredar los sout del metodo mostrarinfo de la superClase Vehiculo
        super.mostrarInfo();
        System.out.println("Tiene maletero: " + (tieneMaletero ? "Si tiene maletero" : "No tiene maletero"));
    }

}
