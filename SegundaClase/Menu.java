package SegundaClase;

/*Crea un programa que:

Tenga un arreglo de enteros con valores predefinidos.

Muestre un menú con opciones (usando switch-case):

1.Mostrar todos los números

2.Mostrar solo pares

3.Mostrar solo impares

4.Calcular la suma total

5.Salir

Ejecute la acción correspondiente según la opción que el usuario elija. */

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Definir nuestro arreglo
        int[] numeros = {2, 1, 3, 4, 5, 6, 7, 8, 9, 10};
        int opcion = 0;

        do {
        System.out.println("Bienvenid@ al menu de opciones");
        System.out.println("1. Mostrar todos los numeros");
        System.out.println("2. Mostrar solo pares");
        System.out.println("3. Mostrar solo impares");
        System.out.println("4. Calcular la suma total");
        System.out.println("5. Salir del programa");
        System.out.println("Por favor, ingrese una opcion: ");

        opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Mostrando todos los numeros del arreglo:");
                    // Para cada num en el arreglo numeros
                    for (int num : numeros){
                        System.out.println(num);
                    }
                    break;
                case 2:
                    System.out.println("Mostrando solo los numeros pares:");
                    for (int num : numeros){
                        if (num % 2 == 0){
                            System.out.println(num);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Mostrando solo los numeros impares:");
                    for (int num : numeros){
                        if (num % 2 != 0){
                            System.out.println(num);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Calculando la suma total:");
                    int suma = 0;
                    for (int num : numeros){
                        suma += num;
                    }
                    System.out.println("La suma total es: " + suma);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion!=5);
    }
    
}
