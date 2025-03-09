package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados nao primitivos: String, Array, Class, enum
        * Métodos são caracteristicas que podemos colocar nas variaveis
        * A principal diferença de um DNP para DP? - DNP pode se aplicar métodos
        * */
        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); //.toUpperCase é um metodo padrao do JAVA
        System.out.println("Esse texto esta em CAPSLOCK: " + nomeUpperCase);
        System.out.println("Esse texto esta NORMAL: " + nome);

        String aldeia = "Aldeia da Folha";
        String aldeiaLowerCase = aldeia.toLowerCase();
        System.out.println(aldeiaLowerCase);
    }
}
