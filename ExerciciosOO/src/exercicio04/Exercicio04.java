package exercicio04;

public class Exercicio04 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Paulo",20,"Sao Paulo","3812121212");
        Funcionario funcionario = new Funcionario("Pedro",19,"Minas Gerais", "12931334");
        Pessoa pessoa = new Pessoa("Constantino",29,"Mato Grosso do Sul");
        cliente.exibirDados();
        System.out.println("---------------------");
        funcionario.exibirDados();
        System.out.println("---------------------");
        pessoa.exibirDados();
    }

}
