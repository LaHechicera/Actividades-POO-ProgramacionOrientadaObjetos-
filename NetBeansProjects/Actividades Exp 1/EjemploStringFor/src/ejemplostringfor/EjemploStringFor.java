
package ejemplostringfor;

public class EjemploStringFor {

    public static void main(String[] args) {
       String[] lenguajes = {"Java","Python","C++","C#","HTML","SQL","C","JavaScript","Kotlin","PHP"};
       
       //Iterar sobre la lista creada
       //1. Definimos un indice y lo inicializamos con valos 0
       //2. Luego aplicamos una condicional
       //3. Escribo el paso a seguir, le decimos si es de 1 en 1 o de 2 en 2 etc.
       for (int i=0; i < lenguajes.length; i++){
           String lenguaje = lenguajes[0]; //Definimos una variable "lenguaje" donde se almacene la lista, asi para que me vaya dando de 1 en 1 los elementos
           
           //Obtener la longitud de cada lenguaje
           int longitud = lenguaje.length();
           
           //Ahora simplemente imprimimos el dato
           System.out.println("La longitud del lenguaje " + lenguaje + " es: " + longitud);
           
           //Vamos a obtener el primer caracter de cada lenguaje
           char primerCaracter = lenguaje.charAt(0); //char busca 1 caracter
           System.out.println("La primera letra del lenguaje " + lenguaje + " es: " + primerCaracter);
           
           //Convertir un lenguaje a mayuscula
           String lenguajeEnMayuscula = lenguaje.toUpperCase();
           System.out.println("El lenguaje " + lenguaje + " en mayuscula es: " + lenguajeEnMayuscula);
           
           //Convertir un lenguaje a mayuscula
           String lenguajeEnMinuscula = lenguaje.toLowerCase();
           System.out.println("El lenguaje " + lenguaje + " en minuscila es: " + lenguajeEnMinuscula);
           
           //Verificamos que una palabra comienza con una letra especifica
           if (lenguaje.startsWith("C")){
               System.out.println("El lenguaje "+lenguaje+" contiene la letra C al inicio");
           }else{
               System.out.println("El lenguaje "+lenguaje+" no contiene la letra C al inicio");
           }
           
            if (lenguaje.endsWith("n")){
               System.out.println("El lenguaje "+lenguaje+" contiene la letra n al final");
           }else{
               System.out.println("El lenguaje "+lenguaje+" no contiene la letra n al final");
           }
            
            //Crear una subcadena de cada lenguaje mayor a 3 caracteres
            //0123
            //Java
            //Jav
            if (longitud>3){
                String subCadena = lenguaje.substring(0,3); //Se detiene en el 3
                System.out.println("La subcadena del lenguaje " + lenguaje + " es " + subCadena);
            }
            
            //Vamos a reemplazar un caracter especifico por otro
            String caracterReemplazado = lenguaje.replace("a", "@");
            System.out.println("El lenguaje "+lenguaje+" con las letras reempplazadas es "+caracterReemplazado);
            
            //Comparar un lenguaje especifico sin importar mayusculas o minusculas
            if (lenguaje.equalsIgnoreCase("python")){
           System.out.println("El lenguaje python si esta en la lista, ignorando Case");
       }else{
               System.out.println("El lenguaje python si esta en la lista, ignorando Case");
               }
       
       //Remover los espacios en blanco de un lenguaje
       String espaciosEnBlanco = "        "+lenguaje;
       String sinEspacios = espaciosEnBlanco.trim();
           System.out.println("El lenguaje con espacios es "+espaciosEnBlanco);
           System.out.println("El lenguaje sin espacios es "+sinEspacios);
           System.out.println("----------------------------------------------------------------------");
                 
       }
}
}
