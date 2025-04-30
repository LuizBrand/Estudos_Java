package NivelAvancado.staticc;

public class Ninja {

    String name;

    public void kyubi() {
        System.out.println("Kyubi fora do escopo static");
    }

    public static void sharigan() {
        System.out.println("Sharigan dentro do escopo static");
    }
}
