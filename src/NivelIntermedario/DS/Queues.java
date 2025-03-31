package NivelIntermedario.DS;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {

        // Primeiro a entrar é o primeiro a sair
        Queue<String> ninjasQueue = new LinkedList<>();

        ninjasQueue.add("Naruto Uzumaki");
        ninjasQueue.add("Sasuke Uchiha");
        ninjasQueue.add("Itachi Uchiha");
        ninjasQueue.add("Kakashi Hatake");
        ninjasQueue.add("Sakura Haruno");

        System.out.println("Queue inicial: " + ninjasQueue);

        // Ele vai tirar o primeiro ninja da fila, ou seja o primeiro adicionado
        ninjasQueue.poll();

        System.out.println("Queue atualizada: " + ninjasQueue);

        // Vai ver quem é o primeiro na fila
        System.out.println("Queue HEAD: " + ninjasQueue.peek());

        // Verificar se está vazio
        if (ninjasQueue.isEmpty()) {
            System.out.println("A fila está vazia");
        } else {
            System.out.println("Essa porra ta lotada!");
        }



    }
}
