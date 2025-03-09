package NivelBasico.Desafio2;

import java.util.Scanner;

public class DesafioDois {
    public static void main(String[] args) {

        // incializacao do scanner
        Scanner scanner = new Scanner(System.in);

        // Maximo de registrations que podera ser armazenado no vetor
        System.out.println("Qual o total de Ninjas que poderão ser cadastrados?");
        int MAX_NINJAS = scanner.nextInt();

        // Variaveis
        int option;
        boolean keepRunning = true;
        int registrations = 0;
        String[] ninjasList = new String[MAX_NINJAS];

        // Laço de Repetição para uso do sistema
        do {
            //Mennu de opções
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            // switch para determinar qual ação utilizar
            switch (option) {
                case 1:
                    if (registrations < MAX_NINJAS) {
                        /* O nextInt utilizado acima so pega o numero informado na opcao..
                        Por conta disso o \n (enter) fica no buffer, ai usa-se o nextLine agora (abaixo) para
                        poder "pegar" o \n e permitir que quando informamos o nome do ninjas
                        o nextLine realmente armazene o nome no array de ninjas, ao inves do \n;
                        */
                        scanner.nextLine();
                        System.out.println("Informe o nome do Ninja " + (registrations + 1) + ": ");
                        ninjasList[registrations] = scanner.nextLine();
                        System.out.println("Ninja Cadastrado!");
                        registrations++;
                    } else {
                        System.out.println("Já há muitos ninjas cadastrados!!");
                    }
                    break;
                case 2:
                    if (registrations == 0){
                        System.out.println("Nenhum Ninja cadastrado!!");
                    } else {
                        System.out.println("======== Lista dos Ninjas Cadastrados ========");
                        for (int i = 0; i < registrations; i++) {
                            System.out.println( (i + 1) +". "+ ninjasList[i]);
                        }
                    }
                    break;
                case 3:
                    keepRunning = false;
                    System.out.println("Obrigado por usar o nosso sistema ninja!!");
                    break;
                default:
                    System.out.println("Numero Informado INVALIDO!!");
            }
        } while (keepRunning);
        scanner.close();
    }
}
