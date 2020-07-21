package exercicio05;

public class PenaMosquito implements CoisaQueEscreve{
    private String ehFeitoDe = "metal";
    private String escreveCom = "nanquim";

    @Override
    public void escrever() {
        System.out.println("Escrevendo com " + this.escreveCom);
    }
}
