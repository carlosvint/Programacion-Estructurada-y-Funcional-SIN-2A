package CuartaClase;

public interface Figura {
    double calcularArea();
    double calcularPerimetro();
}

class Circulo implements Figura{
    double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }

    public double calcularArea(){
        return Math.PI * radio * radio;
    }
}

class Rectangulo implements Figura {
    double base;
    double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return base * altura;
    }

    public double calcularPerimetro(){
        return base * 2 + altura + 2;
    }

}

class Cuadrado implements Figura {
    double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    public double calcularPerimetro(){
        return 4 * lado;
    }

    public double calcularArea(){
        return lado * lado;
    }
}

// class Main {
//     public static void main(String[] args) {
//         Figura f1 = new Circulo(5);
//         Figura f2 = new Rectangulo(5, 5);
//         Figura f3 = new Cuadrado(5);

//         System.out.println(f1.calcularArea());
//         System.out.println(f2.calcularArea());
//         System.out.println(f3.calcularArea());
//     }
// }