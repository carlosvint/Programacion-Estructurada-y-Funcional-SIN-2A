package SegundaClase;

/*Crea un programa que calcule el área y perímetro de un círculo.

Pide al usuario el radio (usa Scanner).

Convierte el radio de String a double.

Usa expresiones matemáticas y muestra los resultados con dos decimales. */

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        // Inicializar el scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        // Tomar la respuesta del usuario
        String input = sc.nextLine();
        // double radio = sc.nextDouble(); //Forma de tomar un double desde el scanner.
        // int radio = sc.nextInt(); // Forma de tomar un entero desde el scanner.
        System.out.println("El valor de la variable input es: " + input);

        //Transformar de String a Double
        double radio = Double.parseDouble(input);
        System.out.println("El valor de la variable radio es: " + radio);

        //Realizar las operaciones matematicas
        double perimetro = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);

        //Mostrar el perimetro y el area
        System.out.println("El perimetro del circulo con radio " + radio + " es: " + String.format("%.2f", perimetro));
        System.out.printf("El area del circulo es: %.2f%n", area);
        
    }
    
}
