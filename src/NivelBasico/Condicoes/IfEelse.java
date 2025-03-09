package NivelBasico.Condicoes;

public class IfEelse {
    public static void main(String[] args) {

        //ninja naruto
        String nome = "Naruto Uzumaki";
        String rank;
        int idade = 16;
        boolean hogake = false;
        short NumeroDeMissoes = 20;

        if (NumeroDeMissoes >= 10 && idade > 15) {
            System.out.println("Naruto está pronto para mudar de Classe!");
        } else {
            System.out.println("O Naruto nao completou os requisitos para mudar de Classe");
        }

        if (NumeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (NumeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Genim");
        }

    }

}
