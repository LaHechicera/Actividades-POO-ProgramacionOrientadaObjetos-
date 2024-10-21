public class Cazador extends Jugador implements AccionBonus {
    //Atributo
    private int enemigosCazados;

    //constructor
    public Cazador(String nombre, int salud, int enemigosCazados){
        super(nombre, salud);
        this.enemigosCazados = enemigosCazados;
    }

    //Implementar el metodo abstracto del padre
    @Override
    public int calcularPuntos(){
        return enemigosCazados * 20 + calcularBonus();
    }

    //Metodo interface
    @Override
    public int calcularBonus(){
        return enemigosCazados > 10 ? 50 : 0;
    }
}
