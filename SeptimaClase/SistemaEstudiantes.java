package SeptimaClase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class LineaInvalidaException extends Exception {
    public LineaInvalidaException(String msg){
        super(msg);
    }
}


class Estudiante {
    private String nombre;
    private int edad;
    private double nota;

    public Estudiante (String nombre, int edad, double nota){
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    @Override
    public String toString(){
        return nombre + " " + edad + " años - Nota: " + nota;
    } 

    public double getNota(){
        return nota;
    }
}


public class SistemaEstudiantes {

    public static void main(String[] args) {
        String archivoEntrada = "estudiantes.txt";

        List<Estudiante> estudiantes = new ArrayList<>();
        int lineasInvalidas = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(archivoEntrada))){
            String linea;
            int numeroLinea = 1;

            while ((linea = br.readLine()) != null){
                try {
                    Estudiante est = procesarLinea(linea, numeroLinea);
                    estudiantes.add(est);
                    System.out.println(est.toString());
                } catch (LineaInvalidaException e){
                    System.out.println(e.getMessage());
                    lineasInvalidas++;
                }

                numeroLinea++;
            }

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Lineas Invalidas: " + lineasInvalidas);

    }

    public static Estudiante procesarLinea(String linea, int numeroLinea) throws LineaInvalidaException {
        String[] partes = linea.split(",");

        if (partes.length != 3){
            throw new LineaInvalidaException("Debe tener 3 campos separados por comas");
        }

        String nombre = partes[0].trim();
        String edadStr = partes[1].trim();
        String notaStr = partes[2].trim();

        int edad;
        double nota;

        try {
            edad = Integer.parseInt(edadStr);
        } catch (NumberFormatException e){
            throw new LineaInvalidaException("Edad invalida: " + edadStr);
        } 

        try {
            nota = Double.parseDouble(notaStr);
        } catch (NumberFormatException e){
            throw new LineaInvalidaException("Nota invalida: " + notaStr);
        }

        if (nota < 0 || nota >10){
            throw new LineaInvalidaException("Nota fuera de rango establecido." + nota);
        }

        return new Estudiante(nombre, edad, nota);

    }
}
