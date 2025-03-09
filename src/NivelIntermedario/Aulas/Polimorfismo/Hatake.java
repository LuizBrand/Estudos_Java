package NivelIntermedario.Aulas.Polimorfismo;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface {
    public void boasVindas() {
        System.out.println("Meu nome é: " + nome + ". Eu sou um Hatake");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + ": Sharingan ativado pelo Kakashi!");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println(nome + ". Eu sou um Ninja de Elite");
    }
}
