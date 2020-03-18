package dojo;

public class MainGestionException {
    public static void main(String[] args) {
// Calcul sans exception
        System.out.println(" 0! = " + calculFactoriel(0));
        System.out.println(" 4! = " + calculFactoriel(4));
        System.out.println(" 6! = " + calculFactoriel(6));
        System.out.println(" 10! = " + calculFactoriel(10));
        System.out.println(" 19! = " + calculFactoriel(19));
        System.out.println(" 30! = " + calculFactoriel(30));
        System.out.println(" 50! = " + calculFactoriel(50));
        System.out.println(" 20! = " + calculFactoriel(20));

        System.out.println("---------");

// 1er appel (5)  : pas de dépassement
// 2nd appel (24) : dépassement
        try {
            System.out.println("calculFactorielAvecException(5) = " + calculFactorielAvecExceptionSiDepassement(5));
            System.out.println("calculFactorielAvecException(24) = " + calculFactorielAvecExceptionSiDepassement(24));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println("---------");

// Appel avec 24 pour dépassement
        try {
            calculFactorielAvecRuntimeExceptionSiDepassement(24);
        } catch (Exception f) {
            System.out.println(f.getMessage());
        }

        System.out.println("---------");


// Appel avec 24 pour dépassement
        try {
            calculFactorielAvecDoubleException(24);
        } catch (Exception g) {
            System.out.println(g.getMessage());
        }

        System.out.println("---------");
// Appel avec -5 pour Exception car nombre négatif
        try {
            calculFactorielAvecDoubleException(-5);
        } catch (Exception g) {
            System.out.println(g.getMessage());
        }

        System.out.println("---------");
        try {
            diviseBrut(0);
//        } catch (Exception h) {
//            System.out.println(h.fillInStackTrace() + " " +  h.getMessage());
        } catch (ArithmeticException h) {
            System.out.println("Erreur arithmetic " + h.getMessage());
        }

        try {
            diviseBrut(0);
        } catch (Exception h) {
            System.out.println(h.getMessage());
        }
    }

    public static int calculFactoriel(int a) {
        int factoriel = 1;
        for (int i = a; i > 0; i--) {
            factoriel = factoriel * i;
        }
        return factoriel;


    }

    public static void diviseBrut(int x) {
        System.out.println("Resultat : " + (5 / x));
    }

    //
    public static int calculFactorielAvecExceptionSiDepassement(int a) throws Exception {
        int factoriel = 1;
        for (int i = a; i > 0; i--) {
            factoriel = factoriel * i;
            if (factoriel < 0) {
                throw (new Exception("Factoriel : " + i));
//                throw (new FactiorelleExceptionIncoherence("Factoriel : " + i));
            }
        }
        return factoriel;


    }

    //
    public static int calculFactorielAvecRuntimeExceptionSiDepassement(int a) {
        int factoriel = 1;
        for (int i = a; i > 0; i--) {
            factoriel = factoriel * i;
            if (factoriel < 0) {
                throw (new RuntimeException("Factoriel : " + i));
            }
        }
        return factoriel;


    }

    // Exception si négatif en entrée et si dépassement
    public static int calculFactorielAvecDoubleException(int a) throws Exception {
        if (a < 0) {
            throw (new FactorielleExceptionNegatif());
        }
        int factoriel = 1;
        for (int i = a; i > 0; i--) {
            factoriel = factoriel * i;
            if (factoriel < 0) {
                throw (new FactiorelleExceptionIncoherence());
            }
        }
        return factoriel;


    }
}
