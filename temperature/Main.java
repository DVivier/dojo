package dojo.temperature;

public class Main {
    public static void main(String[] args) {


        Maison uneMaison = new Maison() ;

        System.out.println(uneMaison);
        for (int i = 0; i < 25 ; i++) {
            uneMaison.chauffer();
        }
        System.out.println(uneMaison);

        System.out.println("");

        Datacenter unDatacenter = new Datacenter();
        System.out.println(unDatacenter);
        for (int i = 0; i < 25 ; i++) {
            unDatacenter.refroidir();
        }
        System.out.println(unDatacenter);

        System.out.println("");

        for (int i = 0; i < 30 ; i++) {
            uneMaison.refroidir();
        }
        System.out.println(uneMaison);
    }
}

