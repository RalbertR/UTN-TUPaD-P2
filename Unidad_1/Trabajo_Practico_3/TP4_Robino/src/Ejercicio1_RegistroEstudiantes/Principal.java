package Ejercicio1_RegistroEstudiantes;

public class Principal {
    public static void main(String[] args){
        Estudiante estudiante1 = new Estudiante("Raul", "Robino", "Programacion II", 5);
        
        System.out.println("Infomarcion del estudiante: ");
        estudiante1.mostrarInfo();
        
        estudiante1.subirCalificacion(3);
        estudiante1.bajarCalificacion(6);
        
    }
}
