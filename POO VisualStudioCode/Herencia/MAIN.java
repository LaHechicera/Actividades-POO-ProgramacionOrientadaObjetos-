public class MAIN {
    public static void main(String[] args) {
        //Crear instancia de vehiculo, motociclea y cliente
        Auto auto1 = new Auto("FKJG8", "Nissan", 250000.00, 3, true);
        Motocicleta moto1 = new Motocicleta("JKLM77", "Duccati", 1000000.00, false);
        Cliente cliente1 = new Cliente("01", "Camila");

        //Creamos instancia de reparacion y agregarla a vehiculo
        Reparacion reparacion = new Reparacion();
        //Agregar reparaciones a Vehiculo
        reparacion.agregarVehiculo(moto1);
        reparacion.agregarVehiculo(auto1);

        //Agregamos reparaciones a cliente
        cliente1.agregarReparacion(reparacion);

        //Mostramos informacion del cliente y sus reparaciones
        cliente1.mostrarReparaciones();
    }
}
