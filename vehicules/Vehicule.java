package dojo.vehicules;

public class Vehicule {
    int nombreRoues ;

    public Vehicule(int nombreRoues) {
        this.nombreRoues = nombreRoues;
    }

    @Override
    public String toString() {
        return "Bonjour, je suis un véhicule à " +  nombreRoues + " roues";
    }

//    public void direBonjour () {
//        System.out.println("Bonjour, je suis un véhicule à " +  nombreRoues + " roues") ;
//    }

}
