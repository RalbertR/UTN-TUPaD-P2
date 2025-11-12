
package Ejercicio3;

public class Main {
    public static void main(String[] args) {

        Universidad uni = new Universidad("UTN");

        System.out.println("1 y 2. CREAR Y AGREGAR PROFESORES Y CURSOS");
        Profesor p1 = new Profesor("P001", "Ana Gomez", "Inteligencia Artificial");
        Profesor p2 = new Profesor("P002", "Luis Martin", "Bases de Datos");
        Profesor p3 = new Profesor("P003", "Maria Sol", "Desarrollo Web");

        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        Curso c1 = new Curso("C101", "Programacion I");
        Curso c2 = new Curso("C102", "Base de Datos I");
        Curso c3 = new Curso("C103", "Frontend con React");
        Curso c4 = new Curso("C104", "Machine Learning");
        Curso c5 = new Curso("C105", "Backend con Python");

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        System.out.println("\n3. ASIGNAR PROFESORES A CURSOS");
        uni.asignarProfesorACurso("C101", "P001");
        uni.asignarProfesorACurso("C102", "P002");
        uni.asignarProfesorACurso("C103", "P003");
        uni.asignarProfesorACurso("C104", "P001");
        uni.asignarProfesorACurso("C105", "P003");

        System.out.println("\n4. LISTAR CURSOS Y PROFESORES");
        System.out.println("Listado de Cursos:");
        uni.listarCursos();
        System.out.println("\nListado de Profesores:");
        uni.listarProfesores();

        System.out.println("\n5. CAMBIAR PROFESOR DE UN CURSO (C105 a P002)");
        System.out.println("Asignando C105 a Luis Martin (P002)..");
        uni.asignarProfesorACurso("C105", "P002");
        
        System.out.println("\nVerificacion de Sincronizacion");
        System.out.println("Revisando Profesor P003 (Maria Sol)..");
        Profesor p3_check = uni.buscarProfesorPorId("P003");
        p3_check.listarCursos();

        System.out.println("\nRevisando Profesor P002..");
        Profesor p2_check = uni.buscarProfesorPorId("P002");
        p2_check.listarCursos();

        System.out.println("\n6. REMOVER UN CURSO (C103)");
        uni.eliminarCurso("C103");
        
        System.out.println("\nVerificacion de Eliminacion");
        System.out.println("Revisando Profesor P003 (Maria Sol)..");
        p3_check.listarCursos();
        System.out.println("\nRevisando lista general de cursos..");
        uni.listarCursos();

        System.out.println("\n7. REMOVER UN PROFESOR (P01)");
        System.out.println("Eliminando a Ana Gomez (P001)..");
        uni.eliminarProfesor("P001");

        System.out.println("\nVerificacion de Eliminacion de Profesor");
        System.out.println("Revisando cursos C101 y C104..");
        uni.listarCursos();

        System.out.println("\n8. REPORTE: CURSOS POR PROFESOR");
        for (Profesor p : uni.getProfesores()) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " cursos.");
        }
    }
}