package NivelBasico.Condicoes;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        // Pedir para o usuário
        Scanner scanner = new Scanner(System.in);

        // Mostrar opçoes para o usuário
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // Pedir para o usuário escolher um das opcoes
        System.out.println("Digite o numero do personagem que deseja selecionar: ");
        int escolhaDoUsuario = scanner.nextInt();
        System.out.println("Você digitou o numero: " + escolhaDoUsuario);

        // Açao com base na escolha do usuário
        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Você escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Você escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("Você escolheu a Sakura Haruno");
                break;
            default:
                System.out.println("Voce digitou uma opcao inválida!!");
        }

        // Fechar a caixa de Texto
        scanner.close();


    }
}
