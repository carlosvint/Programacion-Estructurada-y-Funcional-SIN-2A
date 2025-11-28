package SegundaClase;

/*Pide al usuario su edad y di si es menor, adulto o adulto mayor. 
    * Menor: 0-17
    * Adulto: 18-64
    * Adulto mayor: 65 o más
*/

import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        // Inicializar el scanner
        Scanner sc = new Scanner(System.in);
        // Imprimir el mensaje para el usuario
        System.out.println("Ingrese su edad por favor.");
        // Recoger el input del usuario
        int edad = sc.nextInt();

        //Si la edad es menor a 18 años entonces imprime eres menor de edad.
        // else significa caso contrario
        // if (edad < 18){
        //     System.out.println("Eres menor de edad.");
        // } else if (edad < 65){
        //     System.out.println("Eres un adulto.");
        // } else {
        //     System.out.println("Eres un adulto mayor.");
        // }

        if (edad >= 18 && edad < 65){
            System.out.println("Eres un adulto.");
        } else if (edad < 18) {
            System.out.println("Eres menor de edad.");
        } else {
            System.out.println("Eres un adulto mayor.");
        }
    }
}