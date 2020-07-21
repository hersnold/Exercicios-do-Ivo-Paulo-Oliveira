package exercicio05;

public class Caneta implements CoisaQueEscreve{
    private String ehFeitoDe = "Plastico";
    private String escreveCom = "Tinta";

    @Override
    public void escrever() {
        System.out.println("Escrevendo de" + this.escreveCom);
    }
}
