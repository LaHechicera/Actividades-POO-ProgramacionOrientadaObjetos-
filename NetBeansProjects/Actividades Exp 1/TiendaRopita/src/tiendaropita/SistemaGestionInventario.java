package tiendaropita;

public class SistemaGestionInventario {
    
    //Attributos
    private String catalogoPrendas;
    private String clientesRegistrados;
    private String proveedoresActivos;
    
    //Constructor, en esta clase no se realiza constructor por que tenemos metodos que buscaran informacion a otras clases

    public void registrarPrenda (PrendaDeVestir prenda) {
        catalogoPrendas = prenda.getInfo(); //almaceno info del catalogo
        System.out.println("Prenda registrada: " + catalogoPrendas);
    }
    
    public void clientesRegistrados (Cliente cliente) {
        clientesRegistrados = "Cliente: " + cliente.getInfo(); 
        System.out.println("Cliente registrado  " + clientesRegistrados);
    }
    
    public void registrarProveedor (ProveedorRopita proveedor) {
        proveedoresActivos = "Proveedor " + proveedor.getInfo(); //guardamos la info del proveedor
        System.out.println("Proveedor registrado" + proveedoresActivos);
    }
    
    //Metodo para verificar la disponibilidad de una prenda
    public void verificarDisponibilidad(PrendaDeVestir prenda){
        System.out.println("Verificando disponibilidad de: " + prenda.getInfo());
    }
    
    //Metodo para generar reporte de venta
    public void generarInformeVentas (){
        System.out.println("Generando informe de ventas");
        //Aqui va la logica para crear un informe como tal...
    }
    
    public String getInfo () {
        return "Catalogo de prendas: " + catalogoPrendas + ", Clientes registrados: " + clientesRegistrados + ", Proveedores activos: " + proveedoresActivos;
    }
}
