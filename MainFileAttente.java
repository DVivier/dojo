package dojo;

import java.util.PriorityQueue;
import java.util.Queue;

public class MainFileAttente {


    public static void main(String[] args) {
        Queue<Voyageur> fileAttente = new PriorityQueue<>(new ComparateurFileAttenteSurClassePuisNumSiege());

        fileAttente.add(new Voyageur(1, 250, "Voyageur B01", TypeDeClasse.BUSINESS));
        fileAttente.add(new Voyageur(8, 135, "Voyageur E03", TypeDeClasse.ECO));
        fileAttente.add(new Voyageur(3, 251, "Voyageur B03", TypeDeClasse.BUSINESS));
        fileAttente.add(new Voyageur(4, 55, "Voyageur P01", TypeDeClasse.PREMIERE));
        fileAttente.add(new Voyageur(6, 130, "Voyageur E01", TypeDeClasse.ECO));
        fileAttente.add(new Voyageur(7, 110, "Voyageur E02", TypeDeClasse.ECO));
        fileAttente.add(new Voyageur(2, 252, "Voyageur B02", TypeDeClasse.BUSINESS));
        fileAttente.add(new Voyageur(9, 105, "Voyageur E04", TypeDeClasse.ECO));
        fileAttente.add(new Voyageur(5, 51, "Voyageur P02", TypeDeClasse.PREMIERE));

        int nombreVoyageurs = fileAttente.size();
        for (int i = 0; i < nombreVoyageurs; i++) {
        System.out.println(fileAttente.remove());

        }

    }
}
