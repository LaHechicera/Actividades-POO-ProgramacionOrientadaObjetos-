public class Alumno {
    //Atributos
    private int idAlumno; 
    private String nombreAlumno;
    private int edadAlumno;
    private int membresiaAlumno;

    //Constructor
    public Alumno (int id, String nombre, int edad, int membresia){
        //referencias
        this.idAlumno = id;
        this.nombreAlumno = nombre;
        this.edadAlumno = edad;
        this.membresiaAlumno = membresia;
    }

   public int getIdAlumno() {
       return idAlumno;
   }
   public void setIdAlumno(int idAlumno) {
       this.idAlumno = idAlumno;
   }
   public String getNombreAlumno() {
       return nombreAlumno;
   }
   public void setNombreAlumno(String nombreAlumno) {
       this.nombreAlumno = nombreAlumno;
   }
   public int getEdadAlumno() {
       return edadAlumno;
   }
   public void setEdadAlumno(int edadAlumno) {
       this.edadAlumno = edadAlumno;
   }
   public int getMembresiaAlumno() {
       return membresiaAlumno;
   }
   public void setMembresiaAlumno(int membresiaAlumno) {
       this.membresiaAlumno = membresiaAlumno;
   }
   
   @Override
   public String toString() {
       return "ID Alumno: " + idAlumno + " Nombre Alumno: " + nombreAlumno + " Edad Alumno: " + edadAlumno + " Membresia Alumno: " + membresiaAlumno;
   }
}