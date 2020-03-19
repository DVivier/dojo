package dojo;

public enum TypeDeClasse {
    BUSINESS (2),
    PREMIERE (1),
    ECO (3);

    private final int priorite;

    TypeDeClasse(int priorite) {
        this.priorite = priorite;
    }

    public int getPriorite() {
        return priorite;
    }
}
