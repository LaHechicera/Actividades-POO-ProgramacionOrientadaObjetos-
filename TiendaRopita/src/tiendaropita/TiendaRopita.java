
/* MAIN PRINCIPAL */

package tiendaropita;

public class TiendaRopita {

 
    public static void main(String[] args) {
        
        //Crear instancias de clases objetos
        //Objetos prendas
        PrendaDeVestir prenda1 = new PrendaDeVestir("484848", "Polera de algodon", "marca: chanchito", "¨poleras", true);
        PrendaDeVestir prenda2 = new PrendaDeVestir("848484", "Gorro", "marca: chanchito", "¨accesorios", true);

        //2Clientes
        Cliente cliente1 = new Cliente("cl01", "Campo Sama");
        Cliente cliente2 = new Cliente("cl02", "Kida Sama");
        
        //Proveedor de moda
        ProveedorRopita proveedor1 = new ProveedorRopita("Pr0101", "Nike");
        ProveedorRopita proveedor2 = new ProveedorRopita("Pr0202", "Adiddas");
        
        //Crear un objeto en SisGestInventario
        SistemaGestionInventario sistema = new SistemaGestionInventario();
        
        //Registramos las prendas
        sistema.registrarPrenda(prenda1);
        sistema.registrarPrenda(prenda2);
        
        //Registro clientes
        sistema.clientesRegistrados(cliente1);
        sistema.clientesRegistrados(cliente2);
        
        //Registro proveedor
        sistema.registrarProveedor(proveedor1);
        sistema.registrarProveedor(proveedor2);
        
        //Realizar compra
        cliente1.realizarCompra(prenda1);
        
        //Realizar devolucion
        cliente1.devolverPrenda(prenda1);
        
        //Proveedor suministra prenda
        proveedor1.suministrarPrenda(prenda1);
        
        //Verificar disponibilidad de prenda
        sistema.verificarDisponibilidad(prenda1);
        
        //generar informe
        sistema.generarInformeVentas();
    }
    
}
