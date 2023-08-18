public class CursoLaboratorio extends Curso implements Gestionable{
    private String experimento;
    public CursoLaboratorio(String nombreCurso, Profesor profesor,String experimento){
        super(nombreCurso, profesor);
        this.experimento = experimento;
    }
    public double calcularAsistenciaPromedio() {
        double totalAsitencia = 0;
        for (Estudiante estudiante : estudiantes) {
            double asistenciaDelEstudiante = 0;
            totalAsitencia += asistenciaDelEstudiante;
        }
        return totalAsitencia / estudiantes.size();
    }
    public double calcularParticipacionPromedio(){
        double totalParticipacion = 0;
        for (Estudiante estudiante : estudiantes){
            double participacionDelEstudiante = 0;
            totalParticipacion += participacionDelEstudiante;
        }
        return  totalParticipacion / estudiantes.size();
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
