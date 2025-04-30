package NivelAvancado.staticc;

public class Main {

    static int idadeGlobal = 17;

    public static void main(String[] args) {
        //Tudo o que e non-static precisa criar um objeto, por que esse objeto esta fora do escopo
        // static. non-static fiels nao podem ser referenciados em um contexto static
        Ninja naruto = new Ninja();
        naruto.name = "Naruto";
        naruto.kyubi();

        //Tudo o que é static não precisa criar um objeto
        Ninja.sharigan();
        System.out.println(idadeGlobal);
    }
}
