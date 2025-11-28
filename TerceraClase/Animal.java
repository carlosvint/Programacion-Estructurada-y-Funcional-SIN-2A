package TerceraClase;

public class Animal {
    private String especie;
    private String sonido;

    public Animal(String especie, String sonido){
        this.especie = especie;
        this.sonido = sonido;
    }

    public void hacerSonido(){
        System.out.println("El " + especie + " hace " + sonido);
    }
}

class Main {
    public static void main(String[] args){
        Animal perro = new Animal("perro", "guau");
        perro.hacerSonido();

        Animal gato = new Animal("gato", "miau");
        gato.hacerSonido();
    }
}
