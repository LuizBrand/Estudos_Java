package NivelIntermedario.Aulas;

public class Senju extends Hokages{

    //sobrescrever o métodoo da classe Hokage
    @Override
    public void sabedoriaHokage() {
        System.out.println("Você ganhou a sabedoria de um Hokage!");
    }

    public Senju(int idade) {
        this.idade = idade;
    }

    public Senju(String nome, int idade, boolean vivoOuNao) {
        this.idade = idade;
        this.nome = nome;
        this.vivoOuNao = vivoOuNao;
    }

    public Senju(String nome) {
        this.nome = nome;
    }

    public Senju() {
    }
}
