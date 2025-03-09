package NivelIntermedario.Aulas.Polimorfismo;

public abstract class Ninja implements estrategiaDeBatalha {

    // TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas , Rank
    // TODO: Rank: Gennin, Chunnin, Jounnin, Hokage -> ENUM

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // TODO: Sobrecarga do constructor chamando os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    // Métodoo Geral - Todos os ninjas vao ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Especial");
    }
    // Sobrescrevedo o métodoo da interface
    @Override
    public void estrategiaDeBatalhaNinja() {
    System.out.println("Meu nome é: "+ nome + ". E Essa é minha estrategia de Batalha");
    }

    // Métodoo abstrato - Obrigatório em todas as classes filhas
    /*public abstract void estrategiaDeBatalhaNinja();*/
}
