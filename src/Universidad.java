import java.util.ArrayList;

public class Universidad {
    private ArrayList<Curso> cursos;
    public Universidad() {
        this.cursos = new ArrayList<>();
    }
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }
    public void mostrarInformacionCompleta() {
        for (Curso curso : cursos) {
            System.out.println("Curso: " + curso.nombreCurso);
            System.out.println("Profesor: " + curso.profesor.nombre);
            System.out.println("Estudiantes inscritos: " + curso.estudiantes.size());
            System.out.println();
        }
    }

}
