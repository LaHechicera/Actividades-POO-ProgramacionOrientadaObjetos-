/*
PrendaDeVestir
 */
package tiendaropita;


public class PrendaDeVestir {
    //Atributos
        private String codigo;
        private String nombre;
        private String categoria;
        private String marca;
        private Boolean disponibilidad;
        
        //Constructor

    public PrendaDeVestir(String codigo, String nombre, String categoria, String marca, Boolean disponibilidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.marca = marca;
        this.disponibilidad = disponibilidad;
    }
        
        //Metodos
         //Registrar la venta de una prenda
        public void venta() {
                  if (disponibilidad) {
                          disponibilidad=false;
                           System.out.println("Prenda vendida:  " + nombre);
                  }else{
                        System.out.println("La prenda no esta disponible para la venta: " + nombre);
                  }
         }

//Metodo para reponer una prenda
        public void reponerInventario() {
                if (disponibilidad==false) {
                    disponibilidad=true;
                    System.out.println("La prenda fue repuesta: " + nombre);
                 
                }else{
                    System.out.println("La prenda esta disponible " + nombre);
                }
        }
        
        //Metodo para obtener todos los datos de la prenda
        public String getInfo() {
            return "Codigo: " + codigo + ", Nombre: " + nombre + ", Categoria: " + categoria + ", Marca: " + marca + ", Disponibilidad: " + (disponibilidad ? "Si esta disponible" : "No esta disponible");
        }
}