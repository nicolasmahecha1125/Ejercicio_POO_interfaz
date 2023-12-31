public class CursoPresencial extends Curso implements Gestionable {
    private String horario;

    public CursoPresencial(String nombreCurso, Profesor profesor, String horario) {
        super(nombreCurso, profesor);
        this.horario = horario;
    }

    public double calcularAsistenciaPromedio() {
        double totalAsitencia = 0;
        for (Estudiante estudiante : estudiantes) {
            double asistenciaDelEstudiante = 0;
            totalAsitencia += asistenciaDelEstudiante;
        }
        return totalAsitencia / estudiantes.size();
    }

    @Override
    public boolean inscribirEstudiante(Estudiante estudiante) {
        if (estudiantes.size() < 20) {
            estudiantes.add(estudiante);
            return true;
        }
        return false;
    }

    @Override
    public boolean retirarEstudianta(Estudiante estudiante) {
        if (estudiantes.contains(estudiante)) {
            estudiantes.remove(estudiante);
            return true;
        }

        return false;
    }
}




