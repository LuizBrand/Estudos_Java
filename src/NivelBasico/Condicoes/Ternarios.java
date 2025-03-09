package NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        // Ternários sao maneiras de reduzir o código;
        // variavel = (condiçao) ? valorSeVerdadeiro : valorSeFalso;

        short numeroDeMissoes = 11;
        String nivel = (numeroDeMissoes >= 10 ) ? "Esse ninja está com mais de 10 missoes" : "Esse ninja tem menos de 10 missoes";
        System.out.println(nivel);

    }
}
