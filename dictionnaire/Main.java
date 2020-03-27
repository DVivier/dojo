package dojo.dictionnaire;

public class Main {
    //    public static Dictionnaire monDico = new Dictionnaire();
    public static void main(String[] args) {
        Dictionnaire monDico = Dictionnaire.getInstance();
        System.out.println("monDico.NOMDICO = " + monDico.nomDico + " à l'adresse " + monDico);
        Dictionnaire monDico2 = Dictionnaire.getInstance();
        System.out.println("monDico2.NOMDICO = " + monDico2.nomDico+ " à l'adresse " + monDico2);

    }
}