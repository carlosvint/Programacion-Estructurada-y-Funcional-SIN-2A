package OctavaClase;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        cola.add("Primer");
        cola.add("Segundo");
        cola.add("Tercer");

        System.out.println("Elemento al frente: " + cola.peek());

        while (!cola.isEmpty()){
            System.out.println("Elemento retirado: " + cola.poll());
        }
    }
}

// public class Main {
//     public static void main(String[] args) {
//         Stack<Integer> pila = new Stack<>();

//         pila.push(10);
//         pila.push(20);
//         pila.push(30);

//         System.out.println("Elemento en la cima: " + pila.peek());

//         while (!pila.isEmpty()){
//             System.out.println("Elemento desapilado: " + pila.pop());
//         }
//     }
// }


// public class Main {
//     public static void main(String[] args) {
//         List<String> nombres = new ArrayList<>();

//         nombres.add("Juan");
//         nombres.add("Maria");
//         nombres.add("Pedro");

//         for (String nombre : nombres) {
//             System.out.println("Hola, " + nombre + "!");
//         }
//     }
// }
