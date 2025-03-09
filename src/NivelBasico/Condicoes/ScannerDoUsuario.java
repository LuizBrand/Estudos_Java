package NivelBasico.Condicoes;
import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        // Abrir o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        // Receber nome do ninja
        System.out.println("Escreva aqui o nome do Ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do Ninja é: " + nomeDoNinja);

        // Receber idade do ninja
        System.out.println("Escreva a idade do ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do Ninja é: " + idadeDoNinja  + " anos");

        // Tratamento de Dados
        if (idadeDoNinja >= 18) {
            System.out.println("Esse ninja é maior de idade e poder ir para missoes fora da aldeia.");
        } else {
            System.out.println("Esse ninja é novo ainda, precisa treinar mais antes de sair da vila.");
        }

        // Fechar sempre o Scanner
        caixaDeTexto.close();

    }
}
