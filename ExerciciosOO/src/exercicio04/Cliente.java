package exercicio04;

public class Cliente extends Pessoa{

    private String CPF;

    public Cliente(String nome, int idade, String cidadeDeNascimento, String CPF) {
        super(nome, idade, cidadeDeNascimento);
        this.CPF = CPF;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("CPF: " + this.CPF);
    }
}
