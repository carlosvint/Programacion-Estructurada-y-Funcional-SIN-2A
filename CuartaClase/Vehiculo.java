package CuartaClase;

public interface Vehiculo {
    void encender();
    void apagar();
}

class Auto implements Vehiculo {
    public int numLlantas = 4;

    public void encender(){
        System.out.println("El auto se ha encendido");
    }

    public void apagar(){
        System.out.println("El auto se ha apagado");
    }
}

class Moto implements Vehiculo {
    public void encender(){
        System.out.println("La moto se ha encendido.");
    }

    public void apagar(){
        System.out.println("La moto se ha apagado");
    }
}


// class Main {
//     public static void main(String[] args) {
//         Auto a = new Auto();
//         Moto m = new Moto();

//         System.out.println(a.numLlantas);

//         a.encender();
//         m.encender();

//         Vehiculo v1 = new Auto();
//         Vehiculo v2 = new Moto();


//         v1.encender();
//         v2.encender();

//     }
// }