import java.util.ArrayList;

public abstract class Curso {
    protected String nombreCurso;
    protected Profesor profesor;
    protected ArrayList<Estudiante> estudiantes;

    public Curso(String nombreCurso, Profesor profesor){
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
    }
    public  void  agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

}

