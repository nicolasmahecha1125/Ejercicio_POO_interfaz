import java.util.ArrayList;
public class Profesor extends Persona implements Estadistica{
    private String titulo;
    private ArrayList<String> materias;
    public Profesor(String nombre, int edad, String genero, String titulo,ArrayList<String> materias) {
        super(nombre, edad, genero);
        this.titulo = titulo;
        this.materias = new ArrayList<>();

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
