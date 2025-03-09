package NivelBasico.TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados Primitivos - int, double, float, char, byte, short, boolean;
        * */
        int idade = 17; // Valor maximo: 2147483647
        double altura = 1.75;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 999999999999999L;

        System.out.println(idade);
        System.out.println(saldoBancario);
        System.out.println(altura);
        System.out.println("saldoBancario é = " + saldoBancario);
        System.out.println("Minha idade é: " + idade);
    }
}
