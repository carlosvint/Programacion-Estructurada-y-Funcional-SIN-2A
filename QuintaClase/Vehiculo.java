package QuintaClase;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void mostrarInfo(){
        System.out.println(marca + " " + modelo + " " + anio);
    }
}

class Camion extends Vehiculo{
    boolean cargado;

    public Camion(String marca, String modelo, int anio, boolean cargado){
        super(marca, modelo, anio);
        this.cargado = cargado;
    }
    
    public void cargarCamion(){
        cargado = true;
        System.out.println("El camion ha sido cargado.");
    }
}

class Sedan extends Vehiculo {
    boolean familiar;

    public Sedan(String marca, String modelo, int anio, boolean familiar){
        super(marca, modelo, anio);
        this.familiar = familiar;
    }

    public void tunear(){
        familiar = false;
        System.out.print("El sedan ha sido tuneado, ya no es un auto familiar.");
    }
}


// class Main {
//     public static void main(String[] args) {
//         Sedan sedan = new Sedan("Honda", "Civic", 2000, true);
//         Camion camion = new Camion("Hino", "Mavesa", 2020, false);
//         Camion camion2 = new Camion("Hino", "Mavesa", 2020, false);
//         System.out.println(camion.marca);
//         camion.mostrarInfo();
//         camion.cargarCamion();
//         sedan.mostrarInfo();

//         System.out.println(camion.equals(camion2));

//         Integer i = 5;
//         i.getClass();
//     }
// }
