package dojo;

//import javafx.scene.shape.Path;

//import java.nio.file.Files;
//import java.nio.file.Paths;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import static java.nio.file.Files.readAllLines;

public class MainGestionFichiers {
    public static void GestionFichiers(String chemin) {
        List<String> lignes = new ArrayList<>() ;
        unFichier monFichier = new unFichier(chemin);
        boolean existe = monFichier.OuvrirFichier();
        if (existe) {
            try {
                lignes = monFichier.LireToutLeFichier();
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(666);
            }

            for (int i = 0; i < lignes.size(); i++) {
                UneLigne ligne = new UneLigne(lignes.get(i));
                String[] tableauMots = ligne.DecouperLigneEnMots();
                if (tableauMots != null) {
                    monFichier.ComptabiliserTableauMots(tableauMots);
                }
            }
//            monFichier.AfficherLesMotsAvecOccurence();

            try {
                monFichier.EcrireResultat();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}
