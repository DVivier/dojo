package dojo.dames.tests;
import com.sun.org.apache.xpath.internal.operations.Bool;
import dojo.dames.main.Echiquier;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.AssertEquals.*;
//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


public class EchiquierTest {

    private  Echiquier echiquier;

    @BeforeEach
    void beforeAll() {
        echiquier = new Echiquier(8,8);
    }

//    Placement

    @Test
    void placerUnePieceSurEchiquier_DoitRetourner_Ok() throws Exception{
        Boolean placementEffectue = echiquier.placerPion(1,1);

        assertThat(placementEffectue).isTrue();

    }

    @Test
    void placerUnePieceEnDehorsDeEchiquier_DoitRetourner_Exception() {

        assertThrows(
                Exception.class,
                () -> echiquier.placerPion(10,1), "erreur"
        );
    }


//    Case
    @Test
    void interrogerUneCaseLibre_DoitRetourner_QueLaCaseEstLibre() {
        Boolean caseEstLibre = echiquier.interrogerCase(1,1);

        assertThat(caseEstLibre).isTrue();
    }

    @Test
    void interrogerUneCaseOccupee_DoitRetourner_QueLaCaseEstNonLibre() throws Exception {
        echiquier.placerPion(1,1);

        Boolean caseEstLibre = echiquier.interrogerCase(1,1);

        assertThat(caseEstLibre).isFalse();
    }


//    Ligne
    @Test
    void interrogerUneLigneLibre_DoitRetourner_QueLaLigneEstLibre() throws Exception {
        echiquier.placerPion(1,2);

        Boolean ligneEstLibre = echiquier.interrogerLigne(1);

        assertThat(ligneEstLibre).isTrue();
    }


    @Test
    void interrogerUneLigneNonLibre_DoitRetourner_QueLaLigneEstNonLibre() throws Exception {
        echiquier.placerPion(1,1);

        Boolean ligneEstLibre = echiquier.interrogerLigne(1);

        assertThat(ligneEstLibre).isFalse();
    }


//    Colonne
    @Test
    void interrogerUneColonneLibre_DoitRetourner_QueLaColonneEstLibre() throws Exception {
        echiquier.placerPion(2,1);

        Boolean ligneEstLibre = echiquier.interrogerColonne(1);

        assertThat(ligneEstLibre).isTrue();
    }

    @Test
    void interrogerUneColonneNonLibre_DoitRetourner_QueLaColonneEstNonLibre() throws Exception {
        echiquier.placerPion(1,1);

        Boolean ligneEstLibre = echiquier.interrogerColonne(1);

        assertThat(ligneEstLibre).isFalse();
    }


//    Diagonale Ascendante Gauche->Droite
//    @Test
//    void interrogerUneDiagonaleAscendanteGaucheDroiteLibre_DoitRetourner_QueLaDiagonaleEstLibre() throws Exception {
//        echiquier.placerPion(2,1);
//
//        Boolean diagonaleEstLibre = echiquier.interrogerDiagonaleAscendateGaucheDroite(1,1);
//
//        assertThat(diagonaleEstLibre).isTrue();
//    }


    @Disabled
    @Test
    void placerUnPionSurUneCaseVide_DoitRetourner_Ok() throws Exception{
        Boolean placementEffectue = echiquier.placerPion(1,1);

        assertThat(placementEffectue).isTrue();
    }

    @Test
    @Disabled
    void placerUnPionSurUneCaseOccupee_DoitRetourner_Ko() throws Exception{
        echiquier.placerPion(1,1);

        Boolean placementEffectue = echiquier.placerPion(1,1);

        assertThat(placementEffectue).isFalse();
    }

}
