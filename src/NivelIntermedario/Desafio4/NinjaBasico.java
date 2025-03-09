package NivelIntermedario.Desafio4;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    tipoHabilidade habilidade;


    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome é " + nome + ".");
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Eu sou um ninja BÁSICO, minha habiliade é: " + habilidade + ".");
    }

    @Override
    public void executarHabilidades() {
        System.out.println("Habilidade: " + habilidade + " Executada!!\n");
    }

    //AllArgs Constructor
    public NinjaBasico(String nome, tipoHabilidade habilidade,int idade ) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }
}
