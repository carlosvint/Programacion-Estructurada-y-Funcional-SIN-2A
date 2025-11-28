package SegundaClase;

/*Pide un número entero y muestra su tabla de multiplicar del 1 al 10 usando un for. */

import java.util.Scanner;

public class TablasDeMultiplicar { 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, ingrese un numero entero: ");
        int numero = sc.nextInt();

        //Para cada entero i igual a 1, y menor o igual a 10, avanzamos de a uno
        for (int i = 0; i <= 10; i += 2){
            if (i == 0){
                continue;
            }
            //Vamos a multiplicar i por el numero
            int resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);
        }
    }
    
}
