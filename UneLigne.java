package dojo;

public class UneLigne {
    private static String ligne;
    private int longueur;
//    ligne = ligne.trim();
//                if (ligne.length()>0) {
//        System.out.println(ligne + " /// " + ligne.length());
//        ligne = ligne.replace(", ", " ");
//        ligne = ligne.replace(". ", " ");
//        ligne = ligne.replace(",", " ");
//        ligne = ligne.replace(".", " ");
////                    ligne = ligne.replace(". ", " ");
//        System.out.println(ligne);
//        String[] tableauMots = ligne.split(" ");
//        for (int i = 0; i < tableauMots.length; i++) {
////                        boolean trouve = tableauOccurences.containsValue(tableauMots[i]);
//            if (tableauOccurences.containsKey(tableauMots[i])) {
//                int compteur = tableauOccurences.get(tableauMots[i]);
//                tableauOccurences.replace(tableauMots[i],compteur++);
//                System.out.println("trouvé");
//            } else {
//                tableauOccurences.put(tableauMots[i], 1);
//            }
//        }
////                    System.out.println("toto = " + toto.length);
//        System.out.println("tableauOccurences = " + tableauOccurences);
//    }

    public UneLigne(String ligne) {
        this.ligne = ligne;
    }

    public static String[] DecouperLigneEnMots() {
        ligne = ligne.trim();
        if (ligne.length() > 0) {
//            System.out.println(ligne + " /// " + ligne.length());
            ligne = ligne.replace(", ", " ");
            ligne = ligne.replace(". ", " ");
            ligne = ligne.replace(",", " ");
            ligne = ligne.replace(".", " ");
//                    ligne = ligne.replace(". ", " ");
//            System.out.println(ligne);
            return ligne.split(" ");
        }
        return null;
    }
}
