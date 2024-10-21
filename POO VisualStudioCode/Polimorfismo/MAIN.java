public class MAIN {
    public static void main(String[] args) {
        //Sentido al Polimorfismo
        Empleado empleado1 = new EmpleadoAsalareado("19.368.779-1", "Campo Sama", 5000000.0);
        Empleado empleado2 = new EmpleadoPorHora("16.236.663-K", "Endy", 45, 1000);
        
        //Creamos un departamento
        Departamento depto1 = new Departamento("d001", "Departamento Finanzas");

        //Agregamos a departamento
        depto1.agregarEmpleado(empleado1);
        depto1.agregarEmpleado(empleado2);

        empleado1.mostrarInfo();
        System.out.println("Salario: " + empleado1.calcularSalario());

        empleado2.mostrarInfo();
        System.out.println("Salario: " + empleado2.calcularSalario());

        System.out.println("Costo total de los salarios del departamento Finanzas: " + depto1.CalcularCostoTotalSalario());

    }
}
