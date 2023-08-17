public class Estudiante extends Persona implements Estadistica {
    private int notas;
    private String carnet;


    public Estudiante(String nombre, int edad, String genero,int notas,String carnet ){
        super(nombre,edad,genero);
        this.carnet= carnet;
        this.notas= notas;
    }


    @Override
    public void calcularPromedio() {

    }

    @Override
    public void calcularMaximo() {

    }

    @Override
    public void calcularMinimo() {

    }
}
