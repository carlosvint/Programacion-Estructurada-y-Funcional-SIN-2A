package SextaClase;

public class Animal {
    public void hablar(){
        System.out.println("El animal hace un sonido.");
    }
}

class Perro extends Animal {
    @Override
    public void hablar(){
        System.out.println("Guau guau!");
    }
}

// class Main {
//     public static void main(String[] args) {
//         Animal a = new Animal();
//         Animal p = new Perro();

//         a.hablar();
//         p.hablar();

//     }
// }