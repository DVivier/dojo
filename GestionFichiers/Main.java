package dojo.GestionFichiers;

//import javafx.scene.shape.Path;

//import java.nio.file.Files;
//import java.nio.file.Paths;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import static java.nio.file.Files.readAllLines;

public class Main {
    public static void main(String[] args) {
        String chemin="src/dojo/Lyrics.txt";
        List<String> lignes = new ArrayList<>() ;
        UnFichier monFichier = new UnFichier(chemin);
        boolean existe = monFichier.ouvrirFichier();
        if (existe) {
            try {
                lignes = monFichier.lireToutLeFichier();
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(666);
            }

            for (int i = 0; i < lignes.size(); i++) {
                UneLigne ligne = new UneLigne(lignes.get(i));
                String[] tableauMots = ligne.DecouperLigneEnMots();
                if (tableauMots != null) {
                    monFichier.comptabiliserTableauMots(tableauMots);
                }
            }
//            monFichier.AfficherLesMotsAvecOccurence();

            try {
                monFichier.ecrireResultat();
            } catch (IOException e) {
                e.printStackTrace();
            }

//              Récupération du ou des mots les plus utlisés
            List<String> listeMotPlusUtlise = new ArrayList<>();
            listeMotPlusUtlise = monFichier.obtenirMotPlusUtilise();
            System.out.println(listeMotPlusUtlise);
        }
    }
}
