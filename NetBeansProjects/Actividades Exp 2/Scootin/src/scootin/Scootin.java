
package scootin;

public class Scootin {

    public static void main(String[] args) {
        //Creamos objetos
        Puesto puestoVendedor = new Puesto("V001","Vendedor");
        Puesto puestoGerente = new Puesto("G001","Gerente");
        
        //Agregamos datos de tipo empleado
        Empleado empleado1 = new Empleado("19.368.775-K","Campo",2,29,puestoVendedor);
        Empleado empleado2 = new Empleado("10.587.369-8","Endy",10,49,puestoGerente);
        
        //Creamos una nstancia de Empresa
        Empresa empresa = new Empresa();
        
        //Agregar los empleados a la empresa
        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);
        
        //Mostrar a los empleados agregados
        System.out.println("Lista de empleados");
        empresa.listarEmpleados();
        
        //eliminar empleado
        System.out.println("Empleado Endy fue despedido");
        empresa.eliminarEmpleado("10.587.369-8");
        
        //Mostrar a los empleados actualizada
        System.out.println("\nLista de empleados actualizada");
        empresa.listarEmpleados();
    }
    
}
