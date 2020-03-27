package dojo.vehicules;

public class Train extends Vehicule {
    public Train() {
        super(100);
    }

//    @Override
//    public void direBonjour() {
//        super.direBonjour();
//        System.out.println("Tchoochooooo");
//    }

    @Override
    public String toString() {
        return super.toString() + "Tchoochooooo";
    }
}
