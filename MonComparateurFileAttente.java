package dojo;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class MonComparateurFileAttente implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Voyageur voyageur1 = (Voyageur) o1;
        Voyageur voyageur2 = (Voyageur) o2;
//        System.out.println("comparator");
        Integer ordinal1 = voyageur1.typeDeClasse.ordinal();
        Integer ordinal2 = voyageur2.typeDeClasse.ordinal();
        int resultatCompareClasse = ordinal1.compareTo(ordinal2);

//        System.out.print(voyageur1.typeDeClasse.ordinal());
//        System.out.println(voyageur2.typeDeClasse.ordinal());
//        System.out.println(ordinal1.compareTo(ordinal2));

        if (resultatCompareClasse == 0) {
            Integer numero1 = voyageur1.numeroSiege;
            Integer numero2 = voyageur2.numeroSiege;
            return numero1.compareTo(numero2);
        }
        return (resultatCompareClasse);

//        return ((Voyageur) o2).compareTo((Voyageur) o1);
//        System.out.print(voyageur1.typeDeClasse.ordinal());
//        System.out.print(" / ");
//        System.out.println(voyageur2.typeDeClasse.ordinal());
//        if (voyageur1.typeDeClasse.ordinal() == voyageur2.typeDeClasse.ordinal()) {
//            return 0;
//        }
//        if (voyageur1.typeDeClasse.ordinal() < voyageur2.typeDeClasse.ordinal()) {
//            return -1;
//        }
////        if (voyageur1.typeDeClasse.ordinal() < voyageur2.typeDeClasse.ordinal()) {
//            return 1;
////        }
//
//        //        return 0;
    }

    @Override
    public Comparator reversed() {
        return null;
    }

    @Override
    public Comparator thenComparing(Comparator other) {
        return null;
    }

    @Override
    public Comparator thenComparingInt(ToIntFunction keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparingLong(ToLongFunction keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparingDouble(ToDoubleFunction keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparing(Function keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparing(Function keyExtractor, Comparator keyComparator) {
        return null;
    }
}
