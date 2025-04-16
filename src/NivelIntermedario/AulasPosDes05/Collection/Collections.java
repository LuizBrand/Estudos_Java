package NivelIntermedario.AulasPosDes05.Collection;

import java.util.*;

public class Collections {
    public static void main(String[] args) {

        //ArrayList, LinkedList, Stack são classes
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        //Queue é uma Interface
        Queue<String> queue = new LinkedList<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        linkedList.add("Naruto");
        System.out.println(linkedList);



/*        linkedList.add("Naruto Uzumaki");
        linkedList.add("Sasuke Uchiha");
        linkedList.add("Sakura Haruno");

        System.out.println(linkedList);

        linkedList.add(1, "Kakashi Hatake");
        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);*/

    }
}
