package dojo;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class MainGestionCollection1 {
    public static void main(String[] args) {
        HashSet<String> maListeBoum = new HashSet<>();
        maListeBoum.add("Toto");
        maListeBoum.add("hopla");
        System.out.println("maListeBoum = " + maListeBoum);

        List<String> maListe2 = new LinkedList<>();
        maListe2.add("Zout");
        maListe2.add("Arrghhh");
        maListe2.add("Brian");

        System.out.println("maListe2 = " + maListe2);
        Collections.sort(maListe2);

        System.out.println("maListe2 = " + maListe2);

//        exo 4 : treeset
//        exo 5 : lsie dans une liste
    }
}
