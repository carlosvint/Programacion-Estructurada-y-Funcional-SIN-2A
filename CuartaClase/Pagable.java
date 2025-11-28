package CuartaClase;

public interface Pagable {
    double COMISION_GENERAL = 0.05;

    void pagar(double monto);
} 

class PagarConTarjeta implements Pagable {
    private String numeroTarjeta;

    public PagarConTarjeta (String numeroTarjeta){
        this.numeroTarjeta = numeroTarjeta;
    }

    public void pagar(double monto){
        System.out.println("Procesando pago con tarjeta " + numeroTarjeta + " por un monto de " + monto);
        System.out.println("Comision: " + (monto * COMISION_GENERAL));
        System.out.println("Pago total: " + (monto + (monto * COMISION_GENERAL)));
        System.out.println("Pago realizado con exito.");
    }
}

class PagarConPaypal implements Pagable {
    private String cuentaPaypal;

    public PagarConPaypal (String cuentaPaypal){
        this.cuentaPaypal = cuentaPaypal;
    }

    public void pagar(double monto){
        System.out.println("Procesando pago con PayPal " + cuentaPaypal + " por un monto de " + monto);
        System.out.println("Comision: " + (monto * COMISION_GENERAL));
        System.out.println("Pago total: " + (monto + (monto * COMISION_GENERAL)));
        System.out.println("Pago realizado con exito.");
    }
}

class Tienda {
    public void procesarPago(Pagable metodo, double monto){
        System.out.println("Procesando pago en la tienda");
        metodo.pagar(monto);
    }
}

class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        Pagable tarjeta = new PagarConTarjeta("abc1123");
        Pagable paypal = new PagarConPaypal("cuentaPaypal");

        tienda.procesarPago(paypal, 10);
        tienda.procesarPago(tarjeta, 10);
    }
}