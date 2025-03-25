package NivelIntermedario.DS;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {

        List<String> arrayListNinjas = new java.util.ArrayList<>();

        arrayListNinjas.add("Naruto Uzumaki");
        arrayListNinjas.add("Sasuke Uchiha");
        arrayListNinjas.add("Sakura Haruno");
        arrayListNinjas.add("Kakashi Hatake");

        System.out.println("arrayListNinjas = " + arrayListNinjas);
        
        arrayListNinjas.remove("Sakura Haruno");

        System.out.println("arrayListNinjas = " + arrayListNinjas);

        for (String ninja : arrayListNinjas) {
            System.out.println(ninja);
        }

    }
}
