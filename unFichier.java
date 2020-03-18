package dojo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class unFichier {
    private static Path cheminDuFichier;
    private static String nomFichierEntree;
    private static String nomFichierEntreeAvecChemin;
    private int nombreLigne;
    private static List<String> lignes = new ArrayList<>();
    private static Path leFichier;
    private static Map<String, Integer> mapOccurences = new TreeMap<>();
    private static Map<String, Integer> mapOccurencesMinuscules = new TreeMap<>();

    public unFichier(String nomFichierEntreeAvecChemin) {
        this.nomFichierEntreeAvecChemin = nomFichierEntreeAvecChemin;
    }

    public static boolean OuvrirFichier() {
        leFichier = Paths.get(nomFichierEntreeAvecChemin);
        cheminDuFichier = leFichier.getParent();
        return Files.exists(leFichier);
    }

    public static List LireToutLeFichier() throws IOException {
        lignes = Files.readAllLines(leFichier);

        return lignes;
    }

    public void ComptabiliserTableauMots(String[] tableauMots) {

        for (int i = 0; i < tableauMots.length; i++) {
            String cle = tableauMots[i];
            if (mapOccurences.containsKey(cle)) {
                int compteur = mapOccurences.get(cle);
                mapOccurences.replace(cle, compteur + 1);
                compteur++;
            } else {
                mapOccurences.put(cle, 1);
            }
            cle = tableauMots[i].toLowerCase();
            if (mapOccurencesMinuscules.containsKey(cle)) {
                int compteur = mapOccurencesMinuscules.get(cle);
                mapOccurencesMinuscules.replace(cle, compteur + 1);
                compteur++;
            } else {
                mapOccurencesMinuscules.put(cle, 1);
            }
        }
    }

    public void AfficherLesMotsAvecOccurence() {
        for (String cle : mapOccurences.keySet()) {
            System.out.print(cle);
            System.out.print(" : ");
            System.out.println(mapOccurences.get(cle));

        }
    }

    public void EcrireResultat() throws IOException {
        EcrireResultatUnFichier(mapOccurences, "resultat");
        EcrireResultatUnFichier(mapOccurencesMinuscules, "resultat_min");
    }

    private void EcrireResultatUnFichier(Map<String, Integer> mapOccurences, String resultat) throws IOException {
        ArrayList<String> lignesSortie = new ArrayList<>();
        for (String cle : mapOccurences.keySet()) {
            lignesSortie.add(cle + " : " + mapOccurences.get(cle));
//            System.out.print(" : ");
//            System.out.println(mapOccurences.get(cle));
        }
        int compteur = 1;
        Path leFichierEnSortie = Paths.get(cheminDuFichier + "\\" + resultat + compteur + ".txt");
        boolean fichierSortieExiste = Files.exists(leFichierEnSortie);
        while (fichierSortieExiste) {
            compteur++;
            leFichierEnSortie = Paths.get(cheminDuFichier + "\\" + resultat + compteur + ".txt");
            fichierSortieExiste = Files.exists(leFichierEnSortie);

        }
        Files.createFile(leFichierEnSortie);
        Files.write(leFichierEnSortie, lignesSortie, StandardOpenOption.APPEND);
    }


//    public static void ComptabiliserTableauMots(String[] tableauMots){
//
//    }
}
