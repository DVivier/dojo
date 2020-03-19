package dojo;

public class Voyageur {
//    public class Voyageur implements Comparable{
    int numero;
    int numeroSiege;
    String nom;
    TypeDeClasse typeDeClasse;

    public Voyageur(int numero, int numeroSiege, String nom, TypeDeClasse typeDeClasse) {
        this.numero = numero;
        this.numeroSiege = numeroSiege;
        this.nom = nom;
        this.typeDeClasse = typeDeClasse;

    }



    @Override
    public String toString() {
        return "Voyageur{" +
                "numero=" + numero +
                ", numeroSiege=" + numeroSiege +
                ", nom='" + nom + '\'' +
                ", typeDeClasse=" + typeDeClasse +
                '}';
    }


}
