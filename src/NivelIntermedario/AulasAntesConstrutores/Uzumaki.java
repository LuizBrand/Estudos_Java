package NivelIntermedario.AulasAntesConstrutores;

public class Uzumaki extends Ninja {

    public void ModoSabioAtivado() {
        System.out.println("Meu nome é: " + nome + " e eu ativei o modo sábio!");
    }

    //parte sobre polimorfismo
    @Override
    public void habilidadeBraba() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki! Um ataque de Ar!!");
    }
}
