public class Main {
    public static void main(String[] args) {
        // Crear objetos de tipo Profesor
        Profesor profesor1 = new Profesor("Juan Pérez", 35, "Masculino", "Licenciado en Educación");
        profesor1.agregarMateria("Matemáticas");

        // Crear objetos de tipo Estudiante
        double[] notasEstudiante1 = {90.5, 85.2, 78.9, 92.0};
        Estudiante estudiante1 = new Estudiante("Ana García", 20, "Femenino", "2023001", notasEstudiante1);

        // Crear objetos de tipo CursoPresencial
        CursoPresencial cursoPresencial1 = new CursoPresencial("Álgebra Lineal", profesor1, "Lunes y Miércoles, 8:00 AM - 10:00 AM");
        cursoPresencial1.inscribirEstudiante(estudiante1);

        // Crear objetos de tipo CursoVirtual
        CursoVirtual cursoVirtual1 = new CursoVirtual("Introducción a la Programación", profesor1, "Plataforma Aula Virtual");
        cursoVirtual1.inscribirEstudiante(estudiante1);

        // Crear objeto de tipo Universidad
        Universidad universidad = new Universidad();
        universidad.agregarCurso(cursoPresencial1);
        universidad.agregarCurso(cursoVirtual1);

        // Mostrar información completa de la universidad
        universidad.mostrarInformacionCompleta();

        // Calcular y mostrar el promedio de asistencia para los cursos presenciales
        double promedioAsistencia = cursoPresencial1.calcularAsistenciaPromedio();
        System.out.println("Promedio de asistencia en el curso presencial: " + promedioAsistencia);

        // Calcular y mostrar el promedio de participación para los cursos virtuales
        double promedioParticipacion = cursoVirtual1.calcularParticipacionPromedio();
        System.out.println("Promedio");
    }
}