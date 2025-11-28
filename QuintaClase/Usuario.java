package QuintaClase;

import java.util.Objects;

public class Usuario {
    protected String nombre;
    protected int edad;
    protected String profesion;
    public boolean activo;

    public Usuario(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void activarUsuario(){
        activo = true;
        System.out.println("El usuario ha sido activado puede proceder con la creacion de la cuenta.");
    }

    public void crearCuenta(){
        if (activo){
            System.out.println("La cuenta se ha creado.");
        } else {
            System.out.println("El usuarion no esta activo. Debe activarlo antes de crear una cuenta");
        }
    }

    public void login(){
        System.out.println("Bienvenido al sistema de la UIDE.");
    }

    public void logout(){
        System.out.println("Ha dejado el sistema de la UIDE.");
    }

    @Override
    public boolean equals(Object O){
        if (this == O) return true;
        if (!(O instanceof Usuario)) return false;

        Usuario usuario = (Usuario) O;
        return edad == usuario.edad && Objects.equals(nombre, usuario.nombre);
    }

}

class Estudiante extends Usuario {
    String carrera;

    public Estudiante(String nombre, int edad, String carrera){
        super(nombre, edad);
        this.carrera = carrera;
        this.profesion = "Estudiante";
    }

    public void inscribirMateria(String Materia){
        System.out.println("El estudiante " + nombre + " ha sido inscrito en la materia: " + Materia);
    }

}

class Profesor extends Usuario {
    boolean tiempoCompleto;

    public Profesor(String nombre, int edad, boolean tiempoCompleto){
        super(nombre, edad);
        this.tiempoCompleto = tiempoCompleto;
        this.profesion = "Profesor";
    }

    public void darClase(String materia){
        System.out.println("El profesor " + nombre + " ha iniciado la clase de " + materia);
    }
}

class ProfesorMaestria extends Profesor {
    String maestria;

    public ProfesorMaestria(String nombre, int edad, boolean tiempoCompleto, String maestria){
        super(nombre, edad, tiempoCompleto);
        this.maestria = maestria;
    }
}

// class Main {
//     public static void main(String[] args) {
//         ProfesorMaestria pm1 = new ProfesorMaestria("Carlos Vintimilla", 30, false, "Ciencia de Datos");
//         pm1.activarUsuario();
//         pm1.crearCuenta();
//         pm1.login();
//         pm1.darClase("Aprendizaje Automatico");
//         pm1.logout();

//         System.out.println("Tiempo Completo: " + pm1.tiempoCompleto);
//         ProfesorMaestria pm2 = new ProfesorMaestria("Carlos Vintimilla", 30, false, "Ciencia de Datos");


//         System.out.println(pm1.equals(pm2));
//     }
// }