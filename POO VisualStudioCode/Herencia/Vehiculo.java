public class Vehiculo {
    //Atributos -> id, marca, precio (mantenimiento)
    private String idVehiculo;
    private String marcaVehiculo;
    private double precioReparacion;

    //Constructor
    public Vehiculo(String id, String marca, double precio){
        this.idVehiculo =  id;
        this.marcaVehiculo = marca;
        this.precioReparacion = precio;
    }
    
    //Metodo para mostrar la informacion
    public void mostrarInfo(){
        System.out.println("ID Vehiculo: " + idVehiculo);
        System.out.println("Marca Vehiculo: " + marcaVehiculo);
        System.out.println("Precio reparacion: " + precioReparacion);
    }

    //Metodo para calcular costo de reparacion
    public double calcularDescuento(double descuento){
        return precioReparacion - (precioReparacion * descuento);
    }
}