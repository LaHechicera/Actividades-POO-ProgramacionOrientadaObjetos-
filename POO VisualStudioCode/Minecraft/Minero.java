public class Minero extends  Jugador implements AccionBonus {
    //Implementar el metodo del padre y el contrato de la interface = otro metodo abstracto

    //Atributos
    private int bloquesMinados;

    //Constructor 
    public Minero(String nombre, int salud, int bloquesMinados){
        super(nombre, salud);
        this.bloquesMinados = bloquesMinados;
    }

    //Declarar el metodo abstracto de la clase padre o clase base
    @Override
    public int calcularPuntos(){
        return bloquesMinados *10 + calcularBonus();
    }

    //Crear metodo abstracto de la interface accion bonus
    @Override //Para poder sobreescribir el metodo, para que no imprima caracteres raros. Ej en vez de 100 daria 107bn25
    public int calcularBonus(){
        //Al crear ? creamos un tipo de if else. 
        //Si bloques Minados es mayor a 100 le doy 100 puntos sino le doy 0
        return bloquesMinados > 100 ? 100 : 0;
    }
}
