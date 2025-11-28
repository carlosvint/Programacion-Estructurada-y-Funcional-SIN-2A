package SegundaClase;

import java.util.Scanner;

public class EjemploDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Decir Hola");
            System.out.println("2. Decir Adiós");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Hola");
                    break;
            
                case 2:
                    System.out.println("Adios");
                    break;

                case 3:
                    System.out.println("Salir del programa");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion !=3);

        sc.close();
    }
}
