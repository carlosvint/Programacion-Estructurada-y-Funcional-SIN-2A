package TerceraClase;

import java.util.Scanner;

public class Votante {
    // Atributos
    public String Nombre;
    public String Apellido;
    String cedula;
    int edad;
    boolean puedeVotar;
    String recintoElectoral;
    private String voto;
    boolean tieneCertificadoVotacion = false;

    public Votante(){
        //Definir un constructor.
    }


    // Constructor - Nos ayuda a construir un objeto con data minima.
    public Votante(String NombreVotante, String ApellidoVotante){
        this.Nombre = NombreVotante;
        this.Apellido = ApellidoVotante;
    }

    // Metodos
    void votar(String candidato){
        if (candidato.equals("Nulo")){
            voto = candidato;
            System.out.println("Felicitaciones, usted ha ejercido su derecho al voto. Ha votado Nulo");
        } else{
            voto = candidato;
            System.out.println("Felicitaciones, usted ha ejercido su derecho al voto. Usted voto por " + candidato);
        }
    }

    void recibirCertificado(){
        if (voto != null) {
            tieneCertificadoVotacion = true;
            System.out.println("Su certificado de votacion se envio al correo ingresado.");
        } else {
            System.out.println("Para recibir su certificado de votacion primero debe ejercer su derecho al voto.");
        }
    }

    boolean validarCedula(String cedula_prob){
        if (cedula_prob.length() == 10){
            System.out.println("Cedula Valida.");
            return true;
        } else {
            System.out.println("Su cedula es invalida. Por favor, ingrese de nuevo");
            return false;
        }
    }

}


// class Main {
//     public static void main(String[] args) {
//         // Votante persona = new Votante();
//         // persona.Nombre = "Carlos";
//         // persona.Apellido = "Vintimilla";
        
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Ingrese su cedula de votacion");
//         // String cedula = sc.nextLine();

//         // boolean validez = persona.validarCedula(cedula);
//         // if (validez == true){
//         //     persona.cedula = cedula;
//         // }

//         // System.out.println("Ingrese su voto");
//         // String voto = sc.nextLine();
//         // persona.votar(voto);


//         // for (String votoInfo : new String[]{"1234567890,Si", "1234567890,No", "1234567890,Si", "1234567890,No"}){
//         //     Votante votante = new Votante();
//         //     String ced = votoInfo.split(",")[0];
//         //     boolean val = votante.validarCedula(ced);
//         //     if (val == true){
//         //         votante.cedula = ced;
//         //     }
//         //     persona.votar(votoInfo.split(",")[1]);
//         // }

//         Votante persona = new Votante("Carlos", "Vintimilla");
//         System.out.println(persona.Nombre + " " + persona.Apellido);

//         for (String votoInfo : new String[]{"Jose,Perez,1234567890,Si", "Maria,Ramirez,2345678901,No"}){
//             Votante votante = new Votante(votoInfo.split(",")[0], votoInfo.split(",")[1]);
//             String ced = votoInfo.split(",")[2];
//             boolean val = votante.validarCedula(ced);
//             if (val == true){
//                 votante.cedula = ced;
//             }
//             persona.votar(votoInfo.split(",")[3]);
//             // System.out.println(persona.voto);

//         }

//     }
// }