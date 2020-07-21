package exercicio07;

public class Veiculo {
    private String nome;
    private int numeroRodas;
    private double tanqueCombustivel;
    private double consumo;
    private double combustivelTanque;

    public Veiculo(String nome, int numeroRodas, double tanqueCombustivel, double consumo, double combustivelTanque) {
        this.nome = nome;
        this.numeroRodas = numeroRodas;
        this.tanqueCombustivel = tanqueCombustivel;
        this.consumo = consumo;
        this.combustivelTanque = combustivelTanque;
    }

    public void abastecer(double qtdCombustivel){
        if(this.combustivelTanque + qtdCombustivel > this.tanqueCombustivel){
            System.out.println("Vai exceder o limite");
            System.out.println("Abastecendo até o limite");
            this.combustivelTanque = this.tanqueCombustivel;
        }
        else {
            this.combustivelTanque += qtdCombustivel;
        }
    }

    public void autonomia(){
        System.out.println("O " + this.nome + " tem autonomia de " + (this.combustivelTanque * consumo) + " Km");
    }


}
