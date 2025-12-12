package SextaClase;

public abstract class Figura {
    public abstract double area();
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double area(){
        return Math.PI * radio * radio;
    }

    public double perimetro(){
        return Math.PI * radio * 2;
    }
}

class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double area(){
        return lado * lado;
    }
}

class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area(){
        return (base * altura) / 2;
    }
}

// class Main {
//     public static void main(String[] args) {
//         Circulo c1 = new Circulo(5);
//         Cuadrado q1 = new Cuadrado(4);
//         Triangulo t1 = new Triangulo(3, 6);

//         mostrarArea(t1);

//         // System.out.println("Area:" + c.area());
//         // System.out.println("Area:" + q.area());
//         // System.out.println("Area:" + t.area());

//         Figura c = new Circulo(5);
//         Figura q = new Cuadrado(4);
//         Figura t = new Triangulo(3, 6);

//         Figura[] figuras = {c, q, t};

//         for (Figura f: figuras){
//             mostrarArea(f);
//         }

//     }

//     public static void mostrarArea(Figura f){
//         System.out.println("Area: " + f.area());
//     }
// }