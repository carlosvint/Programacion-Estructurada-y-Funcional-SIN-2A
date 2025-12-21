package SeptimaClase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;



public class Main {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))){
            String linea;
            while ((linea = br.readLine()) != null){
                System.out.println(linea);
            }
        } catch (IOException e){
            System.out.println("No se puede leer el archivo." + e.getMessage());
        }

    }
}





// class EdadInvalidaException extends Exception {
//     public EdadInvalidaException(String message){
//         super(message);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         try {
//             verificarEdad(15);
//         } catch (EdadInvalidaException e){
//             System.out.println(e.getMessage());
//         }

//     }

//     public static void verificarEdad(int edad) throws EdadInvalidaException {
//         if (edad < 18) {
//             throw new EdadInvalidaException("La edad debe ser mayor a 18 años.");
//         }
//         System.out.println("Edad valida");
//     }
// }



// public class Main {
//     public static void main(String[] args) {
//         String[] numeros = {"Cero", "Uno"};
//         int a = 0;


//         for (int i=0; i<5; i++){
//             try {
//                 a += 50;
//                 System.out.println(numeros[i]);
//             }
//             catch (ArithmeticException e) {
//                 System.out.println("La division para 0 no esta determinada " + i + ". La excepcion es: " + e.getClass().getSimpleName());
//             }
//             catch (ArrayIndexOutOfBoundsException e){
//                 System.out.println("El arreglo no tiene la posicion " + i + ". La excepcion es: " + e.getClass().getSimpleName());
//             }
//             catch (Exception e){
//                 System.out.println("La excepcion es: " + e.getClass().getSimpleName());
//             }
//         }

//         System.out.println(a);
//     }
// }
