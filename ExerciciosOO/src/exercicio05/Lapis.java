package exercicio05;

public class Lapis implements CoisaQueEscreve{
    private String ehFeitoDe = "madeira";
    private String escreveCom = "grafite";

    @Override
    public void escrever() {
        System.out.println("Escrevendo com " + this.escreveCom);
    }
}
