package dojo.semaine;

public class Main {
    public static void main(String[] args) {
        Semaine[] tableauDeSemaine = Semaine.values();
        System.out.println("tableauDeSemaine.length = " + tableauDeSemaine.length);
        for (int i = 0; i < tableauDeSemaine.length; i++) {
            String libelleWeekend = " n'est pas un jour du weekend ";
            if (tableauDeSemaine[i].isWeekend()) {
                libelleWeekend =  " est un jour du weekend ";
            }
            System.out.println(tableauDeSemaine[i].name() + libelleWeekend + "et donc je suis " + tableauDeSemaine[i].getSmiley());

        }

        System.out.println();
        if (Semaine.JEUDI.ordinal()<Semaine.SAMEDI.ordinal()) {
            System.out.println("Jeudi est bien avant Samedi");
        }
        System.out.println("Semaine.values() = " + Semaine.values());
    }
}
