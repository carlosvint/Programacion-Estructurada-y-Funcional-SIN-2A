package CuartaClase;

public class CuentaBancaria {
    // Atributos
    private double saldo;
    public String tipo;
    public boolean activo = false;
    static int contadorCuentas = 0;

    //Constructor
    public CuentaBancaria(double saldo, String tipo){
        this.saldo = saldo;
        this.tipo = tipo;
        this.activo = true;
        CuentaBancaria.contadorCuentas++;
    }

    //Getter
    public double getSaldo(){
        return saldo;
    }

    //Funciones basicas de clase

    public void retirar(double monto){
        if (monto <= saldo){
            saldo -= monto;
            System.out.println("Retiro exitoso.");
        } else {
            System.out.println("La cuenta no tiene suficiente saldo.");
        }
    }

    public void depositar (double monto){
        if (monto > 0){
            saldo += monto;
            System.out.println("Deposito exitoso.");
        }
    }

    public void imprimirSaldo (){
        System.out.println("Su saldo en la cuenta de " + tipo + " es: " + saldo );
    }

}

class Cliente {
    // Atributos
    private String nombre;
    public boolean activo = false;
    public CuentaBancaria[] cuentas;
    static String banco = "Banco UIDE";

    // Constructor
    public Cliente(String nombre, int NumeroMaximoCuentasCliente){
        this.nombre = nombre;
        this.cuentas = new CuentaBancaria[NumeroMaximoCuentasCliente];
        this.activo = true;
    }

    //Getter
    public String getNombre(){
        return nombre;
    }

    //Funcionamiento
    public void abrirCuenta(double saldo, String tipo){
        // Para poner la nueva cuenta en el arreglo cuentas que tiene todas las cuentas del cliente debemos considerar:
        // 1. Que el cliente no haya excedido el numero maximo cuentas.
        // 2. Que en el arreglo no sobreescribamos una cuenta ya existente.

        int marcador = 0;
        // arreglo cuentas = [null, null] si el tamaño es 2. Va a tener dos posiciones 0 y 1.
        for (int i = 0; i < cuentas.length; i++){
            if (cuentas[i] != null){
                marcador ++;
            } else {
                CuentaBancaria cb = new CuentaBancaria(saldo, tipo);
                cuentas[i] = cb;
                System.out.println("La cuenta de tipo " + tipo + " ha sido creada exitosamente, con un saldo inicial de " + saldo);
                break;
            }
        }

        if (marcador == cuentas.length){
            System.out.println("El cliente ha alcanzado el numero maximo de cuentas permitidas.");
        }
    }

    public void depositarEnCuenta(double monto, String tipo){
        // Para depositar tenemos que tener en cuenta:
        // 1. A que cuenta queremos depositar.
        // 2. Cuando recorramos el arreglo la posicion no este en null.

        int marcador = 0;

        for (CuentaBancaria c : cuentas){
            if (c == null){
                marcador++;
                continue;
            } else {
                if (c.tipo.equals(tipo)){
                    c.depositar(monto);
                    c.imprimirSaldo();
                    break;
                } else {
                    marcador++;
                }
            }
        }

        if (marcador == cuentas.length){
            System.out.print("El cliente no tiene una cuenta de tipo: " + tipo + ". No se pudo realizar el deposito.");
        }

    }


    public void retirarDeCuenta(double monto, String tipo){
        // Para retirar tenemos que tener en cuenta:
        // 1. A que cuenta queremos depositar.
        // 2. Cuando recorramos el arreglo la posicion no este en null.

        int marcador = 0;

        for (CuentaBancaria c : cuentas){
            if (c == null){
                marcador++;
                continue;
            } else {
                if (c.tipo.equals(tipo)){
                    c.retirar(monto);
                    c.imprimirSaldo();
                    break;
                } else {
                    marcador++;
                }
            }
        }

        if (marcador == cuentas.length){
            System.out.print("El cliente no tiene una cuenta de tipo: " + tipo + ". No se pudo realizar el retiro.");
        }

    }

}


// class Main {
//     public static void main(String[] args){
//         Cliente c1 = new Cliente("Carlos Vintimilla", 2);
//         c1.abrirCuenta(200, "Ahorros");
//         c1.abrirCuenta(500, "Corriente");
//         System.out.println(Cliente.banco);

//         c1.depositarEnCuenta(100, "Ahorros");
//         c1.retirarDeCuenta(20, "Corriente");

//         Cliente c2 = new Cliente("Juan Vintimilla", 4);
//         c2.abrirCuenta(100, "Ahorros");
//         c2.abrirCuenta(300, "Corriente");
//         c2.abrirCuenta(1000, "Cheques");
//         Cliente.banco = "Banco Universidad Internacional";

//         System.out.println(CuentaBancaria.contadorCuentas);
//         System.out.println(c1.banco);

//     }
// }