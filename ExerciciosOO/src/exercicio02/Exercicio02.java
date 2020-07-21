package exercicio02;

public class Exercicio02 {
    public static void main(String[] args) {

        Triangulo triangulo1 = new Triangulo(3,5);
        Triangulo triangulo2 = new Triangulo(4,2);
        Triangulo triangulo3 = new Triangulo(5,7);

        System.out.println("Area triangulo 1: " + triangulo1.calculaArea());
        System.out.println("Areatriangulo 2: " + triangulo2.calculaArea());
        System.out.println("Area  triangulo 3: " + triangulo3.calculaArea());



    }
}
