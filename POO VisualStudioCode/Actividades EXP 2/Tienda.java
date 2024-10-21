import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    //Atributos ArrayList y segundo de tipo Scanner
    private ArrayList<Producto> productos;

    //declaramos scanner como atributo, para no llamarla siempre que la necesitemos
    private Scanner scanner;

    //Constructor que inicializa la lista y scanner
    public Tienda(){
        productos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    //Metodos
    //Agregar producto
    public void agregarProducto(){
        System.out.println("Porfavor ingrese el ID del producto");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Porfavor ingrese el nombre del producto");
        String nombre = scanner.nextLine();

        System.out.println("Porfavor ingrese el precio del producto");
        double precio = scanner.nextDouble();   

        //Creamos producto y agregarlo a la lista
        Producto producto= new Producto(id, nombre, precio);

        //Agregamos a la lista
        productos.add(producto);
        System.out.println("Producto agregado correctamente");

    }

    //listar productos
    public void mostrarProducto(){
        //validamos si es que hay productos o no en la lista
        if(productos.isEmpty()){
            System.out.println("No hay nada pues, agregue");
        }else{
            for(Producto producto : productos){
                System.out.println(producto);
            }
        }
    }

    //actualizar un producto por id
    public void actualizarProducto(){
        //metodo para actualizar, le pedimos al usuario inmediatamente al usuario desde aqui y desde el main
        System.out.println("Ingrese ID de producto a actualizar");
        int id = scanner.nextInt();
        scanner.nextLine();

        //Buscar producto por el ID
        for(Producto producto : productos){
            if(producto.getIdProducto()==id){
                System.out.println("Ingrese el nuevo nombre del producto");
                String nuevoNombre = scanner.nextLine();
                System.out.println("Ingrese nuevo precio del producto");
                double nuevoPrecio = scanner.nextDouble();

                //Actualizamos los datos
                producto.setNombreProducto(nuevoNombre);
                producto.setPrecioProducto(nuevoPrecio);
                System.out.println("Producto actualizado");
                return;
            }
        }
        System.out.println("Producto no encontrado");
    
    }

    //eliminar un producto por id
    public void eliminarProducto(){
        System.out.println("Ingrese ID de producto a eliminar");
        int id = scanner.nextInt();
        
        //Busco en la lista
        Producto productoEliminar = null;

        for(Producto producto : productos){
            if(producto.getIdProducto()==id){
                productoEliminar = producto;
            }
        }

        //Aqui recien eliminamos el producto
        if(productoEliminar != null){
            productos.remove(productoEliminar);
            System.out.println("Producto eliminado");
        }else{
            System.out.println("Producto no fue encontrado");
        }
    }


}
