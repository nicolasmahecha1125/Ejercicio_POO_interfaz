public class CursoVirtual extends Curso implements Gestionable {
    private  String Plataforma;
  public CursoVirtual(String nombreCurso, Profesor profesor, String plataforma){
      super(nombreCurso, profesor);
      this.Plataforma = plataforma;
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
        estudiantes.add(estudiante);
        return true;
    }

    @Override
    public boolean retirarEstudianta(Estudiante estudiante) {
       if(estudiantes.contains(estudiante)){
           estudiantes.remove(estudiante);
           return  true;
       }
       return false;
    }
}
