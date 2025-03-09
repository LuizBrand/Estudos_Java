package NivelIntermedario.Aulas;

public class Main {
    public static void main(String[] args) {

        //NoArgs Constructo
        Senju Hashirama = new Senju("Hashirama", 45, false);
        System.out.println(Hashirama.nome);
        Hashirama.sabedoriaHokage();

        Senju Tobirama = new Senju("Tobirama Senju");
        System.out.println(Tobirama.nome);

/*        Hokages Hiruzen = new Hokages(40);
        System.out.println(Hiruzen.idade);

        //AllArgs Constructor
        Hokages Minato = new Hokages("Minato Namikaze", 32, false);
        System.out.println(Minato.nome);*/
    }
}
