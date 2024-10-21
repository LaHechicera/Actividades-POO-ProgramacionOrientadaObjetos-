
package piczeria;

public class Piczeria {

    public static void main(String[] args) {
        System.out.println("Bienvenido a la Pizzeria Piczeria");
        
        //Aqui se crea el primer objeto de la clase pizza
        Pizza pizza1 = new Pizza(" pepperoni"," grande "," gruesa ");
        pizza1.setTamano(" Piedra delgada + borde extra queso ");
        pizza1.preparar();
        pizza1.calentar();
        
        //Aqui cree segundo objeto de la clase pizza
        Pizza pizza2 = new Pizza(" italiano "," mediano "," gruesa ");
        pizza2.preparar();
        pizza2.calentar();
    }
    
}
