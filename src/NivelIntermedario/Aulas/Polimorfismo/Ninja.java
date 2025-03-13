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

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: "+ nome + ". E Essa é minha inteligencia de Combate");
    }

    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + " e você é um gênio de combate!");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + " e você é um ninja promissor!");
        } else {
            System.out.println("Seu QI é: " + qi + " e você precisa melhorar!");
        }
    }

    // Métodoo abstrato - Obrigatório em todas as classes filhas
    /*public abstract void estrategiaDeBatalhaNinja();*/
}
