package dojo.dictionnaire;

public class Dictionnaire {
    public static String nomDico ;
    private static int instance = 0;
    private static Dictionnaire leSeulDico;

//    private Dictionnaire() {
//        nomDico = "Larousse" ;
//        ;
//    }

    public static Dictionnaire getInstance(){
//        if (instance ==0 ) {
//            leSeulDico = new Dictionnaire();
//            instance = 1;
//            return leSeulDico;
//        }
        if (leSeulDico==null) {
            leSeulDico = new Dictionnaire();
            System.out.println("Création du dictionnaire");
            return leSeulDico;
        }
        System.out.println("Renvoi du dictionnaire");
        System.out.println(leSeulDico);
        return leSeulDico ;
    }
}
