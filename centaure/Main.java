package dojo.centaure;

public class Main {
    public static void main(String[] args) {
        Centaure.compteur = 10;
        System.out.println("Centaure.compteur = " + Centaure.compteur);

        Centaure monCentaure = new Centaure();

        System.out.println("Centaure.compteur = " + Centaure.compteur);
        System.out.println("monCentaure.compteur = " + monCentaure.compteur);



    }
}
