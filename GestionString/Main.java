package dojo.GestionString;

public class Main {

    public static void main(String[] args) {
        String enMinuscule = "minusa et encore a ";

//  Exercice 1 : transforme une chaîne de caracteres en majuscule
        System.out.println(enMinuscule.toUpperCase());

//  Exercice 2 : compte le nombre de "a" dans une phrase
        int debut = -1;
        int nombreDeA = 0;
//        System.out.println(enMinuscule.indexOf('a'));
        debut = enMinuscule.indexOf('a');
        while (debut > -1) {
            nombreDeA++;
            debut = enMinuscule.indexOf('a', debut + 1);
        }
        System.out.println("Nombre de a : " + nombreDeA);

//  Exercice 3 : transforme tout les "a" en "4"
        System.out.println(enMinuscule.replace('a', '4'));

//  Exercice 4 : supprime les caractères compris entre le 5eme et le 10eme caractères
        String chaineReduite;
        chaineReduite = enMinuscule.substring(0, 4) + enMinuscule.substring(10, enMinuscule.length());
        System.out.println("chaineReduite = " + chaineReduite);

//  Exercice 5 : transforme un entier en String
        int unEntier = 808;
        String unEntierEnString = "";
        unEntierEnString = String.valueOf(unEntier);
//                .toString(unEntier);
        System.out.println("unEntierEnString = " + unEntierEnString);

        unEntierEnString = Integer.toString(unEntier);
        System.out.println("unEntierEnString = " + unEntierEnString);

//  Exercice 6 : transforme un String en entier
        unEntierEnString = "303";
        int unStringEnUnEntier;
        unStringEnUnEntier = Integer.valueOf(unEntierEnString);  // renvoi un Integer, pas un int
        System.out.println("unStringEnUnEntier = " + unStringEnUnEntier);
        unStringEnUnEntier = Integer.parseInt(unEntierEnString);  // renvoi un int
        System.out.println("unStringEnUnEntier = " + unStringEnUnEntier);


    }

}
