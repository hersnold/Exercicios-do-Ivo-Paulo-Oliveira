package exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Paulo","981960284",1.83);
        Pessoa pessoa2 = new Pessoa("Magnus","98123432",1.75);
        Pessoa pessoa3 = new Pessoa("Maria","149349524",1.70);

        pessoa1.andar();
        pessoa2.crescer();
        pessoa3.andar();
    }
}
