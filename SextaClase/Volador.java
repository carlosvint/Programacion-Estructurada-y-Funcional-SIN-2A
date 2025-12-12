package SextaClase;

public interface Volador {
    void volar();
}

interface Nadador {
    void nadar();
}

abstract class Animal {
    public abstract void hablar();
}

class Pato extends Animal implements Volador, Nadador {
    public void volar(){
        System.out.println("El pato esta volando.");
    }

    public void nadar(){
        System.out.println("El pato esta nadando.");
    }

    public void hablar(){
        System.out.println("Cuac cuac!");
    }
}

class Murcielago extends Animal implements Volador {
    public void volar(){
        System.out.println("El muercielago esta volando");
    }

    public void hablar(){
        System.out.println("El murcielago hace un sonido");
    }
}

class Pez extends Animal  implements Nadador {
    public void nadar(){
        System.out.println("El pez esta nadando.");
    }

    public void hablar(){
        System.out.println("El pez hace burbujas.");
    }
}

// class Main {
//     public static void main(String[] args) {
//         Animal p = new Pato();
//         Animal m = new Murcielago();

//         // Animal p2 = new Pato();
//         // Volador v2 = new Pato();
//         // Nadador n2 = new Pato();
//         // Pato p3 = new Pato();

//         Animal p1 = new Pato();
//         Animal z = new Pez();

//         Animal[] animales = {p, m, p1, z};

//         for(Animal a : animales){
//             a.hablar();

//             if(a instanceof Volador){
//                 ((Volador) a).volar();
//             }

//             if(a instanceof Nadador){
//                 ((Nadador) a).nadar();
//             }

//             System.out.println("-----");
//         }
//     }
// }