package NivelIntermedario.Aulas.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------- NARUTO ----------");

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17, 20, NivelNinja.GENIN, Biju.KURAMA);
        naruto.habilidadeEspecial();
        System.out.println(naruto.biju);
        naruto.estrategiaDeBatalhaNinja();

        System.out.println("----------- SASUKE ----------");

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 10, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        System.out.println("----------- ITACHI ----------");

        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 27, 40, NivelNinja.JOUNNIN);
        itachi.habilidadeEspecial();
        itachi.sharinganAtivado();

        System.out.println("----------- MADARA ----------");

        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45, 900, NivelNinja.KAGE);
        madara.estrategiaDeBatalhaNinja();
        madara.sharinganAtivado();
        madara.habilidadeEspecial();
        madara.inteligenciaDeCombate();
        madara.inteligenciaDeCombate(180);

        System.out.println("----------- KAKASHI ----------");

        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.aldeia = "Aldeia da Folha";
        kakashi.idade = 48;
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();



    }
}
