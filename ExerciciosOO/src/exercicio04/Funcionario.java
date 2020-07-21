package exercicio04;

public class Funcionario extends Pessoa{

    private String numeroDeMatricula;

    public Funcionario(String nome, int idade, String cidadeDeNascimento, String numeroDeMatricula) {
        super(nome, idade, cidadeDeNascimento);
        this.numeroDeMatricula = numeroDeMatricula;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Numero Matricula: " + this.numeroDeMatricula);
    }

}
