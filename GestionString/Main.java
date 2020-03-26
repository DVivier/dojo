package dojo.GestionString;

public class Main {

    public static void main(String[] args) {
        String enMinuscule = "minusa et encore a ";

        System.out.println(enMinuscule.toUpperCase());

        int debut = -1;
        int nombreDeA = 0;
//        System.out.println(enMinuscule.indexOf('a'));
        debut = enMinuscule.indexOf('a');
        while (debut > -1) {
            nombreDeA++;
            debut = enMinuscule.indexOf('a', debut + 1);
        }
        System.out.println("Nombre de a : " + nombreDeA);

        System.out.println(enMinuscule.replace('a', '4'));

//  Exercice 4
        String chaineReduite;
        chaineReduite = enMinuscule.substring(0, 4) + enMinuscule.substring(10, enMinuscule.length());
        System.out.println("chaineReduite = " + chaineReduite);

//  Exercice 5
        int unEntier = 808;
        String unEntierEnString = "";
        unEntierEnString = String.valueOf(unEntier);
//                .toString(unEntier);
        System.out.println("unEntierEnString = " + unEntierEnString);

        unEntierEnString = Integer.toString(unEntier);
        System.out.println("unEntierEnString = " + unEntierEnString);

//  Exercice 6
        unEntierEnString = "303";
        int unStringEnUnEntier;
        unStringEnUnEntier = Integer.valueOf(unEntierEnString);  // renvoi un Integer, pas un int
        System.out.println("unStringEnUnEntier = " + unStringEnUnEntier);
        unStringEnUnEntier = Integer.parseInt(unEntierEnString);  // renvoi un int
        System.out.println("unStringEnUnEntier = " + unStringEnUnEntier);


    }

}
