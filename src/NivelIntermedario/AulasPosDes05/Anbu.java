package NivelIntermedario.AulasPosDes05;

// Essa classe não pode ser estendida por nenhuma outra
final public class Anbu {

    //seus métodos e atributos não necessariamente precisam ser Final tbm
    String nome;

    //variaveis (atributos) final não podem ter seu valor alterado
    //O mesmo vale para as criadas dentro de interfaces
    final double altura = 1.79;

    public void NinjaAnbu() {
        System.out.println("Meu nome é: " + nome + ". E eu sou um ninja que faz parte da Anbu!");
    }


}
