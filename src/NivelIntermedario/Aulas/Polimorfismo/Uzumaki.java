package NivelIntermedario.Aulas.Polimorfismo;

public class Uzumaki extends Ninja{

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + nome + ". Minha habilidade Uzumaki ativou, ataque de Ar");
    }


    //Métodos abstratos nao necesariamente precisam ter @Override
/*    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é minha estrategia de Batalha");
    }*/


}
