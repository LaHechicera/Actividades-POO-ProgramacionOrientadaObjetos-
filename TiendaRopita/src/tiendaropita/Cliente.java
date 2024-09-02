
package tiendaropita;


public class Cliente {
    // Atributos Cliente
    private String numeroCliente; //id cliente
    private String nombre;
    private String prendasAdquiridas; //prendas adquiridas por el cliente
    
    //Constructor Cliente

    public Cliente( String numeroCliente, String nombre) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.prendasAdquiridas = " "; //vacio por que el cliente aun no compra prendas
    }
    
    //Metodos Cliente
    //Realizar compra, Aqui estamos llamando a otro objeto
    public void realizarCompra(PrendaDeVestir prenda) {
        prenda.venta (); //se llama al metodo vende de PDV para que la prenda quede en estado disponible 
        prendasAdquiridas = prenda.getInfo(); //guardamos la informacion de prendas adquiridas
        System.out.println(nombre + " ha comprado " + prendasAdquiridas);
    }
    
    //Devolver prenda
    public void devolverPrenda(PrendaDeVestir prenda) {
        if (!prendasAdquiridas.isEmpty()){ //aqui llama si no esta vacio ya que el signo de exclamacion niega
            prenda.reponerInventario();//llama al metodo reponerInventario para marcar la prenda como disponible
            System.out.println(nombre + " ha devuelto " + prendasAdquiridas);
            prendasAdquiridas = " ";//reseteamos la prenda o la lista del cliente luego de su devolucion
        }else{
            System.out.println(nombre + " no tiene prendas para devolver, compre algo gracias :3");
        }
    }
    public String getInfo() {
        return "Numero cliente: " + numeroCliente + ", Nombre cliente: " + nombre + ", Prendas adquiridas: " + prendasAdquiridas;
    }
}    
