package NivelIntermedario.AulasPosDes05.Generics;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EquipamentosNinjas kunai = new EquipamentosNinjas("Kunai de Ferro");
        EquipamentosNinjas shuriken = new EquipamentosNinjas("Shuriken");
        EquipamentosNinjas pergaminho = new EquipamentosNinjas("Pergaminho");

        BolsaGenerica<EquipamentosNinjas> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.addEquipamento(kunai);
        bolsaGenerica.addEquipamento(shuriken);
        bolsaGenerica.addEquipamento(pergaminho);

        System.out.println(bolsaGenerica);


    }
}
