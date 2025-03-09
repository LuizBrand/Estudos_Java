package NivelIntermedario.AulasAntesConstrutores;

public class Main {
    public static void main(String[] args) {

        // naruto
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 16;
        Naruto.ModoSabioAtivado();
        //parte de polimorfismo
        Naruto.habilidadeBraba();

        // sasuke
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 17;
        //aplicando metodos aos meus objetos
        Sasuke.SharinganAtivado();
        //parte de polimorfismo
        Sasuke.habilidadeBraba();

        // sakura
        Harumi Sakura = new Harumi();
        Sakura.nome = "Sakura";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 16;
        Sakura.CuraAtivada();

        // Hinata
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata";
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.idade = 17;
        Hinata.ByakuganAtivado();

        // BorutoF
        Boruto boruto = new Boruto();
        boruto.nome = "Boruto Hyuga Uzumaki";
        boruto.aldeia = "Aldeia da Folha";
        boruto.idade = 9;
        boruto.ModoSabioAtivado();
        boruto.AtivarKarma();
        boruto.AtivarJougan();

       /* int quantoTempoFalto = Sasuke.anosParaSeTornarHokage(50);
        System.out.println("Voce tem " + Sasuke.idade + ", logo faltam no minino " + quantoTempoFalto + " para poder se tonar Hokage");
*/
    }
}
