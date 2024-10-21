public class EmpleadoPorHora extends Empleado implements BonusCalculable{ //Hasta que no declare el implements, me aparecera error en la clase
    //Atributos
    private int horasTrabajadas;
    private double pagoPorHora;

    //Constructor
    public EmpleadoPorHora (String idEmpleado, String nombre, int horasTrabajadas, double pagoPorHora){
        super(idEmpleado, nombre, pagoPorHora * horasTrabajadas);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

        //Calculamos las horas trabajadas por el pago por hora mas el bono
    @Override
    public double calcularSalario(){
        return horasTrabajadas * pagoPorHora + calcularBonus();
    }

    // ?
    public double calcularBonus(){ //al especificar ? llamo un if else = true : false
        //Si el trabajador tiene mas de 40 horas tiene bono sino no hay bono
        return horasTrabajadas > 40 ? pagoPorHora * 0.5 : 0;
    }

}
