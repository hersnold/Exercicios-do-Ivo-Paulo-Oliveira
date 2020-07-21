import.java.util.Random;
package exercicio01;


public class Pessoa {
    private String nome;
    private String cpf;
    private double altura;

    public Pessoa(String nome, String cpf, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.altura = altura;
    }


    public void andar(){
	Random passos = new Randoon();
	for (int i = 0; i < 1000; i++){
        System.out.println(this.nome+" andou "+passos.nextInt());
	}
    }

    public void falarCPF(){
        System.out.println("Meu telefone é: " + this.CPF);
    }

}
