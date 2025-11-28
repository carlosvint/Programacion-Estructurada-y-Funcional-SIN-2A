package QuintaClase;

public abstract class Animal {
    String especie;

    public Animal(String especie){
        this.especie = especie;
    }

    public abstract void hacerSonido();

    public void dormir(){
        System.out.println("El animal " + " está durmiendo...");
    }

}

interface serVivo {
    void metabolizar();
}

interface mamifero {
    void darALuz();
}

class Perro extends Animal implements serVivo, mamifero {

    public Perro(String especie){
        super(especie);
    }

    public void hacerSonido(){
        System.out.println("Guau guau!");
    }

    public void metabolizar(){
        System.out.println("Metabolizar");
    }

    public void darALuz(){
        System.out.println("Dar a Luz"); 
    }
}

class Gato extends Animal {
    public Gato (String especie){
        super(especie);
    }

    public void hacerSonido(){
        System.out.println("Miau!");
    }
}

class Main {
    public static void main(String[] args) {
        Animal[] animales = {
            new Perro("perro"),
            new Gato("gato")
        };

        for (Animal a : animales){
            a.hacerSonido();
            a.dormir();
        }

        serVivo perro = new Perro("perro");
        perro.metabolizar();

        mamifero p1 = new Perro("perro");
        p1.darALuz();

        Animal p2 = new Perro("perro");
        p2.dormir();

        Perro p3 = new Perro("Perro");
        p3.hacerSonido();
    }
}