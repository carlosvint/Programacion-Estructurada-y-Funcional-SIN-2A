package SextaClase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//=================LOGICA PAGOS ----------------------

abstract class Pago {
    protected double monto;

    public Pago(double monto){
        this.monto = monto;
    }

    public abstract double calcularComision();
    public abstract String descripcion();

    public double total(){
        return monto + calcularComision();
    }
}

// Subclases

class PagoTarjeta extends Pago {
    private static double comision = 0.02;

    public PagoTarjeta (double monto){
        super(monto);
    }

    @Override
    public double calcularComision(){
        return monto * comision;
    }

    @Override
    public String descripcion(){
        return "Pago con tarjeta";
    }
}

class PagoTransferencia extends Pago {

    public PagoTransferencia(double monto){
        super(monto);
    }

    @Override
    public double calcularComision(){
        return 0;
    }

    @Override
    public String descripcion(){
        return "Pago con transferencia";
    }
}

class PagoPayPal extends Pago {
    private static double comision = 0.03;

    public PagoPayPal(double monto){
        super(monto);
    }

    @Override
    public double calcularComision(){
        if (monto < 100){
            return 0;
        } else {
            return monto * comision;
        }
    }

    @Override 
    public String descripcion(){
        return "Pago con Paypal";
    }
}


// ====== Interfaz Grafica ==============

class Ventana extends JFrame {
    public Ventana(){
        setTitle("CHECKOUT");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        JButton tarjetaButton = new JButton("Pago con tarjeta");
        JButton transferButton = new JButton("Pago con transferencia");
        JButton paypalButton = new JButton("Pago con paypal");

        tarjetaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                pagar(new PagoTarjeta(200));
            }
        });

        transferButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                pagar(new PagoTransferencia(200));
            }
        });

        paypalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                pagar(new PagoPayPal(200));
            }
        });

        add(tarjetaButton);
        add(transferButton);
        add(paypalButton);

        setVisible(true);
    }

    public void pagar(Pago p){
        JOptionPane.showMessageDialog(this, 
            p.descripcion() + 
            " | Monto: " + p.monto +
            " | Comision:" + p.calcularComision() + 
            " | Total:  " + p.total()
        );
    }
}



// ========== Correr programa ============

public class PasarelaPagos {
    public static void main(String[] args) {
        new Ventana();
    }   
}
