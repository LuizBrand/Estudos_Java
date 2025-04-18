package NivelIntermedario.Desafio6;

import java.util.Comparator;
import java.util.LinkedList;

public class mySort {

    public static LinkedList<Ninja> MergeSort (LinkedList<Ninja> ninjaList, Comparator<Ninja> comparator) {

        //condição de verificação se a divisao ja alcançou apenas um elemento por lista
        if (ninjaList.size() <= 1) {
            return ninjaList;
        }

        //Seguir o padrão de divide and conquer, descobrir a metade da lista
        int middle = ninjaList.size() / 2;

        //Criar duas novas listas, cada uma para uma metade da lista
        LinkedList<Ninja> leftList = new LinkedList<>();
        LinkedList<Ninja> rightList = new LinkedList<>();

        //Preencher a lista Esquerda, com a primeira metade da lista
        for (int i = 0; i < middle; i++) {
            leftList.add(ninjaList.get(i));
        }

        //Preencher a lista Direita, com a segunda metade da lista
        for (int i = middle; i < ninjaList.size(); i++) {
            rightList.add(ninjaList.get(i));
        }

        //Chamar recursivamente para chegar a listas de apenas 1 elemento
        leftList = MergeSort(leftList, comparator);
        rightList = MergeSort(rightList, comparator);

        /*Chamar o metodo de Merge, que irá combinar as listas
          Ordenando-as com base no comparador passado*/
        return Merge(leftList, rightList, comparator);
    }

    public static LinkedList<Ninja> Merge (LinkedList<Ninja> leftList, LinkedList<Ninja> rightList, Comparator<Ninja> comparator) {

        //criando uma lista de resultado
        LinkedList<Ninja> resultList = new LinkedList<>();

        //enquanto nenhuma das listas forem vazias
        while (!leftList.isEmpty() && !rightList.isEmpty()) {
            /*se a idade da lista da esquerda for menor que da direita
            add o valor da esquerda na lista resultado*/
            if (comparator.compare(leftList.peek(), rightList.peek()) <= 0) {
                resultList.add(leftList.poll());//o pool() vai remover o valor da lista da esquerda e devolver esse valor
                //como argumento para o métodoo add(), adicionando assim o valor na resultList
            } else {
                // se não, add o valor da lista da direita na resultList
                resultList.add(rightList.poll());
            }
        }

        //add os valores que sobraram nos array, quando a condição do while acima não
        //foi mais atendida, ou seja, um dos dois arrays ficou ainda com elementos dentro dele
        //eles precisam entrar na resultList tbm
        resultList.addAll(leftList);
        resultList.addAll(rightList);

        return resultList; //retorno a resultList ordenada

    }
}
