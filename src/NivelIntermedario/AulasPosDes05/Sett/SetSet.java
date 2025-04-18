package NivelIntermedario.AulasPosDes05.Sett;

import java.util.*;

public class SetSet {
    public static void main(String[] args) {

        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto");
        ninjasList.add("Sasuke");
        ninjasList.add("Sakura");
        ninjasList.add("Kakashi");
        ninjasList.add("Shikamaru");
        ninjasList.add("Naruto");
        System.out.println("Ninjas List: " + ninjasList);

        //HashSet quando não tem duplicação de um mesmo valor
        Set<String> ninjasSet = new HashSet<>(ninjasList);
        System.out.println("Ninjas HashSet: " + ninjasSet);

        //TreeSet quando não tem duplicação e quero organizar em ordem
        Set<String> ninjaasTreeSet = new TreeSet<>(ninjasList);
        System.out.println("Ninjas TreeSet: " + ninjaasTreeSet);

        //LinkedHashSet não tem duplicação, vai manter na ordem de inserção
        Set<String> ninjasLinkedHashSet = new LinkedHashSet<>(ninjasList);
        System.out.println("Ninjas LinkedHashSet: " + ninjasLinkedHashSet);


    }
}
