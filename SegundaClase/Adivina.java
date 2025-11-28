package SegundaClase;

/* Pide al usuario que adivine un número secreto. Tiene 3 intentos, si adivina imprimimos "Ganaste" caso contrario se imprime Perdite */


/*1. Importar el scanner.
 * 2. Establecer el numero secreto. 2 maneras: a) Quemando en el codigo el numero secreto. b) Utilizando una libreria que genere numeros randomicos.
 * 3. Tomar la adivinanza del usuario.
 * 4. Vamos a evaluar si el numero adivinado es igual al numero secreto.
 * 5. Vamos a imprimir el resultado de la evaluacion.
 */

import java.util.Scanner;

public class Adivina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intentos = 3;
        int numeroSecreto = 7;

        // Mientras una condicion sea verdadera el codigo se va a ejecutar.
        while (intentos > 0){
            System.out.println("Ingrese un numero del 1 al 10!");
            int guess = sc.nextInt();

            if (guess == numeroSecreto){
                System.out.println("Ganaste");
                break;
            } else if (intentos > 1){
                intentos--;
                System.out.println("Te equivocaste. Te quedan " + intentos + " intentos");
            } else {
                intentos--;
                System.out.println("Perdiste. Ya no te quedan intentos");
            }
        }



    }
}
