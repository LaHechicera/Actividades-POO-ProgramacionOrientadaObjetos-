public class Auto extends Vehiculo {
    //Aqui tiene los atributos de la clase padre (Vehiculo)
    //Atributos nuevos propios de la clase
    private int cantidadPuertas;
    private boolean tieneAireAcondicionado;

    //Constructor
    /*private String idVehiculo;
    private String marcaVehiculo;
    private double precioReparacion;*/
    public Auto(String idVehiculo, String marcaVehiculo, double precioReparacion, int cantidadPuertas, boolean tieneAireAcondicionado){
        //Super heredando los atributos de la superClase Vehiculo
        super(idVehiculo, marcaVehiculo, precioReparacion); //Le decimos que utiliza el constructor de clase padre vehiculo
        this.cantidadPuertas = cantidadPuertas;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }
    //Sobrescribir metodo de mostrarInfo()
    //@overrite nos sirve para sobreescribir un metodo, lo sobrescribimos para agregar mas detalles al metodo de informacion
    @Override
    public void mostrarInfo(){
        //Con super estoy agregando los sout o la informacion de "mostrarInfo" de la superClase Vehiculo
        super.mostrarInfo();
        System.out.println("Cantidad de puertas: "+cantidadPuertas);
        System.out.println("Tiene aire acondicionado: "+ (tieneAireAcondicionado ? "Si tiene aire acondicionado" : "No tiene aire acondicionado"));
    }
}
