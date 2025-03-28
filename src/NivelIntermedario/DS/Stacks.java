package NivelIntermedario.DS;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        //O ultimo elemento a entrar, é o primeiro a sair
        Stack<String> ninjaStack = new Stack<>();

        ninjaStack.push("Naruto Uzumaki");
        ninjaStack.push("Sasuke Uchiha");
        ninjaStack.push("Sakura Haruno"); //coloca novos elementos na stack
        System.out.println("Minha Stack atual: " + ninjaStack);

        System.out.println("------------------");

        ninjaStack.pop(); //retira o elemento no topo da lista (Ultimo elemento inserido)
        System.out.println("Minha Stack atualizada: " + ninjaStack);
        System.out.println("Elemento atual no topo da minha Stack: " + ninjaStack.peek()); //Seleciona o elemento no topo da Stack

        System.out.println("------------------");

        ninjaStack.push("Kakashi Hatake");
        System.out.println("Minha Stack atualizada: " + ninjaStack);
        System.out.println("Elemento atual no topo da minha Stack: " + ninjaStack.peek());

        System.out.println("------------------");

        ninjaStack.pop();
        System.out.println("Minha Stack atualizada: " + ninjaStack);
        System.out.println("Tamanho da Stack atual: " + ninjaStack.size()); //Mostra o tamanho da Stack (Numero de elementos)

    }
}
