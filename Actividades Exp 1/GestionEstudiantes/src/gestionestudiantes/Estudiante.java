
package gestionestudiantes;

public class Estudiante {
    //Atributitos
    private String matricula;
    private String nombre;
    private double notaFinal;
    
    //Bob Constructor

    public Estudiante(String matricula, String nombre, double notaFinal) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.notaFinal = notaFinal;
    }
    
    //Metodos
    public String getInfo(){
        return "Matricula de estudiantes: " + matricula + " Nombre estudiante: " + nombre + " Nota final: " + notaFinal;
    } 
    
    public double isnotaFinal() { //double es decimal
        return notaFinal;
}      
}

