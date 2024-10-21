//Implementamos todos los atributos y metods de la clase abstracta
//Para decir que esta clase es hija de la clase abstracta Empleado se pone "extends"
//"implements" esta clase EmpleadoAsalareado se compromete a utilizar interfaz = BonusCalculable
public class EmpleadoAsalareado extends Empleado implements BonusCalculable{
    
    //Metodo
    public EmpleadoAsalareado(String idEmpleado, String nombre, double suelddoBase){
        //Llamamos a super para heredar los atributos de la clase
        super(idEmpleado, nombre, suelddoBase);
    }

    //Implementamos un metodo abstracto para calcular salario
public double calcularSalario(){
    return sueldoBase + calcularBonus();
}

//Creamos metodo de calcular bono del empleado contratado
public double calcularBonus(){
    return sueldoBase *0.1;
}

}
