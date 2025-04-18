package NivelIntermedario.Desafio6;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList<Ninja> ninjaList = new LinkedList<>();

        ninjaList.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        ninjaList.add(new Ninja("Sasuke Uchiha", 18, "Konoha"));
        ninjaList.add(new Ninja("Hinata Hyuga", 17, "Konoha"));
        ninjaList.add(new Ninja("Sakura Haruno", 18, "Konoha"));
        ninjaList.add(new Ninja("Gaara", 17, "Areia"));
        ninjaList.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        ninjaList.add(new Ninja("Shikamaru Nara", 18, "Konoha"));


        boolean quit = false;
        int option;
        //Menu para seleção de ações
        do {

            System.out.println("----------------- MENU ----------------");
            System.out.println(" - Opção 1: Adicionar elemento no começo da Lista de Ninjas");
            System.out.println(" - Opção 2: Remover o primeiro elemento da Lista de Ninjas");
            System.out.println(" - Opção 3: Buscar PELO NOME um ninja especifico na lista de Ninjas");
            System.out.println(" - Opção 4: Buscar PELO INDICE um ninja especifico na lista de Ninjas");
            System.out.println(" - Opção 5: Mostrar todos o Ninjas da lista");
            System.out.println(" - Opção 6: Ordenar a lista por Idade (Do mais novo para o mais velho)");
            System.out.println(" - Opção 7: Ordenar a lista por Ordem Alfabética");
            System.out.println(" - Opção 8: Ordenar a lista por Aldeia");
            System.out.println(" - Opção 9: Encerrar Sistema");
            System.out.println("DIGITE O NUMERO DA OPÇÃO QUE DESEJA: ");
            option = scanner.nextInt();
            scanner.nextLine();

            //switch case
            switch (option) {
                case 1:
                    //add novo ninja na lista
                    System.out.println("Informe o nome do novo Ninja: ");
                    String newNinjaName = scanner.nextLine();
                    System.out.println("Informe a Aldeia do novo Ninja: ");
                    String newNinjaVillage = scanner.nextLine();
                    System.out.println("Indorme a Idade do novo Ninja: ");
                    int newNinjaAge = scanner.nextInt();

                    ninjaList.addFirst(new Ninja(newNinjaName, newNinjaAge, newNinjaVillage));
                    System.out.println("Ninja Adcionado com sucesso!!");
                    break;
                case 2:
                    //Remover primeiro ninja da lista
                    ninjaList.removeFirst();
                    System.out.println("Primeiro ninja da lista removido ");
                    break;
                case 3:
                    //buscar um ninja na lista pelo seu nome
                    System.out.println("Informe o nome do Ninja que deseja buscar: ");
                    String nameSpecified = scanner.nextLine().toUpperCase();

                    //criando uma lista para caso o usuario informe o nome incompleto
                    //e tenha mais de um ninja com o mesmo primeiro nome
                    List<Ninja> searchResult = new LinkedList<>();
                    for (Ninja ninja : ninjaList) {
                        if (ninja.getName().toUpperCase().contains(nameSpecified)) {
                            searchResult.add(ninja);
                        }
                    }

                    if (!searchResult.isEmpty()) {
                        System.out.println("Ninja(as) como este nome encontrado!!");
                        for (Ninja ninja : searchResult) {
                            System.out.println(ninja);
                        }
                    } else {
                        System.out.println("Não há ninjas com esse nome!");
                    }
                    break;
                case 4:
                    //Buscar um ninja pelo seu indice
                    System.out.println("Informe o indice para busca: ");
                    int indexSpecified = scanner.nextInt();

                    if (indexSpecified >= 0 && indexSpecified < ninjaList.size()) {
                        System.out.println("Ninja Encontrado!");
                        System.out.println(ninjaList.get(indexSpecified));
                    } else {
                        System.out.println("Valor do indice informado inválido!");
                    }
                    break;
                case 5:
                    //Mostrar todos os ninjas presentes
                    System.out.println("----------------- TODOS OS NINJAS ----------------");
                    for (Ninja ninja : ninjaList) {
                        System.out.println(ninja);
                    }
                    break;
                case 6:
                    Comparator<Ninja> byAge = Comparator.comparingInt(Ninja::getAge);//definindo o comparator
                    ninjaList = mySort.MergeSort(ninjaList, byAge); //Ordenação por Idade
                    //mostrando a lista ordenada por Idade
                    System.out.println("------------- LISTA ORDENADA POR IDADE ------------");
                    for (Ninja ninja : ninjaList) {
                        System.out.println(ninja);
                    }
                    System.out.println("-------------------------------------------------\n");
                    break;
                case 7:
                    Comparator<Ninja> byName = Comparator.comparing(Ninja::getName);//definindo o comparator
                    ninjaList = mySort.MergeSort(ninjaList, byName); //Ordenação por Idade
                    //mostrando a lista ordenada por Nome
                    System.out.println("------------- LISTA ORDENADA POR NOME ------------");
                    for (Ninja ninja : ninjaList) {
                        System.out.println(ninja);
                    }
                    System.out.println("-------------------------------------------------\n");
                    break;
                case 8:
                    Comparator<Ninja> byVillage = Comparator.comparing(Ninja::getVillage);//definindo o comparator
                    ninjaList = mySort.MergeSort(ninjaList, byVillage); //Ordenação por Idade
                    //mostrando a lista ordenada por Aldeia
                    System.out.println("------------- LISTA ORDENADA POR ALDEIA ------------");
                    for (Ninja ninja : ninjaList) {
                        System.out.println(ninja);
                    }
                    System.out.println("-------------------------------------------------\n");
                    break;
                case 9:
                    quit = true;
                    scanner.close();
                    System.out.println("Encerrando Sistema");
                    break;
                default:
                    System.out.println("Opção selecionado invalida!!");
            }
        } while (!quit);


    }
}