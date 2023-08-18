public class CursoTaller extends Curso implements Gestionable {
    private String actividad;
    public CursoTaller(String nombreCurso, Profesor profesor, String actividad ){
        super(nombreCurso,profesor);
        this.actividad = actividad;
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
