package NivelIntermedario.Desafio1;

public class Ninja {
    String nome;
    String missao;
    String nivelDeDificuldade;
    String statusDaMissao;
    int idade;

    public void mostrarInformacoes(){
        System.out.println("Nome do Ninja: " + nome + ".");
        System.out.println("Idade do Ninja: " + idade + ".");
        System.out.println("Missao do Ninja: "  + missao + ".");
        System.out.println("Nível de dificuldade da Missão: " + nivelDeDificuldade + ".");
        System.out.println("Status da Missão: " + statusDaMissao + ".");
    }
}
