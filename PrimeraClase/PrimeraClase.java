package PrimeraClase;
import java.util.Scanner;


public class PrimeraClase{
    public static void main(String[] args){
        // System.out.println("Hola Mundo");
        // int resultado = sumar(10, 10);
        // System.out.println("El resultado de la suma es: " + resultado);
        // double producto = multiplicar(10.5, 9.5);
        // System.out.println("El resultado de la multiplicacion es: " + producto);
        // System.out.println(darBienvenida("Carlos"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println(darBienvenida(nombre));

        sc.close();
    } 
    
    public static int sumar(int a, int b){
        return a + b;
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static String darBienvenida(String nombre){
        return "Bienvenid@ " + nombre + " a la clase de programacion en Java";
    }

}