package NivelIntermedario.AulasPosDes05.Generics;

public class Main {
    public static void main(String[] args) {

        EquipamentosNinjas kunai = new EquipamentosNinjas("Kunai de Ferro");
        EquipamentosNinjas shuriken = new EquipamentosNinjas("Shuriken");
        EquipamentosNinjas pergaminho = new EquipamentosNinjas("Pergaminho");

        BolsaGenerica<EquipamentosNinjas> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.addEquipamento(kunai);
        bolsaGenerica.addEquipamento(shuriken);
        bolsaGenerica.addEquipamento(pergaminho);
        bolsaGenerica.mostrarEquipamentos();
        System.out.println("------------------------");

        BolsaGenerica<Object> livrosJiraiya = new BolsaGenerica<>();
        livrosJiraiya.addEquipamento(new EquipamentosNinjas("Icha Icha"));
        livrosJiraiya.addEquipamento(new EquipamentosNinjas("A Lenda de um Ninja Determinado"));
        livrosJiraiya.addEquipamento(new Object()); //referencia o lugar na memoria onde esse objeto esta localizado
        livrosJiraiya.mostrarEquipamentos();

    }
}
