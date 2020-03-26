package dojo.temperature;

public class Datacenter implements AvecClimatisation {
    float temperature ;

    @Override
    public void refroidir() {
        temperature = 20.0F ;
    }

    @Override
    public String toString() {
        if (temperature==0.0F) {
            return "La climatisation de ce Datacenter n'est pas activée";
        }
        return "La climatisation de ce Datacenter est régulée à "  + temperature + " degrés";
    }
}
