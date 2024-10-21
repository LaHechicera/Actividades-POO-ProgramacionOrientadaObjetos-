public class Producto {
    //Atributos
    private int idProducto;
    private String nombreProducto;
    private double precioProducto;

    //Constructor
    public Producto (int id, String nombre, double precio){
        //referenccias
        this.idProducto = id;
        this.nombreProducto = nombre;
        this.precioProducto = precio;

    }

    //Getter y Setter
    public int getIdProducto() { //Para hacer get solo apretar "g" y enter
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    @Override
    public String toString() {
        return "ID producto " + idProducto +" Nombre producto " + nombreProducto + " Precio producto: " + precioProducto;
    }
    
}