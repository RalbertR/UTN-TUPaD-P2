package tp_n4_robino;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado e1 = new Empleado(0, "Raul Robino", "Programador", 3200000);
        Empleado e2 = new Empleado("German Gomez", "Analista");
        Empleado e3 = new Empleado("Victoria Manzano", "Programador");
        
        e1.actualizarSalario(13.0); 
        e2.actualizarSalario(45000);
        e3.actualizarSalario(5.0);
        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        
        Empleado.mostrarTotalEmpleados();
    }
}
