package NivelAvancado;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", "Konoha", 17));
        ninjas.add(new Ninja("Sakura Haruno", "Konoha", 17));
        ninjas.add(new Ninja("Sasuke Uchiha", "Konoha", 18));
        ninjas.add(new Ninja("Minato Namikaze", "Konoha", 40));
        ninjas.add(new Ninja("Gaara", "Suna", 18));

        //.stream - ordenação, filtros e etc
        //filtragem por vila
        ninjas.stream()
                .filter(ninja -> ninja.getVillage().equals("Konoha "))
                .forEach(System.out::println);


        //Ordenação
        ninjas.stream()
                .sorted((ninja1, ninja2) -> Integer.compare(ninja1.getAge(), ninja2.getAge()))
                .forEach(System.out::println);

        ninjas.stream()
                .sorted((ninja1, ninja2) -> ninja1.getName().compareTo(ninja2.getName()))
                .forEach(System.out::println);
    }
}
