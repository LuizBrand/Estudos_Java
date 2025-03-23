package NivelIntermedario.Aulas.Polimorfismo;

public class Uchiha extends Ninja implements SharinganInterface {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    //sobrecarga de constructor na subclasse
    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    /*
    * Metodoo:
    * Implementa da Interface Sharingan
    * */
    @Override
    public void sharinganAtivado() {
        System.out.println(nome + ": Sharingan Ativado por um Uchiha");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + nome + ". Minha habilidade Uchiha ativou, ataque Bolo de Fogo. E eu ja completei: " + numeroDeMissoesConcluidas + " Missões");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: "+ nome + ". E Essa é minha inteligencia de Combate");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + " e você é um gênio de combate!");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + " e você é um ninja promissor!");
        } else {
            System.out.println("Seu QI é: " + qi + " e você precisa melhorar!");
        }
    }

}
