public class Estudiante extends Persona implements Estadistica {
    private double[] notas;
    private String carnet;


    public Estudiante(String nombre, int edad, String genero,String carnet, double[] notas) {
        super(nombre, edad, genero);
        this.carnet = carnet;
        this.notas = notas;
    }


    @Override
    public double calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    @Override
    public double calcularMaximo() {
        double max = notas[0];
        for (double nota : notas) {
            if (nota > max) {
                max = nota;
            }
        }
        return max;

    }

    @Override
    public double calcularMinimo() {
        double min = notas[0];
        for (double nota : notas) {
            if (nota < min) {
                min = nota;
            }
        }
        return min;
    }
}