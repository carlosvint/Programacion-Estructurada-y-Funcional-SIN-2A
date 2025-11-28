package TerceraClase;

public class CuentaBancaria {
    //Atributos
    private String titular;
    private double saldo;

    //Constructor
    public CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    //Getter
    public double getSaldo(){
        return saldo;
    }

    // Setter

    // public void setSaldo(double newSaldo){
    //     saldo = newSaldo;
    // }

    // Funcion de depositar en la cuenta
    public void depositar(double monto){
        if (monto > 0){
            saldo += monto;
            System.out.println("Deposito Exitoso. El nuevo saldo es: " + saldo);
        } else {
            System.out.println("Monto Invalido");
        }
    }

    public void retirar(double monto){
        if (monto <= saldo){
            saldo -= monto;
            System.out.println("Retiro Exitoso. Nuevo Saldo: " + saldo);
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

}


// class Main{
//     public static void main(String[] args){
//         CuentaBancaria cuenta = new CuentaBancaria("Carlos Vintimilla", 200);
//         // cuenta.setSaldo(200000);
//         cuenta.depositar(100);
//         cuenta.retirar(20);
//         System.out.println(cuenta.getSaldo());

//     }

// }
