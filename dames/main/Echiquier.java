package dojo.dames.main;

public class Echiquier {
    String [] [] echiquier ;
//    String [] [] echiquier = new String[8][9];
    int nbColonnes;
    int nbLignes;

    public Echiquier(int nbColonnes, int nbLignes) {
        this.nbColonnes = nbColonnes;
        this.nbLignes = nbLignes;
        this.echiquier = new String[nbColonnes][nbLignes];
        this.initEchiquier();
    }

    private void initEchiquier() {
        for (int i = 0; i < nbColonnes; i++) {
            for (int j = 0; j < nbLignes; j++) {
                this.echiquier[i][j] = " ";

            }

        }
    }

    public Boolean interrogerCase(int numeroColonne, int numeroLigne) {
        if (this.echiquier[numeroColonne][numeroLigne] == " ") {
            return true;
        }
        return false;
    }

    public Boolean placerPion(int numeroColonne, int numeroLigne) throws Exception {
//        Boolean estLibre = this.interrogerCase(numeroColonne,numeroColonne);
//        if (estLibre) {
//        if (numeroColonne > )
            this.echiquier[numeroColonne][numeroLigne]="X";
            return true;
//        }
//        return false;
    }

    public Boolean interrogerLigne(int numeroLigne) {
        for (int i = 0; i < this.nbColonnes; i++) {
            if (echiquier[i][numeroLigne]=="X") {
                return false;
            }
        }
        return true;
    }

    public Boolean interrogerColonne(int numeroColonne) {
        for (int i = 0; i < this.nbLignes; i++) {
            if (echiquier[numeroColonne][i]=="X") {
                return false;
            }
        }
        return true;
    }

    public Boolean interrogerDiagonaleAscendateGaucheDroite(int numeroColonne, int numeroLigne) {
//        if (numer)
//        for (int i = numeroColonne+1; i < nbColonnes ; i++) {
//            for (int j = numeroLigne+1; j < nbLignes; j++) {
//                if (! interrogerCase(i,j)) {
                    return false;
//                }
//
//            }
//        }
    }
}
