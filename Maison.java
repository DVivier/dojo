package dojo;

public class Maison implements AvecChauffage, AvecClimatisation {
    float temperature ;

    @Override
    public void chauffer() {
        temperature++;
    }

    @Override
    public String toString() {
        if (temperature >= 2 || temperature <= -2 ) {
            return "La température de cette maison est fixée à " + temperature + " degrés";
        }
        return "La température de cette maison est fixée à " + temperature + " degré";

    }

    @Override
    public void refroidir() {
        temperature-- ;

    }
}
