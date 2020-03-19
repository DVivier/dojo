package dojo;

public class Voyageur implements Comparable{
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
    public int compareTo(Object o) {
        Voyageur voyageur1 = (Voyageur) o;

//        System.out.println("compareTo");
        if (voyageur1.typeDeClasse.ordinal() == this.typeDeClasse.ordinal()) {
            System.out.print("pareil : ");
            System.out.print(voyageur1.nom);
            System.out.print("-");
            System.out.print(voyageur1.typeDeClasse.ordinal() + "/" + this.typeDeClasse.ordinal());
            System.out.print("-");
            System.out.println(this.nom);
            System.out.println();
            return 0;
        }
        if (voyageur1.typeDeClasse.ordinal() < this.typeDeClasse.ordinal()) {
            System.out.print("inf : ");
            System.out.print(voyageur1.nom);
            System.out.print("-");
            System.out.print(voyageur1.typeDeClasse.ordinal() + "/" + this.typeDeClasse.ordinal());
            System.out.print("-");
            System.out.println(this.nom);
            System.out.println();
            return 1;
        }
//        if (voyageur1.typeDeClasse.ordinal() < this.typeDeClasse.ordinal()) {
            System.out.print("sup : ");
            System.out.print(voyageur1.nom);
            System.out.print("-");
            System.out.print(voyageur1.typeDeClasse.ordinal() + "/" + this.typeDeClasse.ordinal());
            System.out.print("-");
            System.out.println(this.nom);
            System.out.println();
            return -1;
//        }
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
