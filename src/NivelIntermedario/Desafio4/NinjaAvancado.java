package NivelIntermedario.Desafio4;

public class NinjaAvancado implements Ninja {
    String nome;
    int idade;
    tipoHabilidade habilidade;
    String especialidade;

    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome é " + nome + ".");
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Eu sou um ninja AVANÇADO, minha habiliade é: " + habilidade + ".");
        System.out.println("Minha especialidade é: " + especialidade + ".");
    }

    @Override
    public void executarHabilidades() {
        System.out.println("Habilidade: " + habilidade + " Executada!!");
        executarHabilidadeEspecial();
    }

    public void executarHabilidadeEspecial() {
        System.out.println("Habilidade especial " + especialidade + " Executada!!");
    }

    //AllArgs Constructor
    public NinjaAvancado(String nome, tipoHabilidade habilidade, String especialidade, int idade) {
        this.idade = idade;
        this.nome = nome;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }
}
