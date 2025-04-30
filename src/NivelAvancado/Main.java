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
        //FILTER filtragem por vila
        ninjas.stream()
                .filter(ninja -> ninja.getVillage().equals("Konoha"))
                .forEach(System.out::println);


        //SORTED Ordenação
        ninjas.stream()
                .sorted((ninja1, ninja2) -> Integer.compare(ninja1.getAge(), ninja2.getAge()))
                .forEach(System.out::println);

        ninjas.stream()
                .sorted((ninja1, ninja2) -> ninja1.getName().compareTo(ninja2.getName()))
                .forEach(System.out::println);

        //MAP - Mostrar e mapear um atributo
        ninjas.stream()
                .map(Ninja::getName)
                .forEach(System.out::println);

        ninjas.stream()
                .map(Ninja::getAge)
                .forEach(System.out::println);

        //MAX - Fitlrar por ninja mais velho
        Ninja ninjaMaisVelho = ninjas.stream()
                .max((ninja1, ninja2) -> Integer.compare(ninja1.getAge(), ninja2.getAge()))
                .orElse(null);

        System.out.println(ninjaMaisVelho);
    }
}
