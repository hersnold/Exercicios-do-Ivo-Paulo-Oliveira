package exercicio02;

public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calculaArea (){
        return (this.base * this.altura)/ 2;
    }

}
