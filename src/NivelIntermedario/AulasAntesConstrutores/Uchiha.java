package NivelIntermedario.AulasAntesConstrutores;

// A Classe Uchiha vai estender a classe Ninja
public class Uchiha extends Ninja {

    //herança é simplesmente herdar caracteristicas de uma classe mãe
    public void SharinganAtivado() {
        System.out.println("Meu nome é " + nome + ". O sharingan Ativou! Eu sou um Uchiha");
    }

    //parte sobre polimorfismo
    @Override //usa-se override para sobrescrever um metodo
    public void habilidadeBraba() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha! Bola de Fogo!!");
    }

}
