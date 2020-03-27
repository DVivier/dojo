package dojo.semaine;

public enum Semaine {
    LUNDI (false,":-)"),
    MARDI(false,":-o"),
    MERCREDI(false,":-o"),
    JEUDI(false,":-o"),
    VENDREDI(true,";-o)"),
    SAMEDI(true,":-)"),
    DIMANCHE(true,":-)");

    private final boolean weekend;
    private final String smiley;


    Semaine(boolean weekend, String smiley) {
        this.weekend = weekend;
        this.smiley = smiley;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public String getSmiley() {
        return smiley;
    }
}
