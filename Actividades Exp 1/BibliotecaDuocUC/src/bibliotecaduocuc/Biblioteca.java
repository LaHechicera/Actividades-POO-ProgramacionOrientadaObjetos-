/*
Bibliotequita
 */
package bibliotecaduocuc;

public class Biblioteca {
    //Atributos
    //libro: es el tipo de dato de mi atributo //objeto se crea //Referencia a la clase vecina
    //Libraco: instancia de la clase Libraco = objeto
    private Libraco libro;
    
    //Metodo crear objeto llamado libro en la biblioteca
    public void agregarLibro(String titulo, String autor){
        libro = new Libraco(titulo,autor); //Creamos un nuevo objeto llamado libro
    }
    
    //Metodo para mostrar la informacion del libro en colaboracion con la Clase vecina "Libraco".
    public void mostrarLibro(){
        if (libro != null){ //Si el libro no esta vacio ejecuta el codigo dentro de las llaves, muestra la informacion -> clase vecina mostrarInformacion()
            libro.mostrarInformacion(); //Hacemos referencia al objeto "libro" y llamamos al metodo de la Clase libro
        }else{
            System.out.println("No hay libros actualmente en la biblioteca");
        }
    }
    //Metodo para verificar si el titulo del libro contiene una palabra especifica
    public void buscarPalabraTitulo(String palabra){
        //Primero validamos si hay un libro
        //Segundo validamos si el titulo del libro contiene una palabra especifica
        //Contains evalua una coincidencia dentro de un string
        if (libro != null && libro.getTitulo().contains(palabra)){//contains evalua si existe una coincidencia en el String que introduzca el usuario
            System.out.println("El titulo del libro si contiene la palabra: " + palabra);
        }else{
            System.out.println("El titulo del libro no contiene la palabra: " + palabra);
        }
    }
}
